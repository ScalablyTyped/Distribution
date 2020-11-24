package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertionOrderBudgetSegment extends js.Object {
  
  /**
    * Required. The budget amount the insertion order will spend for the given date_range. The amount is in micros. Must be greater than 0. For example, 500000000 represents 500 standard
    * units of the currency.
    */
  var budgetAmountMicros: js.UndefOr[String] = js.native
  
  /** The ID of the campaign budget linked to this insertion order budget segment. */
  var campaignBudgetId: js.UndefOr[String] = js.native
  
  /**
    * Required. The start and end date settings of the budget segment. They are resolved relative to the parent advertiser's time zone. * When creating a new budget segment, both
    * `start_date` and `end_date` must be in the future. * An existing budget segment with a `start_date` in the past has a mutable `end_date` but an immutable `start_date`. * `end_date`
    * must be the `start_date` or later, both before the year 2037.
    */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /**
    * The budget segment description. It can be used to enter Purchase Order information for each budget segment and have that information printed on the invoices. Must be UTF-8 encoded
    * with a length of no more than 80 characters.
    */
  var description: js.UndefOr[String] = js.native
}
object InsertionOrderBudgetSegment {
  
  @scala.inline
  def apply(): InsertionOrderBudgetSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrderBudgetSegment]
  }
  
  @scala.inline
  implicit class InsertionOrderBudgetSegmentOps[Self <: InsertionOrderBudgetSegment] (val x: Self) extends AnyVal {
    
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
    def setBudgetAmountMicros(value: String): Self = this.set("budgetAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBudgetAmountMicros: Self = this.set("budgetAmountMicros", js.undefined)
    
    @scala.inline
    def setCampaignBudgetId(value: String): Self = this.set("campaignBudgetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignBudgetId: Self = this.set("campaignBudgetId", js.undefined)
    
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
