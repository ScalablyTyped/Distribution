package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRuleInfo extends StObject {
  
  /** Name of a Compute Engine forwarding rule. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Port range defined in the forwarding rule that matches the test. */
  var matchedPortRange: js.UndefOr[String] = js.native
  
  /** Protocol defined in the forwarding rule that matches the test. */
  var matchedProtocol: js.UndefOr[String] = js.native
  
  /** Network URI. Only valid for Internal Load Balancer. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Target type of the forwarding rule. */
  var target: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine forwarding rule. */
  var uri: js.UndefOr[String] = js.native
  
  /** VIP of the forwarding rule. */
  var vip: js.UndefOr[String] = js.native
}
object ForwardingRuleInfo {
  
  @scala.inline
  def apply(): ForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRuleInfo]
  }
  
  @scala.inline
  implicit class ForwardingRuleInfoMutableBuilder[Self <: ForwardingRuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMatchedPortRange(value: String): Self = StObject.set(x, "matchedPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedPortRangeUndefined: Self = StObject.set(x, "matchedPortRange", js.undefined)
    
    @scala.inline
    def setMatchedProtocol(value: String): Self = StObject.set(x, "matchedProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedProtocolUndefined: Self = StObject.set(x, "matchedProtocol", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = StObject.set(x, "networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUriUndefined: Self = StObject.set(x, "networkUri", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setVip(value: String): Self = StObject.set(x, "vip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVipUndefined: Self = StObject.set(x, "vip", js.undefined)
  }
}
