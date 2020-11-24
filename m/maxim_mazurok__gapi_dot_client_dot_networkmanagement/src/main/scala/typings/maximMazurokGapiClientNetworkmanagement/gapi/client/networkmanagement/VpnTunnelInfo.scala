package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnelInfo extends js.Object {
  
  /** Name of a VPN tunnel. */
  var displayName: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine network where the VPN tunnel is configured. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Name of a GCP region where this VPN tunnel is configured. */
  var region: js.UndefOr[String] = js.native
  
  /** URI of a VPN gateway at remote end of the tunnel. */
  var remoteGateway: js.UndefOr[String] = js.native
  
  /** Remote VPN gateway's IP address. */
  var remoteGatewayIp: js.UndefOr[String] = js.native
  
  /** Type of the routing policy. */
  var routingType: js.UndefOr[String] = js.native
  
  /** URI of the VPN gateway at local end of the tunnel. */
  var sourceGateway: js.UndefOr[String] = js.native
  
  /** Local VPN gateway's IP address. */
  var sourceGatewayIp: js.UndefOr[String] = js.native
  
  /** URI of a VPN tunnel. */
  var uri: js.UndefOr[String] = js.native
}
object VpnTunnelInfo {
  
  @scala.inline
  def apply(): VpnTunnelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelInfo]
  }
  
  @scala.inline
  implicit class VpnTunnelInfoOps[Self <: VpnTunnelInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRemoteGateway(value: String): Self = this.set("remoteGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteGateway: Self = this.set("remoteGateway", js.undefined)
    
    @scala.inline
    def setRemoteGatewayIp(value: String): Self = this.set("remoteGatewayIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteGatewayIp: Self = this.set("remoteGatewayIp", js.undefined)
    
    @scala.inline
    def setRoutingType(value: String): Self = this.set("routingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingType: Self = this.set("routingType", js.undefined)
    
    @scala.inline
    def setSourceGateway(value: String): Self = this.set("sourceGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceGateway: Self = this.set("sourceGateway", js.undefined)
    
    @scala.inline
    def setSourceGatewayIp(value: String): Self = this.set("sourceGatewayIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceGatewayIp: Self = this.set("sourceGatewayIp", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
