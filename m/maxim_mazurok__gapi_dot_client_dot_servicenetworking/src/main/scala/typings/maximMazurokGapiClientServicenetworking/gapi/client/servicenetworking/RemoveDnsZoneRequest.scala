package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveDnsZoneRequest extends js.Object {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  
  /** Required. The name for both the private zone in the shared producer host project and the peering zone in the consumer project. */
  var name: js.UndefOr[String] = js.native
}
object RemoveDnsZoneRequest {
  
  @scala.inline
  def apply(): RemoveDnsZoneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDnsZoneRequest]
  }
  
  @scala.inline
  implicit class RemoveDnsZoneRequestOps[Self <: RemoveDnsZoneRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
