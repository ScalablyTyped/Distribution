package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pdfMakeStatic extends js.Object {
  var fonts: org.scalablytyped.runtime.StringDictionary[TFontFamilyTypes]
  var vfs: TFontFamily
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf
}

object pdfMakeStatic {
  @scala.inline
  def apply(
    createPdf: js.Function1[TDocumentDefinitions, TCreatedPdf],
    fonts: org.scalablytyped.runtime.StringDictionary[TFontFamilyTypes],
    vfs: TFontFamily
  ): pdfMakeStatic = {
    val __obj = js.Dynamic.literal(createPdf = createPdf, fonts = fonts, vfs = vfs)
  
    __obj.asInstanceOf[pdfMakeStatic]
  }
}

