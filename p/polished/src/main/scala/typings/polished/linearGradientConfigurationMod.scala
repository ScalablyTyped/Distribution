package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientConfigurationMod {
  
  @js.native
  trait LinearGradientConfiguration extends StObject {
    
    var colorStops: js.Array[String] = js.native
    
    var fallback: js.UndefOr[String] = js.native
    
    var toDirection: js.UndefOr[String] = js.native
  }
  object LinearGradientConfiguration {
    
    @scala.inline
    def apply(colorStops: js.Array[String]): LinearGradientConfiguration = {
      val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientConfiguration]
    }
    
    @scala.inline
    implicit class LinearGradientConfigurationMutableBuilder[Self <: LinearGradientConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorStops(value: js.Array[String]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorStopsVarargs(value: String*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setToDirection(value: String): Self = StObject.set(x, "toDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDirectionUndefined: Self = StObject.set(x, "toDirection", js.undefined)
    }
  }
}
