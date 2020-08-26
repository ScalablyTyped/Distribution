package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Annots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
@js.native
trait PDFKitReference extends js.Object {
  var chunks: js.Array[_] = js.native
  var compress: Boolean = js.native
  var data: Annots = js.native
  var deflate: js.Any = js.native
  var document: PDFDocument = js.native
  var gen: Double = js.native
  var id: Double = js.native
  var uncompressedLength: Double = js.native
  def end(chunk: js.Any): Unit = js.native
  def initDeflate(): Unit = js.native
  def write(chunk: js.Any): Unit = js.native
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
  @scala.inline
  implicit class PDFKitReferenceOps[Self <: PDFKitReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChunksVarargs(value: js.Any*): Self = this.set("chunks", js.Array(value :_*))
    @scala.inline
    def setChunks(value: js.Array[_]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: Annots): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeflate(value: js.Any): Self = this.set("deflate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: PDFDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: js.Any => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    @scala.inline
    def setGen(value: Double): Self = this.set("gen", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitDeflate(value: () => Unit): Self = this.set("initDeflate", js.Any.fromFunction0(value))
    @scala.inline
    def setUncompressedLength(value: Double): Self = this.set("uncompressedLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: js.Any => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

