package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribedSku
  extends StObject
     with Entity {
  
  var accountId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var accountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For example, 'User' or 'Company'.
  var appliesTo: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Possible values are: Enabled, Warning, Suspended, Deleted, LockedOut. The capabilityStatus is Enabled if the
    * prepaidUnits property has at least 1 unit that is enabled, and LockedOut if the customer cancelled their subscription.
    */
  var capabilityStatus: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The number of licenses that have been assigned.
  var consumedUnits: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Information about the number and status of prepaid licenses.
  var prepaidUnits: js.UndefOr[NullableOption[LicenseUnitsDetail]] = js.undefined
  
  // Information about the service plans that are available with the SKU. Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.undefined
  
  // The unique identifier (GUID) for the service SKU.
  var skuId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The SKU part number; for example: 'AAD_PREMIUM' or 'RMSBASIC'. To get a list of commercial subscriptions that an
    * organization has acquired, see List subscribedSkus.
    */
  var skuPartNumber: js.UndefOr[NullableOption[String]] = js.undefined
  
  var subscriptionIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object SubscribedSku {
  
  inline def apply(): SubscribedSku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribedSku]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribedSku] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: NullableOption[String]): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: NullableOption[String]): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAppliesTo(value: NullableOption[String]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setCapabilityStatus(value: NullableOption[String]): Self = StObject.set(x, "capabilityStatus", value.asInstanceOf[js.Any])
    
    inline def setCapabilityStatusNull: Self = StObject.set(x, "capabilityStatus", null)
    
    inline def setCapabilityStatusUndefined: Self = StObject.set(x, "capabilityStatus", js.undefined)
    
    inline def setConsumedUnits(value: NullableOption[Double]): Self = StObject.set(x, "consumedUnits", value.asInstanceOf[js.Any])
    
    inline def setConsumedUnitsNull: Self = StObject.set(x, "consumedUnits", null)
    
    inline def setConsumedUnitsUndefined: Self = StObject.set(x, "consumedUnits", js.undefined)
    
    inline def setPrepaidUnits(value: NullableOption[LicenseUnitsDetail]): Self = StObject.set(x, "prepaidUnits", value.asInstanceOf[js.Any])
    
    inline def setPrepaidUnitsNull: Self = StObject.set(x, "prepaidUnits", null)
    
    inline def setPrepaidUnitsUndefined: Self = StObject.set(x, "prepaidUnits", js.undefined)
    
    inline def setServicePlans(value: js.Array[ServicePlanInfo]): Self = StObject.set(x, "servicePlans", value.asInstanceOf[js.Any])
    
    inline def setServicePlansUndefined: Self = StObject.set(x, "servicePlans", js.undefined)
    
    inline def setServicePlansVarargs(value: ServicePlanInfo*): Self = StObject.set(x, "servicePlans", js.Array(value*))
    
    inline def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
    
    inline def setSkuPartNumber(value: NullableOption[String]): Self = StObject.set(x, "skuPartNumber", value.asInstanceOf[js.Any])
    
    inline def setSkuPartNumberNull: Self = StObject.set(x, "skuPartNumber", null)
    
    inline def setSkuPartNumberUndefined: Self = StObject.set(x, "skuPartNumber", js.undefined)
    
    inline def setSubscriptionIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "subscriptionIds", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdsNull: Self = StObject.set(x, "subscriptionIds", null)
    
    inline def setSubscriptionIdsUndefined: Self = StObject.set(x, "subscriptionIds", js.undefined)
    
    inline def setSubscriptionIdsVarargs(value: String*): Self = StObject.set(x, "subscriptionIds", js.Array(value*))
  }
}
