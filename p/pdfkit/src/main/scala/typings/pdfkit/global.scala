package typings.pdfkit

import typings.pdfkit.PDFKit.PDFDocument
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
    }
    
  }
  
}

