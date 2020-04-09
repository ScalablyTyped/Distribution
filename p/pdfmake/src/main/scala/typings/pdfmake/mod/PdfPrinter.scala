package typings.pdfmake.mod

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfmake.interfacesMod.BufferOptions
import typings.pdfmake.interfacesMod.TDocumentDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 'export =' syntax forbids any other export.
// tslint:disable-next-line: strict-export-declare-modifiers
@js.native
trait PdfPrinter extends js.Object {
  def createPdfKitDocument(docDefinition: TDocumentDefinitions): PDFDocument = js.native
  def createPdfKitDocument(docDefinition: TDocumentDefinitions, options: BufferOptions): PDFDocument = js.native
}

