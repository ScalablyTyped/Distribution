package typings.pdfobject

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("pdfobject", JSImport.Namespace)
  @js.native
  val ^ : PDFObject = js.native
  
  @js.native
  trait PDFObject extends StObject {
    
    def embed(url: String): HTMLElement = js.native
    def embed(url: String, target: js.Any): HTMLElement = js.native
    def embed(url: String, target: js.Any, options: js.Any): HTMLElement = js.native
    def embed(url: String, target: Unit, options: js.Any): HTMLElement = js.native
    
    var pdfobjectversion: String = js.native
    
    var supportsPDFs: Boolean = js.native
  }
  
  type _To = PDFObject
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PDFObject = ^
}
