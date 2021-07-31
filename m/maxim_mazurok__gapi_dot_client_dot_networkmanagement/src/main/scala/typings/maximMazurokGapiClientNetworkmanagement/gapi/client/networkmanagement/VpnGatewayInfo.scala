package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnGatewayInfo extends StObject {
  
  /** Name of a VPN gateway. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** IP address of the VPN gateway. */
  var ipAddress: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine network where the VPN gateway is configured. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Name of a GCP region where this VPN gateway is configured. */
  var region: js.UndefOr[String] = js.undefined
  
  /** URI of a VPN gateway. */
  var uri: js.UndefOr[String] = js.undefined
  
  /** A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed. */
  var vpnTunnelUri: js.UndefOr[String] = js.undefined
}
object VpnGatewayInfo {
  
  @scala.inline
  def apply(): VpnGatewayInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnGatewayInfo]
  }
  
  @scala.inline
  implicit class VpnGatewayInfoMutableBuilder[Self <: VpnGatewayInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setVpnTunnelUri(value: String): Self = StObject.set(x, "vpnTunnelUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnTunnelUriUndefined: Self = StObject.set(x, "vpnTunnelUri", js.undefined)
  }
}
