package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointInfo extends js.Object {
  
  /** Destination IP address. */
  var destinationIp: js.UndefOr[String] = js.native
  
  /** URI of the network where this packet is sent to. */
  var destinationNetworkUri: js.UndefOr[String] = js.native
  
  /** Destination port. Only valid when protocol is TCP or UDP. */
  var destinationPort: js.UndefOr[Double] = js.native
  
  /** IP protocol in string format, for example: "TCP", "UDP", "ICMP". */
  var protocol: js.UndefOr[String] = js.native
  
  /** Source IP address. */
  var sourceIp: js.UndefOr[String] = js.native
  
  /** URI of the network where this packet originates from. */
  var sourceNetworkUri: js.UndefOr[String] = js.native
  
  /** Source port. Only valid when protocol is TCP or UDP. */
  var sourcePort: js.UndefOr[Double] = js.native
}
object EndpointInfo {
  
  @scala.inline
  def apply(): EndpointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointInfo]
  }
  
  @scala.inline
  implicit class EndpointInfoOps[Self <: EndpointInfo] (val x: Self) extends AnyVal {
    
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
    def setDestinationIp(value: String): Self = this.set("destinationIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIp: Self = this.set("destinationIp", js.undefined)
    
    @scala.inline
    def setDestinationNetworkUri(value: String): Self = this.set("destinationNetworkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationNetworkUri: Self = this.set("destinationNetworkUri", js.undefined)
    
    @scala.inline
    def setDestinationPort(value: Double): Self = this.set("destinationPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPort: Self = this.set("destinationPort", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSourceIp(value: String): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIp: Self = this.set("sourceIp", js.undefined)
    
    @scala.inline
    def setSourceNetworkUri(value: String): Self = this.set("sourceNetworkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceNetworkUri: Self = this.set("sourceNetworkUri", js.undefined)
    
    @scala.inline
    def setSourcePort(value: Double): Self = this.set("sourcePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePort: Self = this.set("sourcePort", js.undefined)
  }
}
