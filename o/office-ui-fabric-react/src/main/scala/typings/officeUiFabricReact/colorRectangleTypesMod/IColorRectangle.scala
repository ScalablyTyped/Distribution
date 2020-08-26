package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorRectangle extends js.Object {
  /** Currently selected color. */
  var color: IColor = js.native
}

object IColorRectangle {
  @scala.inline
  def apply(color: IColor): IColorRectangle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangle]
  }
  @scala.inline
  implicit class IColorRectangleOps[Self <: IColorRectangle] (val x: Self) extends AnyVal {
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
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
  }
  
}

