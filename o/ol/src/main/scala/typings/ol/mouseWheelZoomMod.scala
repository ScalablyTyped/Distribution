package typings.ol

import typings.ol.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mouseWheelZoomMod {
  
  @JSImport("ol/interaction/MouseWheelZoom", JSImport.Default)
  @js.native
  open class default () extends MouseWheelZoom {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait Mode extends StObject
  @JSImport("ol/interaction/MouseWheelZoom", "Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode & String] = js.native
    
    @js.native
    sealed trait TRACKPAD
      extends StObject
         with Mode
    /* "trackpad" */ val TRACKPAD: typings.ol.mouseWheelZoomMod.Mode.TRACKPAD & String = js.native
    
    @js.native
    sealed trait WHEEL
      extends StObject
         with Mode
    /* "wheel" */ val WHEEL: typings.ol.mouseWheelZoomMod.Mode.WHEEL & String = js.native
  }
  
  @js.native
  trait MouseWheelZoom
    extends typings.ol.interactionInteractionMod.default {
    
    /**
      * Enable or disable using the mouse's location as an anchor when zooming
      */
    def setMouseAnchor(useAnchor: Boolean): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var condition: js.UndefOr[Condition] = js.undefined
    
    var constrainResolution: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var maxDelta: js.UndefOr[Double] = js.undefined
    
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var useAnchor: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
      
      inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
      
      inline def setMaxDeltaUndefined: Self = StObject.set(x, "maxDelta", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
      
      inline def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
    }
  }
}
