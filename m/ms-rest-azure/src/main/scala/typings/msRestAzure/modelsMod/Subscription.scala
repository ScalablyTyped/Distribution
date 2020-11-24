package typings.msRestAzure.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  var authorizationSource: js.UndefOr[String] = js.native
  
  val displayName: js.UndefOr[String] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val state: js.UndefOr[String] = js.native
  
  val subscriptionId: js.UndefOr[String] = js.native
  
  var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.native
  
  val tenantId: js.UndefOr[String] = js.native
}
object Subscription {
  
  @scala.inline
  def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationSource(value: String): Self = this.set("authorizationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationSource: Self = this.set("authorizationSource", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
    
    @scala.inline
    def setSubscriptionPolicies(value: SubscriptionPolicies): Self = this.set("subscriptionPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionPolicies: Self = this.set("subscriptionPolicies", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenantId: Self = this.set("tenantId", js.undefined)
  }
}
