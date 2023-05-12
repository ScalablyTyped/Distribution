package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedTrainingInfo extends StObject {
  
  // Number of users who were assigned the training in an attack simulation and training campaign.
  var assignedUserCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of users who completed the training in an attack simulation and training campaign.
  var completedUserCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Display name of the training in an attack simulation and training campaign.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AssignedTrainingInfo {
  
  inline def apply(): AssignedTrainingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedTrainingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignedTrainingInfo] (val x: Self) extends AnyVal {
    
    inline def setAssignedUserCount(value: NullableOption[Double]): Self = StObject.set(x, "assignedUserCount", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserCountNull: Self = StObject.set(x, "assignedUserCount", null)
    
    inline def setAssignedUserCountUndefined: Self = StObject.set(x, "assignedUserCount", js.undefined)
    
    inline def setCompletedUserCount(value: NullableOption[Double]): Self = StObject.set(x, "completedUserCount", value.asInstanceOf[js.Any])
    
    inline def setCompletedUserCountNull: Self = StObject.set(x, "completedUserCount", null)
    
    inline def setCompletedUserCountUndefined: Self = StObject.set(x, "completedUserCount", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
