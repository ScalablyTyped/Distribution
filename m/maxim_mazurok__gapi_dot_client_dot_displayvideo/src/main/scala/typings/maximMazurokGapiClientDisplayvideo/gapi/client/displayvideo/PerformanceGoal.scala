package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceGoal extends js.Object {
  
  /**
    * The goal amount, in micros of the advertiser's currency. Applicable when performance_goal_type is one of: * `PERFORMANCE_GOAL_TYPE_CPM` * `PERFORMANCE_GOAL_TYPE_CPC` *
    * `PERFORMANCE_GOAL_TYPE_CPA` * `PERFORMANCE_GOAL_TYPE_CPIAVC` For example 1500000 represents 1.5 standard units of the currency.
    */
  var performanceGoalAmountMicros: js.UndefOr[String] = js.native
  
  /**
    * The decimal representation of the goal percentage in micros. Applicable when performance_goal_type is one of: * `PERFORMANCE_GOAL_TYPE_CTR` * `PERFORMANCE_GOAL_TYPE_VIEWABILITY` For
    * example, 70000 represents 7% (decimal 0.07).
    */
  var performanceGoalPercentageMicros: js.UndefOr[String] = js.native
  
  /**
    * A key performance indicator (KPI) string, which can be empty. Must be UTF-8 encoded with a length of no more than 100 characters. Applicable when performance_goal_type is set to
    * `PERFORMANCE_GOAL_TYPE_OTHER`.
    */
  var performanceGoalString: js.UndefOr[String] = js.native
  
  /** Required. The type of the performance goal. */
  var performanceGoalType: js.UndefOr[String] = js.native
}
object PerformanceGoal {
  
  @scala.inline
  def apply(): PerformanceGoal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceGoal]
  }
  
  @scala.inline
  implicit class PerformanceGoalOps[Self <: PerformanceGoal] (val x: Self) extends AnyVal {
    
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
    def setPerformanceGoalAmountMicros(value: String): Self = this.set("performanceGoalAmountMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalAmountMicros: Self = this.set("performanceGoalAmountMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalPercentageMicros(value: String): Self = this.set("performanceGoalPercentageMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalPercentageMicros: Self = this.set("performanceGoalPercentageMicros", js.undefined)
    
    @scala.inline
    def setPerformanceGoalString(value: String): Self = this.set("performanceGoalString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalString: Self = this.set("performanceGoalString", js.undefined)
    
    @scala.inline
    def setPerformanceGoalType(value: String): Self = this.set("performanceGoalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformanceGoalType: Self = this.set("performanceGoalType", js.undefined)
  }
}
