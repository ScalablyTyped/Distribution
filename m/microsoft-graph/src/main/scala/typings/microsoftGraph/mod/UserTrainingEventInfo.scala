package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserTrainingEventInfo extends StObject {
  
  // Display name of the training.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Latest status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed,
    * overdue, unknownFutureValue.
    */
  var latestTrainingStatus: js.UndefOr[NullableOption[TrainingStatus]] = js.undefined
  
  // Event details of the training when it was assigned to the user.
  var trainingAssignedProperties: js.UndefOr[NullableOption[UserTrainingContentEventInfo]] = js.undefined
  
  // Event details of the training when it was completed by the user.
  var trainingCompletedProperties: js.UndefOr[NullableOption[UserTrainingContentEventInfo]] = js.undefined
  
  // Event details of the training when it was updated/in-progress by the user.
  var trainingUpdatedProperties: js.UndefOr[NullableOption[UserTrainingContentEventInfo]] = js.undefined
}
object UserTrainingEventInfo {
  
  inline def apply(): UserTrainingEventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserTrainingEventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserTrainingEventInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLatestTrainingStatus(value: NullableOption[TrainingStatus]): Self = StObject.set(x, "latestTrainingStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestTrainingStatusNull: Self = StObject.set(x, "latestTrainingStatus", null)
    
    inline def setLatestTrainingStatusUndefined: Self = StObject.set(x, "latestTrainingStatus", js.undefined)
    
    inline def setTrainingAssignedProperties(value: NullableOption[UserTrainingContentEventInfo]): Self = StObject.set(x, "trainingAssignedProperties", value.asInstanceOf[js.Any])
    
    inline def setTrainingAssignedPropertiesNull: Self = StObject.set(x, "trainingAssignedProperties", null)
    
    inline def setTrainingAssignedPropertiesUndefined: Self = StObject.set(x, "trainingAssignedProperties", js.undefined)
    
    inline def setTrainingCompletedProperties(value: NullableOption[UserTrainingContentEventInfo]): Self = StObject.set(x, "trainingCompletedProperties", value.asInstanceOf[js.Any])
    
    inline def setTrainingCompletedPropertiesNull: Self = StObject.set(x, "trainingCompletedProperties", null)
    
    inline def setTrainingCompletedPropertiesUndefined: Self = StObject.set(x, "trainingCompletedProperties", js.undefined)
    
    inline def setTrainingUpdatedProperties(value: NullableOption[UserTrainingContentEventInfo]): Self = StObject.set(x, "trainingUpdatedProperties", value.asInstanceOf[js.Any])
    
    inline def setTrainingUpdatedPropertiesNull: Self = StObject.set(x, "trainingUpdatedProperties", null)
    
    inline def setTrainingUpdatedPropertiesUndefined: Self = StObject.set(x, "trainingUpdatedProperties", js.undefined)
  }
}
