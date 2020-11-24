package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrderBudget extends js.Object {
  
  /** The type of automation used to manage bid and budget for the insertion order. If this field is unspecified in creation, the value defaults to `INSERTION_ORDER_AUTOMATION_TYPE_NONE`. */
  var automationType: js.UndefOr[String] = js.native
  
  /** Required. The list of budget segments. Use a budget segment to specify a specific budget for a given period of time an insertion order is running. */
  var budgetSegments: js.UndefOr[js.Array[InsertionOrderBudgetSegment]] = js.native
  
  /** Required. Immutable. The budget unit specifies whether the budget is currency based or impression based. */
  var budgetUnit: js.UndefOr[String] = js.native
}
object InsertionOrderBudget {
  
  @scala.inline
  def apply(): InsertionOrderBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrderBudget]
  }
  
  @scala.inline
  implicit class InsertionOrderBudgetOps[Self <: InsertionOrderBudget] (val x: Self) extends AnyVal {
    
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
    def setAutomationType(value: String): Self = this.set("automationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomationType: Self = this.set("automationType", js.undefined)
    
    @scala.inline
    def setBudgetSegmentsVarargs(value: InsertionOrderBudgetSegment*): Self = this.set("budgetSegments", js.Array(value :_*))
    
    @scala.inline
    def setBudgetSegments(value: js.Array[InsertionOrderBudgetSegment]): Self = this.set("budgetSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetSegments: Self = this.set("budgetSegments", js.undefined)
    
    @scala.inline
    def setBudgetUnit(value: String): Self = this.set("budgetUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetUnit: Self = this.set("budgetUnit", js.undefined)
  }
}
