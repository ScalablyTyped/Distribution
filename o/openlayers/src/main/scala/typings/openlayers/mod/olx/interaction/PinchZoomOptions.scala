package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchZoomOptions extends StObject {
  
  var constrainResolution: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object PinchZoomOptions {
  
  inline def apply(): PinchZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinchZoomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinchZoomOptions] (val x: Self) extends AnyVal {
    
    inline def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
    
    inline def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
