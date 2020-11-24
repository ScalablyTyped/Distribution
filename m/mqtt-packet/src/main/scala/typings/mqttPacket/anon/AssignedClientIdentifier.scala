package typings.mqttPacket.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedClientIdentifier extends js.Object {
  
  var assignedClientIdentifier: js.UndefOr[String] = js.native
  
  var authenticationData: js.UndefOr[Buffer] = js.native
  
  var authenticationMethod: js.UndefOr[String] = js.native
  
  var maximumPacketSize: js.UndefOr[Double] = js.native
  
  var maximumQoS: js.UndefOr[Double] = js.native
  
  var reasonString: js.UndefOr[String] = js.native
  
  var receiveMaximum: js.UndefOr[Double] = js.native
  
  var responseInformation: js.UndefOr[String] = js.native
  
  var retainAvailable: js.UndefOr[Boolean] = js.native
  
  var serverKeepAlive: js.UndefOr[Double] = js.native
  
  var serverReference: js.UndefOr[String] = js.native
  
  var sessionExpiryInterval: js.UndefOr[Double] = js.native
  
  var sharedSubscriptionAvailable: js.UndefOr[Boolean] = js.native
  
  var subscriptionIdentifiersAvailable: js.UndefOr[Boolean] = js.native
  
  var topicAliasMaximum: js.UndefOr[Double] = js.native
  
  var userProperties: js.UndefOr[js.Object] = js.native
  
  var wildcardSubscriptionAvailable: js.UndefOr[Boolean] = js.native
}
object AssignedClientIdentifier {
  
  @scala.inline
  def apply(): AssignedClientIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedClientIdentifier]
  }
  
  @scala.inline
  implicit class AssignedClientIdentifierOps[Self <: AssignedClientIdentifier] (val x: Self) extends AnyVal {
    
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
    def setAssignedClientIdentifier(value: String): Self = this.set("assignedClientIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedClientIdentifier: Self = this.set("assignedClientIdentifier", js.undefined)
    
    @scala.inline
    def setAuthenticationData(value: Buffer): Self = this.set("authenticationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationData: Self = this.set("authenticationData", js.undefined)
    
    @scala.inline
    def setAuthenticationMethod(value: String): Self = this.set("authenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationMethod: Self = this.set("authenticationMethod", js.undefined)
    
    @scala.inline
    def setMaximumPacketSize(value: Double): Self = this.set("maximumPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPacketSize: Self = this.set("maximumPacketSize", js.undefined)
    
    @scala.inline
    def setMaximumQoS(value: Double): Self = this.set("maximumQoS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumQoS: Self = this.set("maximumQoS", js.undefined)
    
    @scala.inline
    def setReasonString(value: String): Self = this.set("reasonString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonString: Self = this.set("reasonString", js.undefined)
    
    @scala.inline
    def setReceiveMaximum(value: Double): Self = this.set("receiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveMaximum: Self = this.set("receiveMaximum", js.undefined)
    
    @scala.inline
    def setResponseInformation(value: String): Self = this.set("responseInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseInformation: Self = this.set("responseInformation", js.undefined)
    
    @scala.inline
    def setRetainAvailable(value: Boolean): Self = this.set("retainAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainAvailable: Self = this.set("retainAvailable", js.undefined)
    
    @scala.inline
    def setServerKeepAlive(value: Double): Self = this.set("serverKeepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerKeepAlive: Self = this.set("serverKeepAlive", js.undefined)
    
    @scala.inline
    def setServerReference(value: String): Self = this.set("serverReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerReference: Self = this.set("serverReference", js.undefined)
    
    @scala.inline
    def setSessionExpiryInterval(value: Double): Self = this.set("sessionExpiryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionExpiryInterval: Self = this.set("sessionExpiryInterval", js.undefined)
    
    @scala.inline
    def setSharedSubscriptionAvailable(value: Boolean): Self = this.set("sharedSubscriptionAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSubscriptionAvailable: Self = this.set("sharedSubscriptionAvailable", js.undefined)
    
    @scala.inline
    def setSubscriptionIdentifiersAvailable(value: Boolean): Self = this.set("subscriptionIdentifiersAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionIdentifiersAvailable: Self = this.set("subscriptionIdentifiersAvailable", js.undefined)
    
    @scala.inline
    def setTopicAliasMaximum(value: Double): Self = this.set("topicAliasMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicAliasMaximum: Self = this.set("topicAliasMaximum", js.undefined)
    
    @scala.inline
    def setUserProperties(value: js.Object): Self = this.set("userProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProperties: Self = this.set("userProperties", js.undefined)
    
    @scala.inline
    def setWildcardSubscriptionAvailable(value: Boolean): Self = this.set("wildcardSubscriptionAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWildcardSubscriptionAvailable: Self = this.set("wildcardSubscriptionAvailable", js.undefined)
  }
}
