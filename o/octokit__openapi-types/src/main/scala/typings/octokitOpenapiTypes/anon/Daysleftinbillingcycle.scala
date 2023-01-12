package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Daysleftinbillingcycle extends StObject {
  
  /** @description Numbers of days left in billing cycle. */
  var days_left_in_billing_cycle: Double
  
  /** @description Estimated storage space (GB) used in billing cycle. */
  var estimated_paid_storage_for_month: Double
  
  /** @description Estimated sum of free and paid storage space (GB) used in billing cycle. */
  var estimated_storage_for_month: Double
}
object Daysleftinbillingcycle {
  
  inline def apply(
    days_left_in_billing_cycle: Double,
    estimated_paid_storage_for_month: Double,
    estimated_storage_for_month: Double
  ): Daysleftinbillingcycle = {
    val __obj = js.Dynamic.literal(days_left_in_billing_cycle = days_left_in_billing_cycle.asInstanceOf[js.Any], estimated_paid_storage_for_month = estimated_paid_storage_for_month.asInstanceOf[js.Any], estimated_storage_for_month = estimated_storage_for_month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Daysleftinbillingcycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Daysleftinbillingcycle] (val x: Self) extends AnyVal {
    
    inline def setDays_left_in_billing_cycle(value: Double): Self = StObject.set(x, "days_left_in_billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setEstimated_paid_storage_for_month(value: Double): Self = StObject.set(x, "estimated_paid_storage_for_month", value.asInstanceOf[js.Any])
    
    inline def setEstimated_storage_for_month(value: Double): Self = StObject.set(x, "estimated_storage_for_month", value.asInstanceOf[js.Any])
  }
}
