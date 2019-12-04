package typings.msDashRestDashAzure.libSubscriptionManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPolicies extends js.Object {
  val locationPlacementId: js.UndefOr[String] = js.undefined
  val quotaId: js.UndefOr[String] = js.undefined
  val spendingLimit: js.UndefOr[String] = js.undefined
}

object SubscriptionPolicies {
  @scala.inline
  def apply(locationPlacementId: String = null, quotaId: String = null, spendingLimit: String = null): SubscriptionPolicies = {
    val __obj = js.Dynamic.literal()
    if (locationPlacementId != null) __obj.updateDynamic("locationPlacementId")(locationPlacementId.asInstanceOf[js.Any])
    if (quotaId != null) __obj.updateDynamic("quotaId")(quotaId.asInstanceOf[js.Any])
    if (spendingLimit != null) __obj.updateDynamic("spendingLimit")(spendingLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPolicies]
  }
}

