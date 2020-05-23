package typings.pdfkit

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.anon.Annots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object PDFKit extends js.Object {
    /** PDFReference - represents a reference to another object in the PDF object heirarchy */
    @js.native
    class PDFKitReference protected ()
      extends typings.pdfkit.PDFKit.PDFKitReference {
      def this(document: PDFDocument, id: Double, data: js.Object) = this()
      /* CompleteClass */
      override var chunks: js.Array[_] = js.native
      /* CompleteClass */
      override var compress: Boolean = js.native
      /* CompleteClass */
      override var data: Annots = js.native
      /* CompleteClass */
      override var deflate: js.Any = js.native
      /* CompleteClass */
      override var document: PDFDocument = js.native
      /* CompleteClass */
      override var gen: Double = js.native
      /* CompleteClass */
      override var id: Double = js.native
      /* CompleteClass */
      override var uncompressedLength: Double = js.native
      /* CompleteClass */
      override def end(chunk: js.Any): Unit = js.native
      /* CompleteClass */
      override def initDeflate(): Unit = js.native
      /* CompleteClass */
      override def write(chunk: js.Any): Unit = js.native
    }
    
  }
  
}

