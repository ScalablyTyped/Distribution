package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnGatewayInfo extends js.Object {
  
  /** Name of a VPN gateway. */
  var displayName: js.UndefOr[String] = js.native
  
  /** IP address of the VPN gateway. */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine network where the VPN gateway is configured. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Name of a GCP region where this VPN gateway is configured. */
  var region: js.UndefOr[String] = js.native
  
  /** URI of a VPN gateway. */
  var uri: js.UndefOr[String] = js.native
  
  /** A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed. */
  var vpnTunnelUri: js.UndefOr[String] = js.native
}
object VpnGatewayInfo {
  
  @scala.inline
  def apply(): VpnGatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayInfo]
  }
  
  @scala.inline
  implicit class VpnGatewayInfoOps[Self <: VpnGatewayInfo] (val x: Self) extends AnyVal {
    
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVpnTunnelUri(value: String): Self = this.set("vpnTunnelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnTunnelUri: Self = this.set("vpnTunnelUri", js.undefined)
  }
}
