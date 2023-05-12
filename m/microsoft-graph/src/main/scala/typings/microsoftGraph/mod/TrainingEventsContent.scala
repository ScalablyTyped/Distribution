package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingEventsContent extends StObject {
  
  // List of assigned trainings and their information in an attack simulation and training campaign.
  var assignedTrainingsInfos: js.UndefOr[NullableOption[js.Array[AssignedTrainingInfo]]] = js.undefined
  
  // Number of users who were assigned trainings in an attack simulation and training campaign.
  var trainingsAssignedUserCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TrainingEventsContent {
  
  inline def apply(): TrainingEventsContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingEventsContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingEventsContent] (val x: Self) extends AnyVal {
    
    inline def setAssignedTrainingsInfos(value: NullableOption[js.Array[AssignedTrainingInfo]]): Self = StObject.set(x, "assignedTrainingsInfos", value.asInstanceOf[js.Any])
    
    inline def setAssignedTrainingsInfosNull: Self = StObject.set(x, "assignedTrainingsInfos", null)
    
    inline def setAssignedTrainingsInfosUndefined: Self = StObject.set(x, "assignedTrainingsInfos", js.undefined)
    
    inline def setAssignedTrainingsInfosVarargs(value: AssignedTrainingInfo*): Self = StObject.set(x, "assignedTrainingsInfos", js.Array(value*))
    
    inline def setTrainingsAssignedUserCount(value: NullableOption[Double]): Self = StObject.set(x, "trainingsAssignedUserCount", value.asInstanceOf[js.Any])
    
    inline def setTrainingsAssignedUserCountNull: Self = StObject.set(x, "trainingsAssignedUserCount", null)
    
    inline def setTrainingsAssignedUserCountUndefined: Self = StObject.set(x, "trainingsAssignedUserCount", js.undefined)
  }
}
