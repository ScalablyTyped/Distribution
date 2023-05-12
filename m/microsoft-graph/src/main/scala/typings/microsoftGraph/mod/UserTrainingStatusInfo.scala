package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTrainingStatusInfo extends StObject {
  
  // Date and time of assignment of the training to the user.
  var assignedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time of completion of the training by the user.
  var completionDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name of the assigned training.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed,
    * overdue, unknownFutureValue.
    */
  var trainingStatus: js.UndefOr[NullableOption[TrainingStatus]] = js.undefined
}
object UserTrainingStatusInfo {
  
  inline def apply(): UserTrainingStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTrainingStatusInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserTrainingStatusInfo] (val x: Self) extends AnyVal {
    
    inline def setAssignedDateTime(value: NullableOption[String]): Self = StObject.set(x, "assignedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAssignedDateTimeNull: Self = StObject.set(x, "assignedDateTime", null)
    
    inline def setAssignedDateTimeUndefined: Self = StObject.set(x, "assignedDateTime", js.undefined)
    
    inline def setCompletionDateTime(value: NullableOption[String]): Self = StObject.set(x, "completionDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionDateTimeNull: Self = StObject.set(x, "completionDateTime", null)
    
    inline def setCompletionDateTimeUndefined: Self = StObject.set(x, "completionDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setTrainingStatus(value: NullableOption[TrainingStatus]): Self = StObject.set(x, "trainingStatus", value.asInstanceOf[js.Any])
    
    inline def setTrainingStatusNull: Self = StObject.set(x, "trainingStatus", null)
    
    inline def setTrainingStatusUndefined: Self = StObject.set(x, "trainingStatus", js.undefined)
  }
}
