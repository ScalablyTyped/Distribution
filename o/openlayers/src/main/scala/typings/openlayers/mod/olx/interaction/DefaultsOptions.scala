package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interactions for the map. Default is `true` for all options.
  */
trait DefaultsOptions extends StObject {
  
  var altShiftDragRotate: js.UndefOr[Boolean] = js.undefined
  
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var dragPan: js.UndefOr[Boolean] = js.undefined
  
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  
  var pinchRotate: js.UndefOr[Boolean] = js.undefined
  
  var pinchZoom: js.UndefOr[Boolean] = js.undefined
  
  var shiftDragZoom: js.UndefOr[Boolean] = js.undefined
  
  var zoomDelta: js.UndefOr[Double] = js.undefined
  
  var zoomDuration: js.UndefOr[Double] = js.undefined
}
object DefaultsOptions {
  
  inline def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  
  extension [Self <: DefaultsOptions](x: Self) {
    
    inline def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
    
    inline def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
    
    inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
    
    inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    inline def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
    
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
