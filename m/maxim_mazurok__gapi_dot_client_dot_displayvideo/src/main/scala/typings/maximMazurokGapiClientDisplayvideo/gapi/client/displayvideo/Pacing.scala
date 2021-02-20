package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pacing extends StObject {
  
  /** Maximum number of impressions to serve every day. Applicable when the budget is impression based. Must be greater than 0. */
  var dailyMaxImpressions: js.UndefOr[String] = js.native
  
  /**
    * Maximum currency amount to spend every day in micros of advertiser's currency. Applicable when the budget is currency based. Must be greater than 0. For example, for 1.5 standard
    * unit of the currency, set this field to 1500000. The value assigned will be rounded to whole billable units for the relevant currency by the following rules: any positive value less
    * than a single billable unit will be rounded up to one billable unit and any value larger than a single billable unit will be rounded down to the nearest billable value. For example,
    * if the currency's billable unit is 0.01, and this field is set to 10257770, it will round down to 10250000, a value of 10.25. If set to 505, it will round up to 10000, a value of
    * 0.01.
    */
  var dailyMaxMicros: js.UndefOr[String] = js.native
  
  /**
    * Required. The time period in which the pacing budget will be spent. When automatic budget allocation is enabled at the insertion order via auto_budget_allocation, this field is
    * output only and defaults to `PACING_PERIOD_FLIGHT`.
    */
  var pacingPeriod: js.UndefOr[String] = js.native
  
  /** Required. The type of pacing that defines how the budget amount will be spent across the pacing_period. */
  var pacingType: js.UndefOr[String] = js.native
}
object Pacing {
  
  @scala.inline
  def apply(): Pacing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pacing]
  }
  
  @scala.inline
  implicit class PacingMutableBuilder[Self <: Pacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyMaxImpressions(value: String): Self = StObject.set(x, "dailyMaxImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyMaxImpressionsUndefined: Self = StObject.set(x, "dailyMaxImpressions", js.undefined)
    
    @scala.inline
    def setDailyMaxMicros(value: String): Self = StObject.set(x, "dailyMaxMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyMaxMicrosUndefined: Self = StObject.set(x, "dailyMaxMicros", js.undefined)
    
    @scala.inline
    def setPacingPeriod(value: String): Self = StObject.set(x, "pacingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacingPeriodUndefined: Self = StObject.set(x, "pacingPeriod", js.undefined)
    
    @scala.inline
    def setPacingType(value: String): Self = StObject.set(x, "pacingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacingTypeUndefined: Self = StObject.set(x, "pacingType", js.undefined)
  }
}
