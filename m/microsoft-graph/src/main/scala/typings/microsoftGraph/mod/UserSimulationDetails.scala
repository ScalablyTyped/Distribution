package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSimulationDetails extends StObject {
  
  // Number of trainings assigned to a user in an attack simulation and training campaign.
  var assignedTrainingsCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of trainings completed by a user in an attack simulation and training campaign.
  var completedTrainingsCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Date and time of the compromising online action by a user in an attack simulation and training campaign.
  var compromisedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of trainings in progress by a user in an attack simulation and training campaign.
  var inProgressTrainingsCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether a user was compromised in an attack simulation and training campaign.
  var isCompromised: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Date and time when a user reported the delivered payload as phishing in the attack simulation and training campaign.
  var reportedPhishDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // List of simulation events of a user in the attack simulation and training campaign.
  var simulationEvents: js.UndefOr[NullableOption[js.Array[UserSimulationEventInfo]]] = js.undefined
  
  // User in an attack simulation and training campaign.
  var simulationUser: js.UndefOr[NullableOption[AttackSimulationUser]] = js.undefined
  
  // List of training events of a user in the attack simulation and training campaign.
  var trainingEvents: js.UndefOr[NullableOption[js.Array[UserTrainingEventInfo]]] = js.undefined
}
object UserSimulationDetails {
  
  inline def apply(): UserSimulationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSimulationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSimulationDetails] (val x: Self) extends AnyVal {
    
    inline def setAssignedTrainingsCount(value: NullableOption[Double]): Self = StObject.set(x, "assignedTrainingsCount", value.asInstanceOf[js.Any])
    
    inline def setAssignedTrainingsCountNull: Self = StObject.set(x, "assignedTrainingsCount", null)
    
    inline def setAssignedTrainingsCountUndefined: Self = StObject.set(x, "assignedTrainingsCount", js.undefined)
    
    inline def setCompletedTrainingsCount(value: NullableOption[Double]): Self = StObject.set(x, "completedTrainingsCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedTrainingsCountNull: Self = StObject.set(x, "completedTrainingsCount", null)
    
    inline def setCompletedTrainingsCountUndefined: Self = StObject.set(x, "completedTrainingsCount", js.undefined)
    
    inline def setCompromisedDateTime(value: NullableOption[String]): Self = StObject.set(x, "compromisedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompromisedDateTimeNull: Self = StObject.set(x, "compromisedDateTime", null)
    
    inline def setCompromisedDateTimeUndefined: Self = StObject.set(x, "compromisedDateTime", js.undefined)
    
    inline def setInProgressTrainingsCount(value: NullableOption[Double]): Self = StObject.set(x, "inProgressTrainingsCount", value.asInstanceOf[js.Any])
    
    inline def setInProgressTrainingsCountNull: Self = StObject.set(x, "inProgressTrainingsCount", null)
    
    inline def setInProgressTrainingsCountUndefined: Self = StObject.set(x, "inProgressTrainingsCount", js.undefined)
    
    inline def setIsCompromised(value: NullableOption[Boolean]): Self = StObject.set(x, "isCompromised", value.asInstanceOf[js.Any])
    
    inline def setIsCompromisedNull: Self = StObject.set(x, "isCompromised", null)
    
    inline def setIsCompromisedUndefined: Self = StObject.set(x, "isCompromised", js.undefined)
    
    inline def setReportedPhishDateTime(value: NullableOption[String]): Self = StObject.set(x, "reportedPhishDateTime", value.asInstanceOf[js.Any])
    
    inline def setReportedPhishDateTimeNull: Self = StObject.set(x, "reportedPhishDateTime", null)
    
    inline def setReportedPhishDateTimeUndefined: Self = StObject.set(x, "reportedPhishDateTime", js.undefined)
    
    inline def setSimulationEvents(value: NullableOption[js.Array[UserSimulationEventInfo]]): Self = StObject.set(x, "simulationEvents", value.asInstanceOf[js.Any])
    
    inline def setSimulationEventsNull: Self = StObject.set(x, "simulationEvents", null)
    
    inline def setSimulationEventsUndefined: Self = StObject.set(x, "simulationEvents", js.undefined)
    
    inline def setSimulationEventsVarargs(value: UserSimulationEventInfo*): Self = StObject.set(x, "simulationEvents", js.Array(value*))
    
    inline def setSimulationUser(value: NullableOption[AttackSimulationUser]): Self = StObject.set(x, "simulationUser", value.asInstanceOf[js.Any])
    
    inline def setSimulationUserNull: Self = StObject.set(x, "simulationUser", null)
    
    inline def setSimulationUserUndefined: Self = StObject.set(x, "simulationUser", js.undefined)
    
    inline def setTrainingEvents(value: NullableOption[js.Array[UserTrainingEventInfo]]): Self = StObject.set(x, "trainingEvents", value.asInstanceOf[js.Any])
    
    inline def setTrainingEventsNull: Self = StObject.set(x, "trainingEvents", null)
    
    inline def setTrainingEventsUndefined: Self = StObject.set(x, "trainingEvents", js.undefined)
    
    inline def setTrainingEventsVarargs(value: UserTrainingEventInfo*): Self = StObject.set(x, "trainingEvents", js.Array(value*))
  }
}
