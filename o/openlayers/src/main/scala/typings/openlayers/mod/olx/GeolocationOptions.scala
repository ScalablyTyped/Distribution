package typings.openlayers.mod.olx

import typings.openlayers.mod.ProjectionLike
import typings.std.PositionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationOptions extends StObject {
  
  var projection: ProjectionLike
  
  var tracking: js.UndefOr[Boolean] = js.undefined
  
  var trackingOptions: js.UndefOr[PositionOptions] = js.undefined
}
object GeolocationOptions {
  
  @scala.inline
  def apply(): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationOptions]
  }
  
  @scala.inline
  implicit class GeolocationOptionsMutableBuilder[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setTracking(value: Boolean): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptions(value: PositionOptions): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
    
    @scala.inline
    def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
  }
}
