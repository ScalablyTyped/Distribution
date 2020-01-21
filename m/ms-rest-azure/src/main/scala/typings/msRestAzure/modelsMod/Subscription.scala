package typings.msRestAzure.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var authorizationSource: js.UndefOr[String] = js.undefined
  val displayName: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val state: js.UndefOr[String] = js.undefined
  val subscriptionId: js.UndefOr[String] = js.undefined
  var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.undefined
  val tenantId: js.UndefOr[String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    authorizationSource: String = null,
    displayName: String = null,
    id: String = null,
    state: String = null,
    subscriptionId: String = null,
    subscriptionPolicies: SubscriptionPolicies = null,
    tenantId: String = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (authorizationSource != null) __obj.updateDynamic("authorizationSource")(authorizationSource.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId.asInstanceOf[js.Any])
    if (subscriptionPolicies != null) __obj.updateDynamic("subscriptionPolicies")(subscriptionPolicies.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

