package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  var account: IdLogin
  
  var billing_cycle: String
  
  var free_trial_ends_on: String | Null
  
  var next_billing_date: js.UndefOr[String | Null] = js.undefined
  
  var on_free_trial: Boolean | Null
  
  var plan: Bullets
  
  var unit_count: Double
}
object Plan {
  
  inline def apply(account: IdLogin, billing_cycle: String, plan: Bullets, unit_count: Double): Plan = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any], free_trial_ends_on = null, on_free_trial = null)
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: IdLogin): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBilling_cycle(value: String): Self = StObject.set(x, "billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_on(value: String): Self = StObject.set(x, "free_trial_ends_on", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_onNull: Self = StObject.set(x, "free_trial_ends_on", null)
    
    inline def setNext_billing_date(value: String): Self = StObject.set(x, "next_billing_date", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_dateNull: Self = StObject.set(x, "next_billing_date", null)
    
    inline def setNext_billing_dateUndefined: Self = StObject.set(x, "next_billing_date", js.undefined)
    
    inline def setOn_free_trial(value: Boolean): Self = StObject.set(x, "on_free_trial", value.asInstanceOf[js.Any])
    
    inline def setOn_free_trialNull: Self = StObject.set(x, "on_free_trial", null)
    
    inline def setPlan(value: Bullets): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
  }
}
