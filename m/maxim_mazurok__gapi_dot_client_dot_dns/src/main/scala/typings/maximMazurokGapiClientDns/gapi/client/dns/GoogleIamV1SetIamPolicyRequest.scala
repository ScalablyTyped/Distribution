package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIamV1SetIamPolicyRequest extends StObject {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Google Cloud
    * services (such as Projects) might reject them.
    */
  var policy: js.UndefOr[GoogleIamV1Policy] = js.undefined
  
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used:
    * `paths: "bindings, etag"`
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GoogleIamV1SetIamPolicyRequest {
  
  inline def apply(): GoogleIamV1SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIamV1SetIamPolicyRequest]
  }
  
  extension [Self <: GoogleIamV1SetIamPolicyRequest](x: Self) {
    
    inline def setPolicy(value: GoogleIamV1Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
