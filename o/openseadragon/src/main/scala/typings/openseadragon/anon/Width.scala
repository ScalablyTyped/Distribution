package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Width extends js.Object {
  var Height: String = js.native
  var Width: String = js.native
}

object Width {
  @scala.inline
  def apply(Height: String, Width: String): Width = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  @scala.inline
  implicit class WidthOps[Self <: Width] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
  
}

