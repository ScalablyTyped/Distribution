package typings.openlayers.mod.olx

import typings.openlayers.mod.Size
import typings.openlayers.mod.olx.animation.AnimateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object view {
  
  trait FitOptions extends StObject {
    
    var callback: js.UndefOr[AnimateCallback] = js.undefined
    
    var constrainResolution: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minResolution: js.UndefOr[Double] = js.undefined
    
    var nearest: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object FitOptions {
    
    inline def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    extension [Self <: FitOptions](x: Self) {
      
      inline def setCallback(value: /* completed */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      inline def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      inline def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
