package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Freetrialendson extends StObject {
  
  var account: Organizationbillingemail
  
  var billing_cycle: String
  
  var free_trial_ends_on: String
  
  var next_billing_date: String
  
  var on_free_trial: Boolean
  
  var plan: Bullets
  
  var unit_count: Double
  
  var updated_at: String
}
object Freetrialendson {
  
  inline def apply(
    account: Organizationbillingemail,
    billing_cycle: String,
    free_trial_ends_on: String,
    next_billing_date: String,
    on_free_trial: Boolean,
    plan: Bullets,
    unit_count: Double,
    updated_at: String
  ): Freetrialendson = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], free_trial_ends_on = free_trial_ends_on.asInstanceOf[js.Any], next_billing_date = next_billing_date.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Freetrialendson]
  }
  
  extension [Self <: Freetrialendson](x: Self) {
    
    inline def setAccount(value: Organizationbillingemail): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBilling_cycle(value: String): Self = StObject.set(x, "billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_on(value: String): Self = StObject.set(x, "free_trial_ends_on", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_date(value: String): Self = StObject.set(x, "next_billing_date", value.asInstanceOf[js.Any])
    
    inline def setOn_free_trial(value: Boolean): Self = StObject.set(x, "on_free_trial", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Bullets): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
