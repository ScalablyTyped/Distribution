package typings.polished.fontFaceConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceConfiguration extends js.Object {
  var fileFormats: js.UndefOr[js.Array[String]] = js.native
  var fontDisplay: js.UndefOr[String] = js.native
  var fontFamily: String = js.native
  var fontFeatureSettings: js.UndefOr[String] = js.native
  var fontFilePath: js.UndefOr[String] = js.native
  var fontStretch: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[String] = js.native
  var fontVariant: js.UndefOr[String] = js.native
  var fontVariationSettings: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var formatHint: js.UndefOr[Boolean] = js.native
  var localFonts: js.UndefOr[js.Array[String]] = js.native
  var unicodeRange: js.UndefOr[String] = js.native
}

object FontFaceConfiguration {
  @scala.inline
  def apply(fontFamily: String): FontFaceConfiguration = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceConfiguration]
  }
  @scala.inline
  implicit class FontFaceConfigurationOps[Self <: FontFaceConfiguration] (val x: Self) extends AnyVal {
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
    def setFileFormatsVarargs(value: String*): Self = this.set("fileFormats", js.Array(value :_*))
    @scala.inline
    def setFileFormats(value: js.Array[String]): Self = this.set("fileFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileFormats: Self = this.set("fileFormats", js.undefined)
    @scala.inline
    def setFontDisplay(value: String): Self = this.set("fontDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontDisplay: Self = this.set("fontDisplay", js.undefined)
    @scala.inline
    def setFontFeatureSettings(value: String): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    @scala.inline
    def setFontFilePath(value: String): Self = this.set("fontFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFilePath: Self = this.set("fontFilePath", js.undefined)
    @scala.inline
    def setFontStretch(value: String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontVariationSettings(value: String): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setFormatHint(value: Boolean): Self = this.set("formatHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatHint: Self = this.set("formatHint", js.undefined)
    @scala.inline
    def setLocalFontsVarargs(value: String*): Self = this.set("localFonts", js.Array(value :_*))
    @scala.inline
    def setLocalFonts(value: js.Array[String]): Self = this.set("localFonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalFonts: Self = this.set("localFonts", js.undefined)
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
  }
  
}

