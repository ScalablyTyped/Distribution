package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertionOrderBudgetSegment extends StObject {
  
  /**
    * Required. The budget amount the insertion order will spend for the given date_range. The amount is in micros. Must be greater than 0. For example, 500000000 represents 500 standard
    * units of the currency.
    */
  var budgetAmountMicros: js.UndefOr[String] = js.undefined
  
  /** The budget_id of the campaign budget that this insertion order budget segment is a part of. */
  var campaignBudgetId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The start and end date settings of the budget segment. They are resolved relative to the parent advertiser's time zone. * When creating a new budget segment, both
    * `start_date` and `end_date` must be in the future. * An existing budget segment with a `start_date` in the past has a mutable `end_date` but an immutable `start_date`. * `end_date`
    * must be the `start_date` or later, both before the year 2037.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /**
    * The budget segment description. It can be used to enter Purchase Order information for each budget segment and have that information printed on the invoices. Must be UTF-8 encoded
    * with a length of no more than 80 characters.
    */
  var description: js.UndefOr[String] = js.undefined
}
object InsertionOrderBudgetSegment {
  
  inline def apply(): InsertionOrderBudgetSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertionOrderBudgetSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertionOrderBudgetSegment] (val x: Self) extends AnyVal {
    
    inline def setBudgetAmountMicros(value: String): Self = StObject.set(x, "budgetAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setBudgetAmountMicrosUndefined: Self = StObject.set(x, "budgetAmountMicros", js.undefined)
    
    inline def setCampaignBudgetId(value: String): Self = StObject.set(x, "campaignBudgetId", value.asInstanceOf[js.Any])
    
    inline def setCampaignBudgetIdUndefined: Self = StObject.set(x, "campaignBudgetId", js.undefined)
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
