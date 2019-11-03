package typings.msDashRestDashAzure.msDashRestDashAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedSubscription extends js.Object {
  /**
    * The authorization source of the subscription: 'RoleBased' , 'Legacy', 'Bypassed',' Direct', 'Management'. 
    * It could also be a comma separated string containing more values 'Bypassed, Direct, Management'.
    */
  var authorizationSource: String
  /**
    * The environment name For example: AzureCloud, AzureChina, USGovernment, GermanCloud, or your own Dogfood environment
    */
  var environmentName: String
  /**
    * The subscriptionId (usually a GUID).
    */
  var id: String
  /**
    * Display name of the subscription.
    */
  var name: String
  /**
    * The state of the subscription. Example values: 'Enabled', 'Disabled', 'Warned', 'PastDue', 'Deleted'.
    */
  var state: String
  /**
    * The tenant that the subscription belongs to.
    */
  var tenantId: String
  /**
    * The user associated with the subscription. This could be a user or a serviceprincipal.
    */
  var user: LinkedUser
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
    val __obj = js.Dynamic.literal(authorizationSource = authorizationSource, environmentName = environmentName, id = id, name = name, state = state, tenantId = tenantId, user = user)
  
    __obj.asInstanceOf[LinkedSubscription]
  }
}

