package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWheelZoomOptions extends StObject {
  
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useAnchor: js.UndefOr[Boolean] = js.undefined
}
object MouseWheelZoomOptions {
  
  inline def apply(): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseWheelZoomOptions] (val x: Self) extends AnyVal {
    
    inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
    
    inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseAnchor(value: Boolean): Self = StObject.set(x, "useAnchor", value.asInstanceOf[js.Any])
    
    inline def setUseAnchorUndefined: Self = StObject.set(x, "useAnchor", js.undefined)
  }
}
