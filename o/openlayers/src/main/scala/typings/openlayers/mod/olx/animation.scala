package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @js.native
  trait AnimateOptions extends StObject {
    
    var anchor: js.UndefOr[Coordinate_] = js.native
    
    var center: js.UndefOr[Coordinate_] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
    
    var resolution: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
  }
  object AnimateOptions {
    
    @scala.inline
    def apply(): AnimateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimateOptions]
    }
    
    @scala.inline
    implicit class AnimateOptionsMutableBuilder[Self <: AnimateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Coordinate_): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setCenter(value: Coordinate_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait BounceOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
    
    var resolution: Double = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object BounceOptions {
    
    @scala.inline
    def apply(resolution: Double): BounceOptions = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceOptions]
    }
    
    @scala.inline
    implicit class BounceOptionsMutableBuilder[Self <: BounceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait PanOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
    
    var source: Coordinate_ = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object PanOptions {
    
    @scala.inline
    def apply(source: Coordinate_): PanOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanOptions]
    }
    
    @scala.inline
    implicit class PanOptionsMutableBuilder[Self <: PanOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setSource(value: Coordinate_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait RotateOptions extends StObject {
    
    var anchor: js.UndefOr[Coordinate_] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object RotateOptions {
    
    @scala.inline
    def apply(): RotateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateOptions]
    }
    
    @scala.inline
    implicit class RotateOptionsMutableBuilder[Self <: RotateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Coordinate_): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait ZoomOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.native
    
    var resolution: Double = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object ZoomOptions {
    
    @scala.inline
    def apply(resolution: Double): ZoomOptions = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomOptions]
    }
    
    @scala.inline
    implicit class ZoomOptionsMutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
