package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineItemBudget extends StObject {
  
  /**
    * Required. The type of the budget allocation. `LINE_ITEM_BUDGET_ALLOCATION_TYPE_AUTOMATIC` is only applicable when automatic budget allocation is enabled for the parent insertion
    * order.
    */
  var budgetAllocationType: js.UndefOr[String] = js.undefined
  
  /** Output only. The budget unit specifies whether the budget is currency based or impression based. This value is inherited from the parent insertion order. */
  var budgetUnit: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum budget amount the line item will spend. Must be greater than 0. When budget_allocation_type is: * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_AUTOMATIC`, this field is immutable
    * and is set by the system. * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_FIXED`, if budget_unit is: - `BUDGET_UNIT_CURRENCY`, this field represents maximum budget amount to spend, in micros of
    * the advertiser's currency. For example, 1500000 represents 1.5 standard units of the currency. - `BUDGET_UNIT_IMPRESSIONS`, this field represents the maximum number of impressions
    * to serve. * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_UNLIMITED`, this field is not applicable and will be ignored by the system.
    */
  var maxAmount: js.UndefOr[String] = js.undefined
}
object LineItemBudget {
  
  inline def apply(): LineItemBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemBudget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineItemBudget] (val x: Self) extends AnyVal {
    
    inline def setBudgetAllocationType(value: String): Self = StObject.set(x, "budgetAllocationType", value.asInstanceOf[js.Any])
    
    inline def setBudgetAllocationTypeUndefined: Self = StObject.set(x, "budgetAllocationType", js.undefined)
    
    inline def setBudgetUnit(value: String): Self = StObject.set(x, "budgetUnit", value.asInstanceOf[js.Any])
    
    inline def setBudgetUnitUndefined: Self = StObject.set(x, "budgetUnit", js.undefined)
    
    inline def setMaxAmount(value: String): Self = StObject.set(x, "maxAmount", value.asInstanceOf[js.Any])
    
    inline def setMaxAmountUndefined: Self = StObject.set(x, "maxAmount", js.undefined)
  }
}
