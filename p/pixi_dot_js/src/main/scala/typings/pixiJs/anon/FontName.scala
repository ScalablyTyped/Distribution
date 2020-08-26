package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontName extends js.Object {
  var align: js.UndefOr[String] = js.native
  var fontName: String = js.native
  var fontSize: js.UndefOr[Double] = js.native
  var letterSpacing: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var tint: js.UndefOr[Double] = js.native
}

object FontName {
  @scala.inline
  def apply(fontName: String): FontName = {
    val __obj = js.Dynamic.literal(fontName = fontName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontName]
  }
  @scala.inline
  implicit class FontNameOps[Self <: FontName] (val x: Self) extends AnyVal {
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
    def setFontName(value: String): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setTint(value: Double): Self = this.set("tint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
  }
  
}

