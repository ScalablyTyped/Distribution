package typings.pdfmake.buildPdfmakeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pdfMakeStatic extends js.Object {
  var fonts: StringDictionary[TFontFamilyTypes]
  var vfs: TFontFamily
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf
}

object pdfMakeStatic {
  @scala.inline
  def apply(
    createPdf: TDocumentDefinitions => TCreatedPdf,
    fonts: StringDictionary[TFontFamilyTypes],
    vfs: TFontFamily
  ): pdfMakeStatic = {
    val __obj = js.Dynamic.literal(createPdf = js.Any.fromFunction1(createPdf), fonts = fonts.asInstanceOf[js.Any], vfs = vfs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pdfMakeStatic]
  }
}

