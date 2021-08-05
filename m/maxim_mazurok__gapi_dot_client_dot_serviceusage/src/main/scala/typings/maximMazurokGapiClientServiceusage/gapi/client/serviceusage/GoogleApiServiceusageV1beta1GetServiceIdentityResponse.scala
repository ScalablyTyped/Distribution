package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiServiceusageV1beta1GetServiceIdentityResponse extends StObject {
  
  /**
    * Service identity that service producer can use to access consumer resources. If exists is true, it contains email and unique_id. If exists is false, it contains pre-constructed
    * email and empty unique_id.
    */
  var identity: js.UndefOr[GoogleApiServiceusageV1beta1ServiceIdentity] = js.undefined
  
  /** Service identity state. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleApiServiceusageV1beta1GetServiceIdentityResponse {
  
  inline def apply(): GoogleApiServiceusageV1beta1GetServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1beta1GetServiceIdentityResponse]
  }
  
  extension [Self <: GoogleApiServiceusageV1beta1GetServiceIdentityResponse](x: Self) {
    
    inline def setIdentity(value: GoogleApiServiceusageV1beta1ServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
