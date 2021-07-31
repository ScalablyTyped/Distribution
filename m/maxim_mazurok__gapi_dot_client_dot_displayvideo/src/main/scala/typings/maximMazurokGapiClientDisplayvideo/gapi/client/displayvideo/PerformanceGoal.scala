package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceGoal extends StObject {
  
  /**
    * The goal amount, in micros of the advertiser's currency. Applicable when performance_goal_type is one of: * `PERFORMANCE_GOAL_TYPE_CPM` * `PERFORMANCE_GOAL_TYPE_CPC` *
    * `PERFORMANCE_GOAL_TYPE_CPA` * `PERFORMANCE_GOAL_TYPE_CPIAVC` For example 1500000 represents 1.5 standard units of the currency.
    */
  var performanceGoalAmountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The decimal representation of the goal percentage in micros. Applicable when performance_goal_type is one of: * `PERFORMANCE_GOAL_TYPE_CTR` * `PERFORMANCE_GOAL_TYPE_VIEWABILITY` For
    * example, 70000 represents 7% (decimal 0.07).
    */
  var performanceGoalPercentageMicros: js.UndefOr[String] = js.undefined
  
  /**
    * A key performance indicator (KPI) string, which can be empty. Must be UTF-8 encoded with a length of no more than 100 characters. Applicable when performance_goal_type is set to
    * `PERFORMANCE_GOAL_TYPE_OTHER`.
    */
  var performanceGoalString: js.UndefOr[String] = js.undefined
  
  /** Required. The type of the performance goal. */
  var performanceGoalType: js.UndefOr[String] = js.undefined
}
object PerformanceGoal {
  
  @scala.inline
  def apply(): PerformanceGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceGoal]
  }
  
  @scala.inline
  implicit class PerformanceGoalMutableBuilder[Self <: PerformanceGoal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerformanceGoalAmountMicros(value: String): Self = StObject.set(x, "performanceGoalAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceGoalAmountMicrosUndefined: Self = StObject.set(x, "performanceGoalAmountMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalPercentageMicros(value: String): Self = StObject.set(x, "performanceGoalPercentageMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceGoalPercentageMicrosUndefined: Self = StObject.set(x, "performanceGoalPercentageMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalString(value: String): Self = StObject.set(x, "performanceGoalString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceGoalStringUndefined: Self = StObject.set(x, "performanceGoalString", js.undefined)
    
    @scala.inline
    def setPerformanceGoalType(value: String): Self = StObject.set(x, "performanceGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceGoalTypeUndefined: Self = StObject.set(x, "performanceGoalType", js.undefined)
  }
}
