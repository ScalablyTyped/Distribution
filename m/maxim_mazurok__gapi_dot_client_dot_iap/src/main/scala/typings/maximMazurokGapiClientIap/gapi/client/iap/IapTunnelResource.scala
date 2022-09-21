package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IapTunnelResource extends StObject {
  
  var locations: LocationsResource
}
object IapTunnelResource {
  
  inline def apply(locations: LocationsResource): IapTunnelResource = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[IapTunnelResource]
  }
  
  extension [Self <: IapTunnelResource](x: Self) {
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
  }
}
