package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribedSku extends Entity {
  // For example, 'User' or 'Company'.
  var appliesTo: js.UndefOr[String] = js.undefined
  // For example, 'Enabled'.
  var capabilityStatus: js.UndefOr[String] = js.undefined
  // The number of licenses that have been assigned.
  var consumedUnits: js.UndefOr[Double] = js.undefined
  // Information about the number and status of prepaid licenses.
  var prepaidUnits: js.UndefOr[LicenseUnitsDetail] = js.undefined
  // Information about the service plans that are available with the SKU. Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.undefined
  // The unique identifier (GUID) for the service SKU.
  var skuId: js.UndefOr[String] = js.undefined
  // The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'.
  var skuPartNumber: js.UndefOr[String] = js.undefined
}

object SubscribedSku {
  @scala.inline
  def apply(
    appliesTo: String = null,
    capabilityStatus: String = null,
    consumedUnits: Int | Double = null,
    id: String = null,
    prepaidUnits: LicenseUnitsDetail = null,
    servicePlans: js.Array[ServicePlanInfo] = null,
    skuId: String = null,
    skuPartNumber: String = null
  ): SubscribedSku = {
    val __obj = js.Dynamic.literal()
    if (appliesTo != null) __obj.updateDynamic("appliesTo")(appliesTo.asInstanceOf[js.Any])
    if (capabilityStatus != null) __obj.updateDynamic("capabilityStatus")(capabilityStatus.asInstanceOf[js.Any])
    if (consumedUnits != null) __obj.updateDynamic("consumedUnits")(consumedUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prepaidUnits != null) __obj.updateDynamic("prepaidUnits")(prepaidUnits.asInstanceOf[js.Any])
    if (servicePlans != null) __obj.updateDynamic("servicePlans")(servicePlans.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (skuPartNumber != null) __obj.updateDynamic("skuPartNumber")(skuPartNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedSku]
  }
}

