package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSimulationTrainingUserCoverage extends StObject {
  
  // User in an attack simulation and training campaign.
  var attackSimulationUser: js.UndefOr[NullableOption[AttackSimulationUser]] = js.undefined
  
  // List of assigned trainings and their statuses for the user.
  var userTrainings: js.UndefOr[NullableOption[js.Array[UserTrainingStatusInfo]]] = js.undefined
}
object AttackSimulationTrainingUserCoverage {
  
  inline def apply(): AttackSimulationTrainingUserCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSimulationTrainingUserCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackSimulationTrainingUserCoverage] (val x: Self) extends AnyVal {
    
    inline def setAttackSimulationUser(value: NullableOption[AttackSimulationUser]): Self = StObject.set(x, "attackSimulationUser", value.asInstanceOf[js.Any])
    
    inline def setAttackSimulationUserNull: Self = StObject.set(x, "attackSimulationUser", null)
    
    inline def setAttackSimulationUserUndefined: Self = StObject.set(x, "attackSimulationUser", js.undefined)
    
    inline def setUserTrainings(value: NullableOption[js.Array[UserTrainingStatusInfo]]): Self = StObject.set(x, "userTrainings", value.asInstanceOf[js.Any])
    
    inline def setUserTrainingsNull: Self = StObject.set(x, "userTrainings", null)
    
    inline def setUserTrainingsUndefined: Self = StObject.set(x, "userTrainings", js.undefined)
    
    inline def setUserTrainingsVarargs(value: UserTrainingStatusInfo*): Self = StObject.set(x, "userTrainings", js.Array(value*))
  }
}
