package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pdfmake/build/pdfmake", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var pdfMake: pdfMakeStatic = js.native
  var vfs: TFontFamily = js.native
  def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf = js.native
  def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: js.Any): TCreatedPdf = js.native
  def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: js.Any, fonts: js.Any): TCreatedPdf = js.native
  def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: js.Any, fonts: js.Any, vfs: js.Any): TCreatedPdf = js.native
}

