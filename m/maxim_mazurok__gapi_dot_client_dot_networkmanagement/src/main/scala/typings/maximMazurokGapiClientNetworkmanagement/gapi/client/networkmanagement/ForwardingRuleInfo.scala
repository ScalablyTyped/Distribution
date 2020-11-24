package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardingRuleInfo extends js.Object {
  
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
  implicit class ForwardingRuleInfoOps[Self <: ForwardingRuleInfo] (val x: Self) extends AnyVal {
    
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
    def setMatchedPortRange(value: String): Self = this.set("matchedPortRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedPortRange: Self = this.set("matchedPortRange", js.undefined)
    
    @scala.inline
    def setMatchedProtocol(value: String): Self = this.set("matchedProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedProtocol: Self = this.set("matchedProtocol", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVip(value: String): Self = this.set("vip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVip: Self = this.set("vip", js.undefined)
  }
}
