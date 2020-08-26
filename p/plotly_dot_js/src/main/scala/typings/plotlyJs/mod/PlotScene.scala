package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotScene extends js.Object {
  var center: Point = js.native
  var eye: Point = js.native
  var up: Point = js.native
}

object PlotScene {
  @scala.inline
  def apply(center: Point, eye: Point, up: Point): PlotScene = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotScene]
  }
  @scala.inline
  implicit class PlotSceneOps[Self <: PlotScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCenter(value: Point): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setEye(value: Point): Self = this.set("eye", value.asInstanceOf[js.Any])
    @scala.inline
    def setUp(value: Point): Self = this.set("up", value.asInstanceOf[js.Any])
  }
  
}

