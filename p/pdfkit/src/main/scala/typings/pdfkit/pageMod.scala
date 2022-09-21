package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.PDFKit.PDFDocumentOptions
import typings.pdfkit.PDFKit.PDFPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod extends Shortcut {
  
  @JSImport("pdfkit/js/page", JSImport.Namespace)
  @js.native
  val ^ : PDFPage = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/page", "document")
  @js.native
  open class document ()
    extends StObject
       with PDFDocument {
    def this(options: PDFDocumentOptions) = this()
  }
  
  type _To = PDFPage
  
  /* This means you don't have to write `^`, but can instead just say `pageMod.foo` */
  override def _to: PDFPage = ^
}
