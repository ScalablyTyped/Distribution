package typings.pdfkit.PDFKitNs

import typings.pdfkit.Anon_Annots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
@JSGlobal("PDFKit.PDFKitReference")
@js.native
class PDFKitReference protected () extends js.Object {
  def this(document: PDFDocument, id: Double, data: js.Object) = this()
  var chunks: js.Array[_] = js.native
  var compress: Boolean = js.native
  var data: Anon_Annots = js.native
  var deflate: js.Any = js.native
  var document: PDFDocument = js.native
  var gen: Double = js.native
  var id: Double = js.native
  var uncompressedLength: Double = js.native
  def end(chunk: js.Any): Unit = js.native
  def initDeflate(): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
}

