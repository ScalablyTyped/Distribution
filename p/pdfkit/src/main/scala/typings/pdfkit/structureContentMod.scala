package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.PDFStructureContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structureContentMod extends Shortcut {
  
  @JSImport("pdfkit/js/structure_content", JSImport.Namespace)
  @js.native
  val ^ : PDFStructureContent = js.native
  
  type _To = PDFStructureContent
  
  /* This means you don't have to write `^`, but can instead just say `structureContentMod.foo` */
  override def _to: PDFStructureContent = ^
}
