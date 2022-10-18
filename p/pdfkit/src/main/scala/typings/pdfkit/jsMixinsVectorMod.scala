package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.Mixins.PDFVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMixinsVectorMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/vector", JSImport.Namespace)
  @js.native
  val ^ : PDFVector = js.native
  
  type _To = PDFVector
  
  /* This means you don't have to write `^`, but can instead just say `jsMixinsVectorMod.foo` */
  override def _to: PDFVector = ^
}
