package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientConfigurationMod {
  
  trait LinearGradientConfiguration extends StObject {
    
    var colorStops: js.Array[String]
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var toDirection: js.UndefOr[String] = js.undefined
  }
  object LinearGradientConfiguration {
    
    inline def apply(colorStops: js.Array[String]): LinearGradientConfiguration = {
      val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientConfiguration]
    }
    
    extension [Self <: LinearGradientConfiguration](x: Self) {
      
      inline def setColorStops(value: js.Array[String]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      inline def setColorStopsVarargs(value: String*): Self = StObject.set(x, "colorStops", js.Array(value*))
      
      inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setToDirection(value: String): Self = StObject.set(x, "toDirection", value.asInstanceOf[js.Any])
      
      inline def setToDirectionUndefined: Self = StObject.set(x, "toDirection", js.undefined)
    }
  }
}
