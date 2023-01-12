package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scenario_ extends StObject {
  
  /**
    * The current highest recorded company value.
    */
  var companyValueRecord: Double
  
  /**
    * The entered player name if the scenario is complete.
    */
  var completedBy: String
  
  /**
    * The company value when the scenario was completed.
    */
  var completedCompanyValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The description of the scenario, shown above the scenario objective.
    */
  var details: String
  
  /**
    * The filename of the scenario that is being played. Used to match the
    * completion score with the scenario file.
    */
  var filename: String
  
  /**
    * The name of the scenario. This is not necessarily the name of the park.
    */
  var name: String
  
  /**
    * The criteria required to complete the scenario.
    */
  var objective: ScenarioObjective
  
  /**
    * The number of consecutive days the park rating has been under the threshold for.
    * This is reset when the park rating rises above the threshold again.
    * Also used to post warning messages.
    */
  var parkRatingWarningDays: Double
  
  /**
    * The current status of the scenario.
    */
  var status: ScenarioStatus
}
object Scenario_ {
  
  inline def apply(
    companyValueRecord: Double,
    completedBy: String,
    details: String,
    filename: String,
    name: String,
    objective: ScenarioObjective,
    parkRatingWarningDays: Double,
    status: ScenarioStatus
  ): Scenario_ = {
    val __obj = js.Dynamic.literal(companyValueRecord = companyValueRecord.asInstanceOf[js.Any], completedBy = completedBy.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objective = objective.asInstanceOf[js.Any], parkRatingWarningDays = parkRatingWarningDays.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenario_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scenario_] (val x: Self) extends AnyVal {
    
    inline def setCompanyValueRecord(value: Double): Self = StObject.set(x, "companyValueRecord", value.asInstanceOf[js.Any])
    
    inline def setCompletedBy(value: String): Self = StObject.set(x, "completedBy", value.asInstanceOf[js.Any])
    
    inline def setCompletedCompanyValue(value: Double): Self = StObject.set(x, "completedCompanyValue", value.asInstanceOf[js.Any])
    
    inline def setCompletedCompanyValueUndefined: Self = StObject.set(x, "completedCompanyValue", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObjective(value: ScenarioObjective): Self = StObject.set(x, "objective", value.asInstanceOf[js.Any])
    
    inline def setParkRatingWarningDays(value: Double): Self = StObject.set(x, "parkRatingWarningDays", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ScenarioStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
