package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFRadialGradient
  extends StObject
     with PDFGradient
     with Instantiable5[
      /* document */ Any, 
      /* x1 */ Double, 
      /* y1 */ Double, 
      /* x2 */ Double, 
      /* y2 */ Double, 
      PDFRadialGradient
    ] {
  
  def opacityGradient(): PDFRadialGradient = js.native
  
  def shader(fn: js.Function0[Any]): Any = js.native
}
