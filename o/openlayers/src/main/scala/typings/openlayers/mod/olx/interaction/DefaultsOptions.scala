package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interactions for the map. Default is `true` for all options.
  */
@js.native
trait DefaultsOptions extends StObject {
  
  var altShiftDragRotate: js.UndefOr[Boolean] = js.native
  
  var constrainResolution: js.UndefOr[Boolean] = js.native
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  
  var dragPan: js.UndefOr[Boolean] = js.native
  
  var keyboard: js.UndefOr[Boolean] = js.native
  
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  
  var pinchRotate: js.UndefOr[Boolean] = js.native
  
  var pinchZoom: js.UndefOr[Boolean] = js.native
  
  var shiftDragZoom: js.UndefOr[Boolean] = js.native
  
  var zoomDelta: js.UndefOr[Double] = js.native
  
  var zoomDuration: js.UndefOr[Double] = js.native
}
object DefaultsOptions {
  
  @scala.inline
  def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  
  @scala.inline
  implicit class DefaultsOptionsMutableBuilder[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltShiftDragRotate(value: Boolean): Self = StObject.set(x, "altShiftDragRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltShiftDragRotateUndefined: Self = StObject.set(x, "altShiftDragRotate", js.undefined)
    
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
    
    @scala.inline
    def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
    
    @scala.inline
    def setDragPan(value: Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setMouseWheelZoom(value: Boolean): Self = StObject.set(x, "mouseWheelZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelZoomUndefined: Self = StObject.set(x, "mouseWheelZoom", js.undefined)
    
    @scala.inline
    def setPinchRotate(value: Boolean): Self = StObject.set(x, "pinchRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchRotateUndefined: Self = StObject.set(x, "pinchRotate", js.undefined)
    
    @scala.inline
    def setPinchZoom(value: Boolean): Self = StObject.set(x, "pinchZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinchZoomUndefined: Self = StObject.set(x, "pinchZoom", js.undefined)
    
    @scala.inline
    def setShiftDragZoom(value: Boolean): Self = StObject.set(x, "shiftDragZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftDragZoomUndefined: Self = StObject.set(x, "shiftDragZoom", js.undefined)
    
    @scala.inline
    def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDeltaUndefined: Self = StObject.set(x, "zoomDelta", js.undefined)
    
    @scala.inline
    def setZoomDuration(value: Double): Self = StObject.set(x, "zoomDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomDurationUndefined: Self = StObject.set(x, "zoomDuration", js.undefined)
  }
}
