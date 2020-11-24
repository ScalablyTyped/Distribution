package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallInfo extends js.Object {
  
  /** Possible values: ALLOW, DENY */
  var action: js.UndefOr[String] = js.native
  
  /** Possible values: INGRESS, EGRESS */
  var direction: js.UndefOr[String] = js.native
  
  /** Name of a Compute Engine firewall rule. */
  var displayName: js.UndefOr[String] = js.native
  
  /** URI of a Compute Engine network. */
  var networkUri: js.UndefOr[String] = js.native
  
  /** Priority of the firewall rule. */
  var priority: js.UndefOr[Double] = js.native
  
  /** Target service accounts of the firewall rule. */
  var targetServiceAccounts: js.UndefOr[js.Array[String]] = js.native
  
  /** Target tags of the firewall rule. */
  var targetTags: js.UndefOr[js.Array[String]] = js.native
  
  /** URI of a Compute Engine firewall rule. Implied default rule does not have URI. */
  var uri: js.UndefOr[String] = js.native
}
object FirewallInfo {
  
  @scala.inline
  def apply(): FirewallInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallInfo]
  }
  
  @scala.inline
  implicit class FirewallInfoOps[Self <: FirewallInfo] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setNetworkUri(value: String): Self = this.set("networkUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkUri: Self = this.set("networkUri", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setTargetServiceAccountsVarargs(value: String*): Self = this.set("targetServiceAccounts", js.Array(value :_*))
    
    @scala.inline
    def setTargetServiceAccounts(value: js.Array[String]): Self = this.set("targetServiceAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetServiceAccounts: Self = this.set("targetServiceAccounts", js.undefined)
    
    @scala.inline
    def setTargetTagsVarargs(value: String*): Self = this.set("targetTags", js.Array(value :_*))
    
    @scala.inline
    def setTargetTags(value: js.Array[String]): Self = this.set("targetTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetTags: Self = this.set("targetTags", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
