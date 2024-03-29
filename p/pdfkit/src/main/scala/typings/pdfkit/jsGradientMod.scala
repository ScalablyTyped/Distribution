package typings.pdfkit

import typings.pdfkit.PDFKit.PDFRadialGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsGradientMod {
  
  @JSImport("pdfkit/js/gradient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  open class PDFGradient protected ()
    extends StObject
       with typings.pdfkit.PDFKit.PDFGradient {
    def this(document: Any) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFGradient")
  @js.native
  def PDFGradient: typings.pdfkit.PDFKit.PDFGradient = js.native
  inline def PDFGradient_=(x: typings.pdfkit.PDFKit.PDFGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  open class PDFLinearGradient protected ()
    extends StObject
       with typings.pdfkit.PDFKit.PDFLinearGradient {
    def this(document: Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFLinearGradient")
  @js.native
  def PDFLinearGradient: typings.pdfkit.PDFKit.PDFLinearGradient = js.native
  inline def PDFLinearGradient_=(x: typings.pdfkit.PDFKit.PDFLinearGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFLinearGradient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  open class PDFRadialGradiant protected ()
    extends StObject
       with PDFRadialGradient {
    def this(document: Any, x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  @JSImport("pdfkit/js/gradient", "PDFRadialGradiant")
  @js.native
  def PDFRadialGradiant: PDFRadialGradient = js.native
  inline def PDFRadialGradiant_=(x: PDFRadialGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDFRadialGradiant")(x.asInstanceOf[js.Any])
}
