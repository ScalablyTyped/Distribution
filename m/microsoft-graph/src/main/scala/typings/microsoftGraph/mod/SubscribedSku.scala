package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class SubscribedSkuMutableBuilder[Self <: SubscribedSku] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliesTo(value: NullableOption[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    @scala.inline
    def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    @scala.inline
    def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    @scala.inline
    def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    @scala.inline
    def setConsumedUnits(value: NullableOption[Double]): Self = StObject.set(x, "consumedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedUnitsNull: Self = StObject.set(x, "consumedUnits", null)
    
    @scala.inline
    def setConsumedUnitsUndefined: Self = StObject.set(x, "consumedUnits", js.undefined)
    
    @scala.inline
    def setPrepaidUnits(value: NullableOption[LicenseUnitsDetail]): Self = StObject.set(x, "prepaidUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepaidUnitsNull: Self = StObject.set(x, "prepaidUnits", null)
    
    @scala.inline
    def setPrepaidUnitsUndefined: Self = StObject.set(x, "prepaidUnits", js.undefined)
    
    @scala.inline
    def setServicePlans(value: js.Array[ServicePlanInfo]): Self = StObject.set(x, "servicePlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePlansUndefined: Self = StObject.set(x, "servicePlans", js.undefined)
    
    @scala.inline
    def setServicePlansVarargs(value: ServicePlanInfo*): Self = StObject.set(x, "servicePlans", js.Array(value :_*))
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    @scala.inline
    def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
    
    @scala.inline
    def setSkuPartNumber(value: NullableOption[String]): Self = StObject.set(x, "skuPartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuPartNumberNull: Self = StObject.set(x, "skuPartNumber", null)
    
    @scala.inline
    def setSkuPartNumberUndefined: Self = StObject.set(x, "skuPartNumber", js.undefined)
  }
}
