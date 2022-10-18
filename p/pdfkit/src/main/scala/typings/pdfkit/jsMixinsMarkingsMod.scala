package typings.pdfkit

import org.scalablytyped.runtime.Shortcut
import typings.pdfkit.PDFKit.Mixins.PDFMarking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsMixinsMarkingsMod extends Shortcut {
  
  @JSImport("pdfkit/js/mixins/markings", JSImport.Namespace)
  @js.native
  val ^ : PDFMarking = js.native
  
  type _To = PDFMarking
  
  /* This means you don't have to write `^`, but can instead just say `jsMixinsMarkingsMod.foo` */
  override def _to: PDFMarking = ^
}
