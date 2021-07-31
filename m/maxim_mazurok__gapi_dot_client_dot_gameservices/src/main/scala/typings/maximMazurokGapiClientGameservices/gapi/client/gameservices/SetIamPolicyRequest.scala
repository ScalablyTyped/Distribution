package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIamPolicyRequest extends StObject {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform
    * services (such as Projects) might reject them.
    */
  var policy: js.UndefOr[Policy] = js.undefined
  
  /**
    * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used:
    * `paths: "bindings, etag"`
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object SetIamPolicyRequest {
  
  @scala.inline
  def apply(): SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class SetIamPolicyRequestMutableBuilder[Self <: SetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
