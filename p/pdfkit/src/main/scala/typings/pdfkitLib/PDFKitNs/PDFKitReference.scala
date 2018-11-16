package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
@JSGlobal("PDFKit.PDFKitReference")
@js.native
class PDFKitReference protected () extends js.Object {
  def this(document: PDFDocument, id: scala.Double, data: js.Object) = this()
  var chunks: js.Array[_] = js.native
  var compress: scala.Boolean = js.native
  var data: pdfkitLib.Anon_Pattern = js.native
  var deflate: js.Any = js.native
  var document: PDFDocument = js.native
  var gen: scala.Double = js.native
  var id: scala.Double = js.native
  var uncompressedLength: scala.Double = js.native
  def end(chunk: js.Any): scala.Unit = js.native
  def initDeflate(): scala.Unit = js.native
  def write(chunk: js.Any): scala.Unit = js.native
}

