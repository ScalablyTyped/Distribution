package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalMoveDeviceRequest extends StObject {
  
  /** Required. The name of the new parent resource (Node or Customer) to reparent the device under. */
  var destination: js.UndefOr[String] = js.undefined
}
object SasPortalMoveDeviceRequest {
  
  inline def apply(): SasPortalMoveDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveDeviceRequest]
  }
  
  extension [Self <: SasPortalMoveDeviceRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
