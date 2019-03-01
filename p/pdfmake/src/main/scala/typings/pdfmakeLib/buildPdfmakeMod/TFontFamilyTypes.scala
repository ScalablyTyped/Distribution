package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFontFamilyTypes extends js.Object {
  var bold: js.UndefOr[java.lang.String] = js.undefined
  var bolditalics: js.UndefOr[java.lang.String] = js.undefined
  var italics: js.UndefOr[java.lang.String] = js.undefined
  var normal: js.UndefOr[java.lang.String] = js.undefined
}

object TFontFamilyTypes {
  @scala.inline
  def apply(
    bold: java.lang.String = null,
    bolditalics: java.lang.String = null,
    italics: java.lang.String = null,
    normal: java.lang.String = null
  ): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold)
    if (bolditalics != null) __obj.updateDynamic("bolditalics")(bolditalics)
    if (italics != null) __obj.updateDynamic("italics")(italics)
    if (normal != null) __obj.updateDynamic("normal")(normal)
    __obj.asInstanceOf[TFontFamilyTypes]
  }
}

