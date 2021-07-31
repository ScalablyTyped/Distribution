package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radialGradientConfigurationMod {
  
  trait RadialGradientConfiguration extends StObject {
    
    var colorStops: js.Array[String]
    
    var extent: js.UndefOr[String] = js.undefined
    
    var fallback: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
  }
  object RadialGradientConfiguration {
    
    @scala.inline
    def apply(colorStops: js.Array[String]): RadialGradientConfiguration = {
      val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadialGradientConfiguration]
    }
    
    @scala.inline
    implicit class RadialGradientConfigurationMutableBuilder[Self <: RadialGradientConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorStops(value: js.Array[String]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorStopsVarargs(value: String*): Self = StObject.set(x, "colorStops", js.Array(value :_*))
      
      @scala.inline
      def setExtent(value: String): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
}
