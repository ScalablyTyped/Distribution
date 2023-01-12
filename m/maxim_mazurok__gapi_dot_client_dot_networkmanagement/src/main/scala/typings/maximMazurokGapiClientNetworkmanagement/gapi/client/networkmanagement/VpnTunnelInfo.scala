package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnTunnelInfo extends StObject {
  
  /** Name of a VPN tunnel. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine network where the VPN tunnel is configured. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Name of a Google Cloud region where this VPN tunnel is configured. */
  var region: js.UndefOr[String] = js.undefined
  
  /** URI of a VPN gateway at remote end of the tunnel. */
  var remoteGateway: js.UndefOr[String] = js.undefined
  
  /** Remote VPN gateway's IP address. */
  var remoteGatewayIp: js.UndefOr[String] = js.undefined
  
  /** Type of the routing policy. */
  var routingType: js.UndefOr[String] = js.undefined
  
  /** URI of the VPN gateway at local end of the tunnel. */
  var sourceGateway: js.UndefOr[String] = js.undefined
  
  /** Local VPN gateway's IP address. */
  var sourceGatewayIp: js.UndefOr[String] = js.undefined
  
  /** URI of a VPN tunnel. */
  var uri: js.UndefOr[String] = js.undefined
}
object VpnTunnelInfo {
  
  inline def apply(): VpnTunnelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnTunnelInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRemoteGateway(value: String): Self = StObject.set(x, "remoteGateway", value.asInstanceOf[js.Any])
    
    inline def setRemoteGatewayIp(value: String): Self = StObject.set(x, "remoteGatewayIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteGatewayIpUndefined: Self = StObject.set(x, "remoteGatewayIp", js.undefined)
    
    inline def setRemoteGatewayUndefined: Self = StObject.set(x, "remoteGateway", js.undefined)
    
    inline def setRoutingType(value: String): Self = StObject.set(x, "routingType", value.asInstanceOf[js.Any])
    
    inline def setRoutingTypeUndefined: Self = StObject.set(x, "routingType", js.undefined)
    
    inline def setSourceGateway(value: String): Self = StObject.set(x, "sourceGateway", value.asInstanceOf[js.Any])
    
    inline def setSourceGatewayIp(value: String): Self = StObject.set(x, "sourceGatewayIp", value.asInstanceOf[js.Any])
    
    inline def setSourceGatewayIpUndefined: Self = StObject.set(x, "sourceGatewayIp", js.undefined)
    
    inline def setSourceGatewayUndefined: Self = StObject.set(x, "sourceGateway", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
