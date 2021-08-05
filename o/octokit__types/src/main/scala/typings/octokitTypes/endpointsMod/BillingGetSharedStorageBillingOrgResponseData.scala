package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetSharedStorageBillingOrgResponseData extends StObject {
  
  /**
    * Numbers of days left in billing cycle.
    */
  var days_left_in_billing_cycle: Double
  
  /**
    * Estimated storage space (GB) used in billing cycle.
    */
  var estimated_paid_storage_for_month: Double
  
  /**
    * Estimated sum of free and paid storage space (GB) used in billing cycle.
    */
  var estimated_storage_for_month: Double
}
object BillingGetSharedStorageBillingOrgResponseData {
  
  inline def apply(
    days_left_in_billing_cycle: Double,
    estimated_paid_storage_for_month: Double,
    estimated_storage_for_month: Double
  ): BillingGetSharedStorageBillingOrgResponseData = {
    val __obj = js.Dynamic.literal(days_left_in_billing_cycle = days_left_in_billing_cycle.asInstanceOf[js.Any], estimated_paid_storage_for_month = estimated_paid_storage_for_month.asInstanceOf[js.Any], estimated_storage_for_month = estimated_storage_for_month.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetSharedStorageBillingOrgResponseData]
  }
  
  extension [Self <: BillingGetSharedStorageBillingOrgResponseData](x: Self) {
    
    inline def setDays_left_in_billing_cycle(value: Double): Self = StObject.set(x, "days_left_in_billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setEstimated_paid_storage_for_month(value: Double): Self = StObject.set(x, "estimated_paid_storage_for_month", value.asInstanceOf[js.Any])
    
    inline def setEstimated_storage_for_month(value: Double): Self = StObject.set(x, "estimated_storage_for_month", value.asInstanceOf[js.Any])
  }
}
