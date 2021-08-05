package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animation {
  
  type AnimateCallback = js.Function1[/* completed */ Boolean, Unit]
  
  /**
    * Animation options. Multiple animations can be run in series by passing
    * multiple options objects. To run multiple animations in parallel, call
    * the method multiple times. An optional callback can be provided as a
    * final argument. The callback will be called with a boolean indicating
    * whether the animation completed without being cancelled.
    */
  trait AnimateOptions extends StObject {
    
    var anchor: js.UndefOr[Coordinate_] = js.undefined
    
    var center: js.UndefOr[Coordinate_] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var resolution: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
  }
  object AnimateOptions {
    
    inline def apply(): AnimateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimateOptions]
    }
    
    extension [Self <: AnimateOptions](x: Self) {
      
      inline def setAnchor(value: Coordinate_): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setCenter(value: Coordinate_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait BounceOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var resolution: Double
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object BounceOptions {
    
    inline def apply(resolution: Double): BounceOptions = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceOptions]
    }
    
    extension [Self <: BounceOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait PanOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var source: Coordinate_
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object PanOptions {
    
    inline def apply(source: Coordinate_): PanOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanOptions]
    }
    
    extension [Self <: PanOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setSource(value: Coordinate_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait RotateOptions extends StObject {
    
    var anchor: js.UndefOr[Coordinate_] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object RotateOptions {
    
    inline def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    extension [Self <: RotateOptions](x: Self) {
      
      inline def setAnchor(value: Coordinate_): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait ZoomOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var resolution: Double
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(resolution: Double): ZoomOptions = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomOptions]
    }
    
    extension [Self <: ZoomOptions](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
