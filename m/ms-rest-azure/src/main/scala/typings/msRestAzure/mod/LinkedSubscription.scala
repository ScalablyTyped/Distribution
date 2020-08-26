package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedSubscription extends js.Object {
  /**
    * The authorization source of the subscription: 'RoleBased' , 'Legacy', 'Bypassed',' Direct', 'Management'. 
    * It could also be a comma separated string containing more values 'Bypassed, Direct, Management'.
    */
  var authorizationSource: String = js.native
  /**
    * The environment name For example: AzureCloud, AzureChina, USGovernment, GermanCloud, or your own Dogfood environment
    */
  var environmentName: String = js.native
  /**
    * The subscriptionId (usually a GUID).
    */
  var id: String = js.native
  /**
    * Display name of the subscription.
    */
  var name: String = js.native
  /**
    * The state of the subscription. Example values: 'Enabled', 'Disabled', 'Warned', 'PastDue', 'Deleted'.
    */
  var state: String = js.native
  /**
    * The tenant that the subscription belongs to.
    */
  var tenantId: String = js.native
  /**
    * The user associated with the subscription. This could be a user or a serviceprincipal.
    */
  var user: LinkedUser = js.native
}

object LinkedSubscription {
  @scala.inline
  def apply(
    authorizationSource: String,
    environmentName: String,
    id: String,
    name: String,
    state: String,
    tenantId: String,
    user: LinkedUser
  ): LinkedSubscription = {
    val __obj = js.Dynamic.literal(authorizationSource = authorizationSource.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedSubscription]
  }
  @scala.inline
  implicit class LinkedSubscriptionOps[Self <: LinkedSubscription] (val x: Self) extends AnyVal {
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
    def setEnvironmentName(value: String): Self = this.set("environmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: LinkedUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

