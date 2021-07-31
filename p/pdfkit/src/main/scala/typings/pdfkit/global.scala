package typings.pdfkit

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.anon.Annots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PDFKit {
    
    /** PDFReference - represents a reference to another object in the PDF object heirarchy */
    @JSGlobal("PDFKit.PDFKitReference")
    @js.native
    class PDFKitReference protected ()
      extends StObject
         with typings.pdfkit.PDFKit.PDFKitReference {
      def this(document: PDFDocument, id: Double, data: js.Object) = this()
      
      /* CompleteClass */
      var chunks: js.Array[js.Any] = js.native
      
      /* CompleteClass */
      var compress: Boolean = js.native
      
      /* CompleteClass */
      var data: Annots = js.native
      
      /* CompleteClass */
      var deflate: js.Any = js.native
      
      /* CompleteClass */
      var document: PDFDocument = js.native
      
      /* CompleteClass */
      override def end(chunk: js.Any): Unit = js.native
      
      /* CompleteClass */
      var gen: Double = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      override def initDeflate(): Unit = js.native
      
      /* CompleteClass */
      var uncompressedLength: Double = js.native
      
      /* CompleteClass */
      override def write(chunk: js.Any): Unit = js.native
    }
  }
}
