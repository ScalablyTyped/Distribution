package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceIdentityResponse extends StObject {
  
  /**
    * Service identity that service producer can use to access consumer resources. If exists is true, it contains email and unique_id. If exists is false, it contains pre-constructed
    * email and empty unique_id.
    */
  var identity: js.UndefOr[ServiceIdentity] = js.undefined
  
  /** Service identity state. */
  var state: js.UndefOr[String] = js.undefined
}
object GetServiceIdentityResponse {
  
  @scala.inline
  def apply(): GetServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceIdentityResponse]
  }
  
  @scala.inline
  implicit class GetServiceIdentityResponseMutableBuilder[Self <: GetServiceIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: ServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
