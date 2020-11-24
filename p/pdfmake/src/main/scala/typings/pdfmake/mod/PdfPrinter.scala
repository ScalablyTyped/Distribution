package typings.pdfmake.mod

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfmake.interfacesMod.BufferOptions
import typings.pdfmake.interfacesMod.TDocumentDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfPrinter extends js.Object {
  
  def createPdfKitDocument(docDefinition: TDocumentDefinitions): PDFDocument = js.native
  def createPdfKitDocument(docDefinition: TDocumentDefinitions, options: BufferOptions): PDFDocument = js.native
}
