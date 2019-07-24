package typings
package microsoftDashGraphLib.microsoftDashGraphMod

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
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'.
    * Read-only
    */
  var skuPartNumber: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseDetails {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    servicePlans: js.Array[ServicePlanInfo] = null,
    skuId: java.lang.String = null,
    skuPartNumber: java.lang.String = null
  ): LicenseDetails = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (servicePlans != null) __obj.updateDynamic("servicePlans")(servicePlans)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    if (skuPartNumber != null) __obj.updateDynamic("skuPartNumber")(skuPartNumber)
    __obj.asInstanceOf[LicenseDetails]
  }
}

