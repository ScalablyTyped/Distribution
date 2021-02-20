package typings.ol

import typings.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseWheelZoomMod {
  
  @JSImport("ol/interaction/MouseWheelZoom", JSImport.Default)
  @js.native
  class default () extends MouseWheelZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("ol/interaction/MouseWheelZoom", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode with String] = js.native
    
    @js.native
    sealed trait TRACKPAD extends Mode
    /* "trackpad" */ val TRACKPAD: typings.ol.mouseWheelZoomMod.Mode.TRACKPAD with String = js.native
    
    @js.native
    sealed trait WHEEL extends Mode
    /* "wheel" */ val WHEEL: typings.ol.mouseWheelZoomMod.Mode.WHEEL with String = js.native
  }
  
  @js.native
  trait MouseWheelZoom
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * Enable or disable using the mouse's location as an anchor when zooming
      */
    def setMouseAnchor(useAnchor: Boolean): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.native
    
    var constrainResolution: js.UndefOr[Boolean] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var maxDelta: js.UndefOr[Double] = js.native
    
    var onFocusOnly: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var useAnchor: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      @scala.inline
      def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      @scala.inline
      def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
    }
  }
}
