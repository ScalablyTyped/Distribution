package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItemBudget extends js.Object {
  
  /**
    * Required. The type of the budget allocation. `LINE_ITEM_BUDGET_ALLOCATION_TYPE_AUTOMATIC` is only applicable when automatic budget allocation is enabled for the parent insertion
    * order.
    */
  var budgetAllocationType: js.UndefOr[String] = js.native
  
  /** Output only. The budget unit specifies whether the budget is currency based or impression based. This value is inherited from the parent insertion order. */
  var budgetUnit: js.UndefOr[String] = js.native
  
  /**
    * The maximum budget amount the line item will spend. Must be greater than 0. When budget_allocation_type is: * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_AUTOMATIC`, this field is immutable
    * and is set by the system. * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_FIXED`, if budget_unit is: - `BUDGET_UNIT_CURRENCY`, this field represents maximum budget amount to spend, in micros of
    * the advertiser's currency. For example, 1500000 represents 1.5 standard units of the currency. - `BUDGET_UNIT_IMPRESSIONS`, this field represents the maximum number of impressions
    * to serve. * `LINE_ITEM_BUDGET_ALLOCATION_TYPE_UNLIMITED`, this field is not applicable and will be ignored by the system.
    */
  var maxAmount: js.UndefOr[String] = js.native
}
object LineItemBudget {
  
  @scala.inline
  def apply(): LineItemBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItemBudget]
  }
  
  @scala.inline
  implicit class LineItemBudgetOps[Self <: LineItemBudget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBudgetAllocationType(value: String): Self = this.set("budgetAllocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetAllocationType: Self = this.set("budgetAllocationType", js.undefined)
    
    @scala.inline
    def setBudgetUnit(value: String): Self = this.set("budgetUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetUnit: Self = this.set("budgetUnit", js.undefined)
    
    @scala.inline
    def setMaxAmount(value: String): Self = this.set("maxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAmount: Self = this.set("maxAmount", js.undefined)
  }
}
