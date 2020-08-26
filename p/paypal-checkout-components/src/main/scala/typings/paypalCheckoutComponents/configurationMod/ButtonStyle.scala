package typings.paypalCheckoutComponents.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonStyle extends js.Object {
  var color: ButtonColorOption = js.native
  var label: ButtonLabelOption = js.native
  var shape: ButtonShapeOption = js.native
  var size: ButtonSizeOption = js.native
  var tagline: Boolean = js.native
}

object ButtonStyle {
  @scala.inline
  def apply(
    color: ButtonColorOption,
    label: ButtonLabelOption,
    shape: ButtonShapeOption,
    size: ButtonSizeOption,
    tagline: Boolean
  ): ButtonStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tagline = tagline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyle]
  }
  @scala.inline
  implicit class ButtonStyleOps[Self <: ButtonStyle] (val x: Self) extends AnyVal {
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
    def setColor(value: ButtonColorOption): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: ButtonLabelOption): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: ButtonShapeOption): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: ButtonSizeOption): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagline(value: Boolean): Self = this.set("tagline", value.asInstanceOf[js.Any])
  }
  
}

