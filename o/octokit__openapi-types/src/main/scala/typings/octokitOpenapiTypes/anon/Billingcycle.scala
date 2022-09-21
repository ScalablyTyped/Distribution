package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billingcycle extends StObject {
  
  var billing_cycle: js.UndefOr[String] = js.undefined
  
  var free_trial_ends_on: js.UndefOr[String | Null] = js.undefined
  
  var is_installed: js.UndefOr[Boolean] = js.undefined
  
  var next_billing_date: js.UndefOr[String | Null] = js.undefined
  
  var on_free_trial: js.UndefOr[Boolean] = js.undefined
  
  var plan: js.UndefOr[Accountsurl] = js.undefined
  
  var unit_count: js.UndefOr[Double | Null] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
}
object Billingcycle {
  
  inline def apply(): Billingcycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billingcycle]
  }
  
  extension [Self <: Billingcycle](x: Self) {
    
    inline def setBilling_cycle(value: String): Self = StObject.set(x, "billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setBilling_cycleUndefined: Self = StObject.set(x, "billing_cycle", js.undefined)
    
    inline def setFree_trial_ends_on(value: String): Self = StObject.set(x, "free_trial_ends_on", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_onNull: Self = StObject.set(x, "free_trial_ends_on", null)
    
    inline def setFree_trial_ends_onUndefined: Self = StObject.set(x, "free_trial_ends_on", js.undefined)
    
    inline def setIs_installed(value: Boolean): Self = StObject.set(x, "is_installed", value.asInstanceOf[js.Any])
    
    inline def setIs_installedUndefined: Self = StObject.set(x, "is_installed", js.undefined)
    
    inline def setNext_billing_date(value: String): Self = StObject.set(x, "next_billing_date", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_dateNull: Self = StObject.set(x, "next_billing_date", null)
    
    inline def setNext_billing_dateUndefined: Self = StObject.set(x, "next_billing_date", js.undefined)
    
    inline def setOn_free_trial(value: Boolean): Self = StObject.set(x, "on_free_trial", value.asInstanceOf[js.Any])
    
    inline def setOn_free_trialUndefined: Self = StObject.set(x, "on_free_trial", js.undefined)
    
    inline def setPlan(value: Accountsurl): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUnit_countNull: Self = StObject.set(x, "unit_count", null)
    
    inline def setUnit_countUndefined: Self = StObject.set(x, "unit_count", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
  }
}
