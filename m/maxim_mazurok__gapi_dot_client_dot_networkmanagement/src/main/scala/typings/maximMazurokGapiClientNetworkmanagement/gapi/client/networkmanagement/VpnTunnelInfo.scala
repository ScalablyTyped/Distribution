package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnelInfo extends StObject {
  
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
  implicit class VpnTunnelInfoMutableBuilder[Self <: VpnTunnelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setRemoteGateway(value: String): Self = StObject.set(x, "remoteGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteGatewayIp(value: String): Self = StObject.set(x, "remoteGatewayIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteGatewayIpUndefined: Self = StObject.set(x, "remoteGatewayIp", js.undefined)
    
    @scala.inline
    def setRemoteGatewayUndefined: Self = StObject.set(x, "remoteGateway", js.undefined)
    
    @scala.inline
    def setRoutingType(value: String): Self = StObject.set(x, "routingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingTypeUndefined: Self = StObject.set(x, "routingType", js.undefined)
    
    @scala.inline
    def setSourceGateway(value: String): Self = StObject.set(x, "sourceGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGatewayIp(value: String): Self = StObject.set(x, "sourceGatewayIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGatewayIpUndefined: Self = StObject.set(x, "sourceGatewayIp", js.undefined)
    
    @scala.inline
    def setSourceGatewayUndefined: Self = StObject.set(x, "sourceGateway", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
