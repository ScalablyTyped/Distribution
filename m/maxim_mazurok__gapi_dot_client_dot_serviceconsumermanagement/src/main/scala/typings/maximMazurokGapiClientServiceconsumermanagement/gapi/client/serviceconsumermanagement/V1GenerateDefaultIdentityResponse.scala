package typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V1GenerateDefaultIdentityResponse extends StObject {
  
  /** Status of the role attachment. Under development (go/si-attach-role), currently always return ATTACH_STATUS_UNSPECIFIED) */
  var attachStatus: js.UndefOr[String] = js.undefined
  
  /** DefaultIdentity that was created or retrieved. */
  var identity: js.UndefOr[V1DefaultIdentity] = js.undefined
  
  /** Role attached to consumer project. Empty if not attached in this request. (Under development, currently always return empty.) */
  var role: js.UndefOr[String] = js.undefined
}
object V1GenerateDefaultIdentityResponse {
  
  inline def apply(): V1GenerateDefaultIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V1GenerateDefaultIdentityResponse]
  }
  
  extension [Self <: V1GenerateDefaultIdentityResponse](x: Self) {
    
    inline def setAttachStatus(value: String): Self = StObject.set(x, "attachStatus", value.asInstanceOf[js.Any])
    
    inline def setAttachStatusUndefined: Self = StObject.set(x, "attachStatus", js.undefined)
    
    inline def setIdentity(value: V1DefaultIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
