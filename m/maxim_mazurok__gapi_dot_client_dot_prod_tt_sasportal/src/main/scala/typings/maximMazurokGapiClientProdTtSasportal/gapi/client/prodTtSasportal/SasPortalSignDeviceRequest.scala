package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalSignDeviceRequest extends StObject {
  
  /** Required. The device to sign. The device fields name, fcc_id and serial_number must be set. The user_id field must be set. */
  var device: js.UndefOr[SasPortalDevice] = js.undefined
}
object SasPortalSignDeviceRequest {
  
  inline def apply(): SasPortalSignDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalSignDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalSignDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: SasPortalDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
