package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsePolicy extends StObject {
  
  /** User-provided description for this Response Policy. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of network names specifying networks to which this policy is applied. */
  var networks: js.UndefOr[js.Array[ResponsePolicyNetwork]] = js.undefined
  
  /** User assigned name for this Response Policy. */
  var responsePolicyName: js.UndefOr[String] = js.undefined
}
object ResponsePolicy {
  
  inline def apply(): ResponsePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsePolicy] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworks(value: js.Array[ResponsePolicyNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: ResponsePolicyNetwork*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setResponsePolicyName(value: String): Self = StObject.set(x, "responsePolicyName", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyNameUndefined: Self = StObject.set(x, "responsePolicyName", js.undefined)
  }
}
