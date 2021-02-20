package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.Mixins.PDFImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/images", JSImport.Namespace)
  @js.native
  val ^ : PDFImage = js.native
  
  type _To = PDFImage
  
  /* This means you don't have to write `^`, but can instead just say `imagesMod.foo` */
  override def _to: PDFImage = ^
}
