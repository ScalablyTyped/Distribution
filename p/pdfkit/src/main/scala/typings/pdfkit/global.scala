package typings.pdfkit

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.PDFKit.PDFStructureElementChild
import typings.pdfkit.anon.Actual
import typings.pdfkit.anon.Annots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object PDFKit {
    
    /** PDFReference - represents a reference to another object in the PDF object heirarchy */
    @JSGlobal("PDFKit.PDFKitReference")
    @js.native
    open class PDFKitReference protected ()
      extends StObject
         with typings.pdfkit.PDFKit.PDFKitReference {
      def this(document: PDFDocument, id: Double, data: js.Object) = this()
      
      /* CompleteClass */
      var chunks: js.Array[Any] = js.native
      
      /* CompleteClass */
      var compress: Boolean = js.native
      
      /* CompleteClass */
      var data: Annots = js.native
      
      /* CompleteClass */
      var deflate: Any = js.native
      
      /* CompleteClass */
      var document: PDFDocument = js.native
      
      /* CompleteClass */
      override def end(chunk: Any): Unit = js.native
      
      /* CompleteClass */
      var gen: Double = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      override def initDeflate(): Unit = js.native
      
      /* CompleteClass */
      var uncompressedLength: Double = js.native
      
      /* CompleteClass */
      override def write(chunk: Any): Unit = js.native
    }
    
    /** PDFStructureContent */
    @JSGlobal("PDFKit.PDFStructureContent")
    @js.native
    open class PDFStructureContent protected ()
      extends StObject
         with typings.pdfkit.PDFKit.PDFStructureContent {
      def this(pageRef: typings.pdfkit.PDFKit.PDFKitReference, mcid: Double) = this()
      
      /* CompleteClass */
      override def push(structContent: typings.pdfkit.PDFKit.PDFStructureContent): Unit = js.native
    }
    
    /** PDFStructureElement */
    @JSGlobal("PDFKit.PDFStructureElement")
    @js.native
    open class PDFStructureElement protected ()
      extends StObject
         with typings.pdfkit.PDFKit.PDFStructureElement {
      def this(document: PDFDocument, `type`: String) = this()
      def this(document: PDFDocument, `type`: String, children: js.Array[PDFStructureElementChild]) = this()
      def this(document: PDFDocument, `type`: String, children: PDFStructureElementChild) = this()
      def this(document: PDFDocument, `type`: String, options: Actual) = this()
      def this(document: PDFDocument, `type`: String, options: Unit, children: js.Array[PDFStructureElementChild]) = this()
      def this(document: PDFDocument, `type`: String, options: Unit, children: PDFStructureElementChild) = this()
      def this(
        document: PDFDocument,
        `type`: String,
        options: Actual,
        children: js.Array[PDFStructureElementChild]
      ) = this()
      def this(document: PDFDocument, `type`: String, options: Actual, children: PDFStructureElementChild) = this()
      
      /* CompleteClass */
      override def add(el: PDFStructureElementChild): typings.pdfkit.PDFKit.PDFStructureElement = js.native
      
      /* CompleteClass */
      override def end(): Unit = js.native
      
      /* CompleteClass */
      override def setAttached(): Unit = js.native
      
      /* CompleteClass */
      override def setParent(parentRef: typings.pdfkit.PDFKit.PDFKitReference): Unit = js.native
    }
  }
}
