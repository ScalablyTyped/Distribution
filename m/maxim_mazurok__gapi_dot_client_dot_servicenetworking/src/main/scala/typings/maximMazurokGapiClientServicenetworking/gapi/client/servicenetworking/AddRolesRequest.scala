package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRolesRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is a project number, as in
    * '12345' {network} is a network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
  
  /** Required. List of policy bindings to add to shared VPC host project. */
  var policyBinding: js.UndefOr[js.Array[PolicyBinding]] = js.undefined
}
object AddRolesRequest {
  
  inline def apply(): AddRolesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddRolesRequest]
  }
  
  extension [Self <: AddRolesRequest](x: Self) {
    
    inline def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    inline def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    inline def setPolicyBinding(value: js.Array[PolicyBinding]): Self = StObject.set(x, "policyBinding", value.asInstanceOf[js.Any])
    
    inline def setPolicyBindingUndefined: Self = StObject.set(x, "policyBinding", js.undefined)
    
    inline def setPolicyBindingVarargs(value: PolicyBinding*): Self = StObject.set(x, "policyBinding", js.Array(value*))
  }
}
