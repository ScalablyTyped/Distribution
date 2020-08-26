package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var boxSizing: String = js.native
  var color: String = js.native
  var display: String = js.native
  var maxWidth: String = js.native
  var padding: Double = js.native
  var whiteSpace: String = js.native
}

object Color {
  @scala.inline
  def apply(
    boxSizing: String,
    color: String,
    display: String,
    maxWidth: String,
    padding: Double,
    whiteSpace: String
  ): Color = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setBoxSizing(value: String): Self = this.set("boxSizing", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteSpace(value: String): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
  }
  
}

