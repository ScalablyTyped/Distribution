package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Freetrialendson extends StObject {
  
  var account: Organizationbillingemail
  
  /** @example monthly */
  var billing_cycle: String
  
  /**
    * Format: date-time
    * @example 2017-11-11T00:00:00Z
    */
  var free_trial_ends_on: String | Null
  
  /**
    * Format: date-time
    * @example 2017-11-11T00:00:00Z
    */
  var next_billing_date: String | Null
  
  /** @example true */
  var on_free_trial: Boolean
  
  var plan: Accountsurl
  
  var unit_count: Double | Null
  
  /**
    * Format: date-time
    * @example 2017-11-02T01:12:12Z
    */
  var updated_at: String | Null
}
object Freetrialendson {
  
  inline def apply(
    account: Organizationbillingemail,
    billing_cycle: String,
    on_free_trial: Boolean,
    plan: Accountsurl
  ): Freetrialendson = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], free_trial_ends_on = null, next_billing_date = null, unit_count = null, updated_at = null)
    __obj.asInstanceOf[Freetrialendson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Freetrialendson] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Organizationbillingemail): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBilling_cycle(value: String): Self = StObject.set(x, "billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_on(value: String): Self = StObject.set(x, "free_trial_ends_on", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_onNull: Self = StObject.set(x, "free_trial_ends_on", null)
    
    inline def setNext_billing_date(value: String): Self = StObject.set(x, "next_billing_date", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_dateNull: Self = StObject.set(x, "next_billing_date", null)
    
    inline def setOn_free_trial(value: Boolean): Self = StObject.set(x, "on_free_trial", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Accountsurl): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUnit_countNull: Self = StObject.set(x, "unit_count", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
