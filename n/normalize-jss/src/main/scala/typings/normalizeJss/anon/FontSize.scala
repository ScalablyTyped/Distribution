package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSize extends js.Object {
  var fontFamily: String = js.native
  var fontSize: String = js.native
}

object FontSize {
  @scala.inline
  def apply(fontFamily: String, fontSize: String): FontSize = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
  @scala.inline
  implicit class FontSizeOps[Self <: FontSize] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
  }
  
}

