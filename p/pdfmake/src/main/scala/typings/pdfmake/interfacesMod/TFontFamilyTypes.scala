package typings.pdfmake.interfacesMod

import typings.pdfkit.PDFKit.Mixins.PDFFontSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TFontFamilyTypes extends js.Object {
  var bold: js.UndefOr[PDFFontSource] = js.undefined
  var bolditalics: js.UndefOr[PDFFontSource] = js.undefined
  var italics: js.UndefOr[PDFFontSource] = js.undefined
  var normal: js.UndefOr[PDFFontSource] = js.undefined
}

object TFontFamilyTypes {
  @scala.inline
  def apply(
    bold: PDFFontSource = null,
    bolditalics: PDFFontSource = null,
    italics: PDFFontSource = null,
    normal: PDFFontSource = null
  ): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (bolditalics != null) __obj.updateDynamic("bolditalics")(bolditalics.asInstanceOf[js.Any])
    if (italics != null) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TFontFamilyTypes]
  }
}

