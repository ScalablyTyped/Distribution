package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait pdfMakeStatic extends js.Object {
  var fonts: ScalablyTyped.runtime.StringDictionary[TFontFamilyTypes]
  var vfs: TFontFamily
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf
}

