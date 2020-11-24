package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableVpcServiceControlsRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is a project number, as in
    * '12345' {network} is network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
}
object DisableVpcServiceControlsRequest {
  
  @scala.inline
  def apply(): DisableVpcServiceControlsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableVpcServiceControlsRequest]
  }
  
  @scala.inline
  implicit class DisableVpcServiceControlsRequestOps[Self <: DisableVpcServiceControlsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConsumerNetwork(value: String): Self = this.set("consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerNetwork: Self = this.set("consumerNetwork", js.undefined)
  }
}
