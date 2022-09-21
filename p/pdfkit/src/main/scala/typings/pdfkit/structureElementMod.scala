package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.PDFStructureElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structureElementMod extends Shortcut {
  
  @JSImport("pdfkit/js/structure_element", JSImport.Namespace)
  @js.native
  val ^ : PDFStructureElement = js.native
  
  type _To = PDFStructureElement
  
  /* This means you don't have to write `^`, but can instead just say `structureElementMod.foo` */
  override def _to: PDFStructureElement = ^
}
