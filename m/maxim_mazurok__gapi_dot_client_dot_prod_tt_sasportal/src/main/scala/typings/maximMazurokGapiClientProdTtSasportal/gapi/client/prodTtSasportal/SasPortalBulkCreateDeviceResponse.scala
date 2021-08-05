package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalBulkCreateDeviceResponse extends StObject {
  
  /** Required. The devices that were imported. */
  var devices: js.UndefOr[js.Array[SasPortalDevice]] = js.undefined
}
object SasPortalBulkCreateDeviceResponse {
  
  inline def apply(): SasPortalBulkCreateDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalBulkCreateDeviceResponse]
  }
  
  extension [Self <: SasPortalBulkCreateDeviceResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SasPortalDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SasPortalDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
