package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesRadialGradientConfigurationMod {
  
  trait RadialGradientConfiguration extends StObject {
    
    var colorStops: js.Array[String]
    
    var extent: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
  }
  object RadialGradientConfiguration {
    
    inline def apply(colorStops: js.Array[String]): RadialGradientConfiguration = {
      val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGradientConfiguration]
    }
    
    extension [Self <: RadialGradientConfiguration](x: Self) {
      
      inline def setColorStops(value: js.Array[String]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      inline def setColorStopsVarargs(value: String*): Self = StObject.set(x, "colorStops", js.Array(value*))
      
      inline def setExtent(value: String): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
}
