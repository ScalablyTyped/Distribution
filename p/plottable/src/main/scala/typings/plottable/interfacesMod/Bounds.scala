package typings.plottable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var bottomRight: Point = js.native
  var topLeft: Point = js.native
}

object Bounds {
  @scala.inline
  def apply(bottomRight: Point, topLeft: Point): Bounds = {
    val __obj = js.Dynamic.literal(bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
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
    def setBottomRight(value: Point): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopLeft(value: Point): Self = this.set("topLeft", value.asInstanceOf[js.Any])
  }
  
}

