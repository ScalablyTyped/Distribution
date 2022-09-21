package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximizeSpendBidStrategy extends StObject {
  
  /** The ID of the Custom Bidding Algorithm used by this strategy. Only applicable when performance_goal_type is set to `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_CUSTOM_ALGO`. */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum average CPM that may be bid, in micros of the advertiser's currency. Must be greater than or equal to a billable unit of the given currency. For example, 1500000
    * represents 1.5 standard units of the currency.
    */
  var maxAverageCpmBidAmountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The type of the performance goal that the bidding strategy tries to minimize while spending the full budget. `BIDDING_STRATEGY_PERFORMANCE_GOAL_TYPE_VIEWABLE_CPM` is not
    * supported for this strategy.
    */
  var performanceGoalType: js.UndefOr[String] = js.undefined
  
  /** Whether the strategy takes deal floor prices into account. */
  var raiseBidForDeals: js.UndefOr[Boolean] = js.undefined
}
object MaximizeSpendBidStrategy {
  
  inline def apply(): MaximizeSpendBidStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximizeSpendBidStrategy]
  }
  
  extension [Self <: MaximizeSpendBidStrategy](x: Self) {
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setMaxAverageCpmBidAmountMicros(value: String): Self = StObject.set(x, "maxAverageCpmBidAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setMaxAverageCpmBidAmountMicrosUndefined: Self = StObject.set(x, "maxAverageCpmBidAmountMicros", js.undefined)
    
    inline def setPerformanceGoalType(value: String): Self = StObject.set(x, "performanceGoalType", value.asInstanceOf[js.Any])
    
    inline def setPerformanceGoalTypeUndefined: Self = StObject.set(x, "performanceGoalType", js.undefined)
    
    inline def setRaiseBidForDeals(value: Boolean): Self = StObject.set(x, "raiseBidForDeals", value.asInstanceOf[js.Any])
    
    inline def setRaiseBidForDealsUndefined: Self = StObject.set(x, "raiseBidForDeals", js.undefined)
  }
}
