package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDnsZoneRequest extends StObject {
  
  /**
    * Required. The network that the consumer is using to connect with services. Must be in the form of projects/{project}/global/networks/{network} {project} is the project number, as in
    * '12345' {network} is the network name.
    */
  var consumerNetwork: js.UndefOr[String] = js.undefined
  
  /** Required. The DNS name suffix for the zones e.g. `example.com`. */
  var dnsSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name for both the private zone in the shared producer host project and the peering zone in the consumer project. Must be unique within both projects. The name must be
    * 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.undefined
}
object AddDnsZoneRequest {
  
  @scala.inline
  def apply(): AddDnsZoneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDnsZoneRequest]
  }
  
  @scala.inline
  implicit class AddDnsZoneRequestMutableBuilder[Self <: AddDnsZoneRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerNetwork(value: String): Self = StObject.set(x, "consumerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNetworkUndefined: Self = StObject.set(x, "consumerNetwork", js.undefined)
    
    @scala.inline
    def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
