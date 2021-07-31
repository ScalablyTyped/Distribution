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
    
    @scala.inline
    def apply(): FitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitOptions]
    }
    
    @scala.inline
    implicit class FitOptionsMutableBuilder[Self <: FitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* completed */ Boolean => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinResolution(value: Double): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolutionUndefined: Self = StObject.set(x, "minResolution", js.undefined)
      
      @scala.inline
      def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
