package typings.msDashRestDashAzure.libSubscriptionManagementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TenantIdDescription extends js.Object {
  val id: js.UndefOr[String] = js.undefined
  val tenantId: js.UndefOr[String] = js.undefined
}

object TenantIdDescription {
  @scala.inline
  def apply(id: String = null, tenantId: String = null): TenantIdDescription = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TenantIdDescription]
  }
}

