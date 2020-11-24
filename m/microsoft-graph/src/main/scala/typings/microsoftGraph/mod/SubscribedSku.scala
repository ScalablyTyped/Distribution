package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribedSku extends Entity {
  
  // For example, 'User' or 'Company'.
  var appliesTo: js.UndefOr[NullableOption[String]] = js.native
  
  // Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut.
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.native
  
  // The number of licenses that have been assigned.
  var consumedUnits: js.UndefOr[NullableOption[Double]] = js.native
  
  // Information about the number and status of prepaid licenses.
  var prepaidUnits: js.UndefOr[NullableOption[LicenseUnitsDetail]] = js.native
  
  // Information about the service plans that are available with the SKU. Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.native
  
  // The unique identifier (GUID) for the service SKU.
  var skuId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an
    * organization has acquired, see List subscribedSkus.
    */
  var skuPartNumber: js.UndefOr[NullableOption[String]] = js.native
}
object SubscribedSku {
  
  @scala.inline
  def apply(): SubscribedSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribedSku]
  }
  
  @scala.inline
  implicit class SubscribedSkuOps[Self <: SubscribedSku] (val x: Self) extends AnyVal {
    
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
    def setAppliesTo(value: NullableOption[String]): Self = this.set("appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliesTo: Self = this.set("appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToNull: Self = this.set("appliesTo", null)
    
    @scala.inline
    def setCapabilityStatus(value: NullableOption[String]): Self = this.set("capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilityStatus: Self = this.set("capabilityStatus", js.undefined)
    
    @scala.inline
    def setCapabilityStatusNull: Self = this.set("capabilityStatus", null)
    
    @scala.inline
    def setConsumedUnits(value: NullableOption[Double]): Self = this.set("consumedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumedUnits: Self = this.set("consumedUnits", js.undefined)
    
    @scala.inline
    def setConsumedUnitsNull: Self = this.set("consumedUnits", null)
    
    @scala.inline
    def setPrepaidUnits(value: NullableOption[LicenseUnitsDetail]): Self = this.set("prepaidUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepaidUnits: Self = this.set("prepaidUnits", js.undefined)
    
    @scala.inline
    def setPrepaidUnitsNull: Self = this.set("prepaidUnits", null)
    
    @scala.inline
    def setServicePlansVarargs(value: ServicePlanInfo*): Self = this.set("servicePlans", js.Array(value :_*))
    
    @scala.inline
    def setServicePlans(value: js.Array[ServicePlanInfo]): Self = this.set("servicePlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePlans: Self = this.set("servicePlans", js.undefined)
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    
    @scala.inline
    def setSkuIdNull: Self = this.set("skuId", null)
    
    @scala.inline
    def setSkuPartNumber(value: NullableOption[String]): Self = this.set("skuPartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuPartNumber: Self = this.set("skuPartNumber", js.undefined)
    
    @scala.inline
    def setSkuPartNumberNull: Self = this.set("skuPartNumber", null)
  }
}
