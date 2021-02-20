package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.PDFKit.PDFDocumentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit", JSImport.Namespace)
  @js.native
  class ^ () extends PDFDocument {
    def this(options: PDFDocumentOptions) = this()
  }
  @JSImport("pdfkit", JSImport.Namespace)
  @js.native
  val ^ : PDFDocument = js.native
  
  type _To = PDFDocument
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PDFDocument = ^
}
