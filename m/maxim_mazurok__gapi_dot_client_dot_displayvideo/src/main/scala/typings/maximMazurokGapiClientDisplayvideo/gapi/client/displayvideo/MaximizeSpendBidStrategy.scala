package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximizeSpendBidStrategy extends js.Object {
  
  /** The ID of the Custom Bidding Algorithm used by this strategy. Only applicable when performance_goal_type is set to `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`. */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.native
  
  /**
    * The maximum average CPM that may be bid, in micros of the advertiser's currency. Must be greater than or equal to a billable unit of the given currency. For example, 1500000
    * represents 1.5 standard units of the currency.
    */
  var maxAverageCpmBidAmountMicros: js.UndefOr[String] = js.native
  
  /**
    * Required. The type of the performance goal that the bidding strategy tries to minimize while spending the full budget. `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM` is not
    * supported for this strategy.
    */
  var performanceGoalType: js.UndefOr[String] = js.native
}
object MaximizeSpendBidStrategy {
  
  @scala.inline
  def apply(): MaximizeSpendBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximizeSpendBidStrategy]
  }
  
  @scala.inline
  implicit class MaximizeSpendBidStrategyOps[Self <: MaximizeSpendBidStrategy] (val x: Self) extends AnyVal {
    
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
    def setCustomBiddingAlgorithmId(value: String): Self = this.set("customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomBiddingAlgorithmId: Self = this.set("customBiddingAlgorithmId", js.undefined)
    
    @scala.inline
    def setMaxAverageCpmBidAmountMicros(value: String): Self = this.set("maxAverageCpmBidAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAverageCpmBidAmountMicros: Self = this.set("maxAverageCpmBidAmountMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalType(value: String): Self = this.set("performanceGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalType: Self = this.set("performanceGoalType", js.undefined)
  }
}
