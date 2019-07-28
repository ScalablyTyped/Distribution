package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFontFamilyTypes extends js.Object {
  var bold: js.UndefOr[String] = js.undefined
  var bolditalics: js.UndefOr[String] = js.undefined
  var italics: js.UndefOr[String] = js.undefined
  var normal: js.UndefOr[String] = js.undefined
}

object TFontFamilyTypes {
  @scala.inline
  def apply(bold: String = null, bolditalics: String = null, italics: String = null, normal: String = null): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (bolditalics != null) __obj.updateDynamic("bolditalics")(bolditalics)
    if (italics != null) __obj.updateDynamic("italics")(italics)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[TFontFamilyTypes]
  }
}

