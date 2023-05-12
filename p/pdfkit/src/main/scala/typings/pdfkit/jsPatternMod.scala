package typings.pdfkit

import typings.pdfkit.PDFKit.Mixins.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPatternMod {
  
  @JSImport("pdfkit/js/pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/pattern", "PDFTilingPattern")
  @js.native
  open class PDFTilingPattern protected ()
    extends StObject
       with typings.pdfkit.PDFKit.PDFTilingPattern {
    def this(document: Any, bbox: BoundingBox, xStep: Double, yStep: Double, stream: String) = this()
  }
  @JSImport("pdfkit/js/pattern", "PDFTilingPattern")
  @js.native
  def PDFTilingPattern: typings.pdfkit.PDFKit.PDFTilingPattern = js.native
  inline def PDFTilingPattern_=(x: typings.pdfkit.PDFKit.PDFTilingPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFTilingPattern")(x.asInstanceOf[js.Any])
}
