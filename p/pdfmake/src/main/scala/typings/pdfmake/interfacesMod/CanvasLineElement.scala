package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasLineElement extends StObject {
  
  var dash: js.UndefOr[Length] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object CanvasLineElement {
  
  inline def apply(): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasLineElement]
  }
  
  extension [Self <: CanvasLineElement](x: Self) {
    
    inline def setDash(value: Length): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
