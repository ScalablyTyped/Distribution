package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radius extends js.Object {
  var radius: Double = js.native
}

object Radius {
  @scala.inline
  def apply(radius: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  @scala.inline
  implicit class RadiusOps[Self <: Radius] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
  }
  
}

