package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRectangleOptions extends js.Object {
  var center: js.UndefOr[Vector2D] = js.native
  var corner1: js.UndefOr[Vector2D] = js.native
  var corner2: js.UndefOr[Vector2D] = js.native
  var radius: js.UndefOr[Vector2D] = js.native
}

object IRectangleOptions {
  @scala.inline
  def apply(): IRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRectangleOptions]
  }
  @scala.inline
  implicit class IRectangleOptionsOps[Self <: IRectangleOptions] (val x: Self) extends AnyVal {
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
    def setCenter(value: Vector2D): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setCorner1(value: Vector2D): Self = this.set("corner1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner1: Self = this.set("corner1", js.undefined)
    @scala.inline
    def setCorner2(value: Vector2D): Self = this.set("corner2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner2: Self = this.set("corner2", js.undefined)
    @scala.inline
    def setRadius(value: Vector2D): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
  
}

