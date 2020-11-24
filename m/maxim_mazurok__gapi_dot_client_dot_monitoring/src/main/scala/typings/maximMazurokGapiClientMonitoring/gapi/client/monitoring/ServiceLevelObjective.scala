package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelObjective extends js.Object {
  
  /** A calendar period, semantically "since the start of the current ". At this time, only DAY, WEEK, FORTNIGHT, and MONTH are supported. */
  var calendarPeriod: js.UndefOr[String] = js.native
  
  /** Name used for UI elements listing this SLO. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The fraction of service that must be good in order for this objective to be met. 0 < goal <= 0.999. */
  var goal: js.UndefOr[Double] = js.native
  
  /** Resource name for this ServiceLevelObjective. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME] */
  var name: js.UndefOr[String] = js.native
  
  /** A rolling time period, semantically "in the past ". Must be an integer multiple of 1 day no larger than 30 days. */
  var rollingPeriod: js.UndefOr[String] = js.native
  
  /** The definition of good service, used to measure and calculate the quality of the Service's performance with respect to a single aspect of service quality. */
  var serviceLevelIndicator: js.UndefOr[ServiceLevelIndicator] = js.native
}
object ServiceLevelObjective {
  
  @scala.inline
  def apply(): ServiceLevelObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLevelObjective]
  }
  
  @scala.inline
  implicit class ServiceLevelObjectiveOps[Self <: ServiceLevelObjective] (val x: Self) extends AnyVal {
    
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
    def setCalendarPeriod(value: String): Self = this.set("calendarPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarPeriod: Self = this.set("calendarPeriod", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGoal(value: Double): Self = this.set("goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRollingPeriod(value: String): Self = this.set("rollingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingPeriod: Self = this.set("rollingPeriod", js.undefined)
    
    @scala.inline
    def setServiceLevelIndicator(value: ServiceLevelIndicator): Self = this.set("serviceLevelIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceLevelIndicator: Self = this.set("serviceLevelIndicator", js.undefined)
  }
}
