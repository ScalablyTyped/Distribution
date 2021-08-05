package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFilledElement extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var linearGradient: js.UndefOr[js.Array[String]] = js.undefined
}
object CanvasFilledElement {
  
  inline def apply(): CanvasFilledElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasFilledElement]
  }
  
  extension [Self <: CanvasFilledElement](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLinearGradient(value: js.Array[String]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientUndefined: Self = StObject.set(x, "linearGradient", js.undefined)
    
    inline def setLinearGradientVarargs(value: String*): Self = StObject.set(x, "linearGradient", js.Array(value :_*))
  }
}
