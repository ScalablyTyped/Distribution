package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfkit.PDFKit.PDFDocumentOptions
import typings.pdfkit.PDFKit.PDFKitReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceMod extends Shortcut {
  
  @JSImport("pdfkit/js/reference", JSImport.Namespace)
  @js.native
  val ^ : PDFKitReference = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/reference", "document")
  @js.native
  class document () extends PDFDocument {
    def this(options: PDFDocumentOptions) = this()
  }
  
  type _To = PDFKitReference
  
  /* This means you don't have to write `^`, but can instead just say `referenceMod.foo` */
  override def _to: PDFKitReference = ^
}
