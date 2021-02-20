package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.Mixins.PDFColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/color", JSImport.Namespace)
  @js.native
  val ^ : PDFColor = js.native
  
  type _To = PDFColor
  
  /* This means you don't have to write `^`, but can instead just say `colorMod.foo` */
  override def _to: PDFColor = ^
}
