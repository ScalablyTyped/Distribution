package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Onfreetrial extends StObject {
  
  var account: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-account'] */ js.Any
  
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
  
  var plan: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-listing-plan'] */ js.Any
  
  var unit_count: Double | Null
  
  /**
    * Format: date-time
    * @example 2017-11-02T01:12:12Z
    */
  var updated_at: String | Null
}
object Onfreetrial {
  
  inline def apply(
    account: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-account'] */ js.Any,
    billing_cycle: String,
    on_free_trial: Boolean,
    plan: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-listing-plan'] */ js.Any
  ): Onfreetrial = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], billing_cycle = billing_cycle.asInstanceOf[js.Any], on_free_trial = on_free_trial.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], free_trial_ends_on = null, next_billing_date = null, unit_count = null, updated_at = null)
    __obj.asInstanceOf[Onfreetrial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Onfreetrial] (val x: Self) extends AnyVal {
    
    inline def setAccount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-account'] */ js.Any
    ): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBilling_cycle(value: String): Self = StObject.set(x, "billing_cycle", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_on(value: String): Self = StObject.set(x, "free_trial_ends_on", value.asInstanceOf[js.Any])
    
    inline def setFree_trial_ends_onNull: Self = StObject.set(x, "free_trial_ends_on", null)
    
    inline def setNext_billing_date(value: String): Self = StObject.set(x, "next_billing_date", value.asInstanceOf[js.Any])
    
    inline def setNext_billing_dateNull: Self = StObject.set(x, "next_billing_date", null)
    
    inline def setOn_free_trial(value: Boolean): Self = StObject.set(x, "on_free_trial", value.asInstanceOf[js.Any])
    
    inline def setPlan(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['marketplace-listing-plan'] */ js.Any
    ): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setUnit_count(value: Double): Self = StObject.set(x, "unit_count", value.asInstanceOf[js.Any])
    
    inline def setUnit_countNull: Self = StObject.set(x, "unit_count", null)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
