package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingRuleInfo extends StObject {
  
  /** Name of a Compute Engine forwarding rule. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Port range defined in the forwarding rule that matches the test. */
  var matchedPortRange: js.UndefOr[String] = js.undefined
  
  /** Protocol defined in the forwarding rule that matches the test. */
  var matchedProtocol: js.UndefOr[String] = js.undefined
  
  /** Network URI. Only valid for Internal Load Balancer. */
  var networkUri: js.UndefOr[String] = js.undefined
  
  /** Target type of the forwarding rule. */
  var target: js.UndefOr[String] = js.undefined
  
  /** URI of a Compute Engine forwarding rule. */
  var uri: js.UndefOr[String] = js.undefined
  
  /** VIP of the forwarding rule. */
  var vip: js.UndefOr[String] = js.undefined
}
object ForwardingRuleInfo {
  
  inline def apply(): ForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForwardingRuleInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMatchedPortRange(value: String): Self = StObject.set(x, "matchedPortRange", value.asInstanceOf[js.Any])
    
    inline def setMatchedPortRangeUndefined: Self = StObject.set(x, "matchedPortRange", js.undefined)
    
    inline def setMatchedProtocol(value: String): Self = StObject.set(x, "matchedProtocol", value.asInstanceOf[js.Any])
    
    inline def setMatchedProtocolUndefined: Self = StObject.set(x, "matchedProtocol", js.undefined)
    
    inline def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    inline def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVip(value: String): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    inline def setVipUndefined: Self = StObject.set(x, "vip", js.undefined)
  }
}
