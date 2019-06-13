package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribedSku extends Entity {
  /** For example, 'User' or 'Company'. */
  var appliesTo: js.UndefOr[java.lang.String] = js.undefined
  /** For example, 'Enabled'. */
  var capabilityStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The number of licenses that have been assigned. */
  var consumedUnits: js.UndefOr[scala.Double] = js.undefined
  /** Information about the number and status of prepaid licenses. */
  var prepaidUnits: js.UndefOr[LicenseUnitsDetail] = js.undefined
  /** Information about the service plans that are available with the SKU. Not nullable */
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.undefined
  /** The unique identifier (GUID) for the service SKU. */
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  /** The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. */
  var skuPartNumber: js.UndefOr[java.lang.String] = js.undefined
}

object SubscribedSku {
  @scala.inline
  def apply(
    appliesTo: java.lang.String = null,
    capabilityStatus: java.lang.String = null,
    consumedUnits: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    prepaidUnits: LicenseUnitsDetail = null,
    servicePlans: js.Array[ServicePlanInfo] = null,
    skuId: java.lang.String = null,
    skuPartNumber: java.lang.String = null
  ): SubscribedSku = {
    val __obj = js.Dynamic.literal()
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo)
    if (capabilityStatus != null) __obj.updateDynamic("capabilityStatus")(capabilityStatus)
    if (consumedUnits != null) __obj.updateDynamic("consumedUnits")(consumedUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (prepaidUnits != null) __obj.updateDynamic("prepaidUnits")(prepaidUnits)
    if (servicePlans != null) __obj.updateDynamic("servicePlans")(servicePlans)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    if (skuPartNumber != null) __obj.updateDynamic("skuPartNumber")(skuPartNumber)
    __obj.asInstanceOf[SubscribedSku]
  }
}

