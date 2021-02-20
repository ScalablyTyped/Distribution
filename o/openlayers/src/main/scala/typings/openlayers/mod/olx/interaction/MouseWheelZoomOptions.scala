package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWheelZoomOptions extends StObject {
  
  var constrainResolution: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var useAnchor: js.UndefOr[Boolean] = js.native
}
object MouseWheelZoomOptions {
  
  @scala.inline
  def apply(): MouseWheelZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWheelZoomOptions]
  }
  
  @scala.inline
  implicit class MouseWheelZoomOptionsMutableBuilder[Self <: MouseWheelZoomOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrainResolution(value: Boolean): Self = StObject.set(x, "constrainResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainResolutionUndefined: Self = StObject.set(x, "constrainResolution", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
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
