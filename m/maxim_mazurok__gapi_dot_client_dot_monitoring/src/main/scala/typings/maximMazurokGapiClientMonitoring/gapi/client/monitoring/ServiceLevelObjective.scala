package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelObjective extends StObject {
  
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
  implicit class ServiceLevelObjectiveMutableBuilder[Self <: ServiceLevelObjective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarPeriod(value: String): Self = StObject.set(x, "calendarPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarPeriodUndefined: Self = StObject.set(x, "calendarPeriod", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGoal(value: Double): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRollingPeriod(value: String): Self = StObject.set(x, "rollingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingPeriodUndefined: Self = StObject.set(x, "rollingPeriod", js.undefined)
    
    @scala.inline
    def setServiceLevelIndicator(value: ServiceLevelIndicator): Self = StObject.set(x, "serviceLevelIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLevelIndicatorUndefined: Self = StObject.set(x, "serviceLevelIndicator", js.undefined)
  }
}
