package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseDetails extends Entity {
  // Information about the service plans assigned with the license. Read-only, Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.undefined
  /**
    * Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object.
    * Read-only
    */
  var skuId: js.UndefOr[String] = js.undefined
  /**
    * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'.
    * Read-only
    */
  var skuPartNumber: js.UndefOr[String] = js.undefined
}

object LicenseDetails {
  @scala.inline
  def apply(
    id: String = null,
    servicePlans: js.Array[ServicePlanInfo] = null,
    skuId: String = null,
    skuPartNumber: String = null
  ): LicenseDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (servicePlans != null) __obj.updateDynamic("servicePlans")(servicePlans.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (skuPartNumber != null) __obj.updateDynamic("skuPartNumber")(skuPartNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseDetails]
  }
}

