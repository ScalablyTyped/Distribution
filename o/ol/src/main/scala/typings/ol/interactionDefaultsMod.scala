package typings.ol

import typings.ol.interactionInteractionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionDefaultsMod {
  
  @JSImport("ol/interaction/defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaults(): typings.ol.collectionMod.default[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[typings.ol.collectionMod.default[default]]
  inline def defaults(options: DefaultsOptions): typings.ol.collectionMod.default[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ol.collectionMod.default[default]]
  
  trait DefaultsOptions extends StObject {
    
    /**
      * Whether Alt-Shift-drag rotate is
      * desired.
      */
    var altShiftDragRotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether double click zoom is
      * desired.
      */
    var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether drag pan is desired.
      */
    var dragPan: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether keyboard interaction is desired.
      */
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether mousewheel zoom is desired.
      */
    var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Interact only when the map has the
      * focus. This affects the `MouseWheelZoom` and `DragPan` interactions and is
      * useful when page scroll is desired for maps that do not have the browser's
      * focus.
      */
    var onFocusOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether pinch rotate is desired.
      */
    var pinchRotate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether pinch zoom is desired.
      */
    var pinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether Shift-drag zoom is desired.
      */
    var shiftDragZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Zoom level delta when using keyboard or double click zoom.
      */
    var zoomDelta: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration of the zoom animation in
      * milliseconds.
      */
    var zoomDuration: js.UndefOr[Double] = js.undefined
  }
  object DefaultsOptions {
    
    inline def apply(): DefaultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
      
      inline def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
      
      inline def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
      
      inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
      
      inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
      
      inline def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
      
      inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
      
      inline def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
      
      inline def setOnFocusOnly(value: Boolean): Self = StObject.set(x, "onFocusOnly", value.asInstanceOf[js.Any])
      
      inline def setOnFocusOnlyUndefined: Self = StObject.set(x, "onFocusOnly", js.undefined)
      
      inline def setPinchRotate(value: Boolean): Self = StObject.set(x, "pinchRotate", value.asInstanceOf[js.Any])
      
      inline def setPinchRotateUndefined: Self = StObject.set(x, "pinchRotate", js.undefined)
      
      inline def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
      
      inline def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
      
      inline def setShiftDragZoom(value: Boolean): Self = StObject.set(x, "shiftDragZoom", value.asInstanceOf[js.Any])
      
      inline def setShiftDragZoomUndefined: Self = StObject.set(x, "shiftDragZoom", js.undefined)
      
      inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
      
      inline def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
      
      inline def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
      
      inline def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
    }
  }
}
