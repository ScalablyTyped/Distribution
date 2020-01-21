package typings.pdfmake.mod

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
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (bolditalics != null) __obj.updateDynamic("bolditalics")(bolditalics.asInstanceOf[js.Any])
    if (italics != null) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFontFamilyTypes]
  }
}

