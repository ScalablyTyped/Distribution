package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Annots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
trait PDFKitReference extends js.Object {
  var chunks: js.Array[_]
  var compress: Boolean
  var data: Annots
  var deflate: js.Any
  var document: PDFDocument
  var gen: Double
  var id: Double
  var uncompressedLength: Double
  def end(chunk: js.Any): Unit
  def initDeflate(): Unit
  def write(chunk: js.Any): Unit
}

object PDFKitReference {
  @scala.inline
  def apply(
    chunks: js.Array[_],
    compress: Boolean,
    data: Annots,
    deflate: js.Any,
    document: PDFDocument,
    end: js.Any => Unit,
    gen: Double,
    id: Double,
    initDeflate: () => Unit,
    uncompressedLength: Double,
    write: js.Any => Unit
  ): PDFKitReference = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deflate = deflate.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), gen = gen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initDeflate = js.Any.fromFunction0(initDeflate), uncompressedLength = uncompressedLength.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PDFKitReference]
  }
}

