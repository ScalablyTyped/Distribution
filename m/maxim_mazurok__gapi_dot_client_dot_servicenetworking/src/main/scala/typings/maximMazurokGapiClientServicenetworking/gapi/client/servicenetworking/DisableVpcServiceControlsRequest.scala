package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableVpcServiceControlsRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is a project number, as in
    * '12345' {network} is network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
}
object DisableVpcServiceControlsRequest {
  
  @scala.inline
  def apply(): DisableVpcServiceControlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcServiceControlsRequest]
  }
  
  @scala.inline
  implicit class DisableVpcServiceControlsRequestMutableBuilder[Self <: DisableVpcServiceControlsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
  }
}
