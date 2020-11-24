package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceGoalBidStrategy extends js.Object {
  
  /** The ID of the Custom Bidding Algorithm used by this strategy. Only applicable when performance_goal_type is set to `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`. */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.native
  
  /**
    * The maximum average CPM that may be bid, in micros of the advertiser's currency. Must be greater than or equal to a billable unit of the given currency. Not applicable when
    * performance_goal_type is set to `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM`. For example, 1500000 represents 1.5 standard units of the currency.
    */
  var maxAverageCpmBidAmountMicros: js.UndefOr[String] = js.native
  
  /**
    * Required. The performance goal the bidding strategy will attempt to meet or beat, in micros of the advertiser's currency or in micro of the ROAS (Return On Advertising Spend) value
    * which is also based on advertiser's currency. Must be greater than or equal to a billable unit of the given currency and smaller or equal to upper bounds. Each performance_goal_type
    * has its upper bound: * when performance_goal_type is `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA`, upper bound is 10000.00 USD. * when performance_goal_type is
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC`, upper bound is 1000.00 USD. * when performance_goal_type is `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM`, upper bound is
    * 1000.00 USD. * when performance_goal_type is `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`, upper bound is 1000.00 and lower bound is 0.01. Example: If set to
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM`, the bid price will be based on the probability that each available impression will be viewable. For example, if viewable CPM
    * target is $2 and an impression is 40% likely to be viewable, the bid price will be $0.80 CPM (40% of $2). For example, 1500000 represents 1.5 standard units of the currency or ROAS
    * value.
    */
  var performanceGoalAmountMicros: js.UndefOr[String] = js.native
  
  /**
    * Required. The type of the performance goal that the bidding strategy will try to meet or beat. For line item level usage, the value must be one of: *
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPA` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CPC` * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM` *
    * `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`.
    */
  var performanceGoalType: js.UndefOr[String] = js.native
}
object PerformanceGoalBidStrategy {
  
  @scala.inline
  def apply(): PerformanceGoalBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceGoalBidStrategy]
  }
  
  @scala.inline
  implicit class PerformanceGoalBidStrategyOps[Self <: PerformanceGoalBidStrategy] (val x: Self) extends AnyVal {
    
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
    def setPerformanceGoalAmountMicros(value: String): Self = this.set("performanceGoalAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalAmountMicros: Self = this.set("performanceGoalAmountMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalType(value: String): Self = this.set("performanceGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalType: Self = this.set("performanceGoalType", js.undefined)
  }
}
