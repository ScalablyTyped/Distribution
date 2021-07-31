package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalMoveDeviceRequest extends StObject {
  
  /** Required. The name of the new parent resource (Node or Customer) to reparent the device under. */
  var destination: js.UndefOr[String] = js.undefined
}
object SasPortalMoveDeviceRequest {
  
  @scala.inline
  def apply(): SasPortalMoveDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveDeviceRequest]
  }
  
  @scala.inline
  implicit class SasPortalMoveDeviceRequestMutableBuilder[Self <: SasPortalMoveDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
