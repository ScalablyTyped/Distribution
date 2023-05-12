package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSimulationRepeatOffender extends StObject {
  
  // The user in an attack simulation and training campaign.
  var attackSimulationUser: js.UndefOr[NullableOption[AttackSimulationUser]] = js.undefined
  
  // Number of repeat offences of the user in attack simulation and training campaigns.
  var repeatOffenceCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttackSimulationRepeatOffender {
  
  inline def apply(): AttackSimulationRepeatOffender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSimulationRepeatOffender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackSimulationRepeatOffender] (val x: Self) extends AnyVal {
    
    inline def setAttackSimulationUser(value: NullableOption[AttackSimulationUser]): Self = StObject.set(x, "attackSimulationUser", value.asInstanceOf[js.Any])
    
    inline def setAttackSimulationUserNull: Self = StObject.set(x, "attackSimulationUser", null)
    
    inline def setAttackSimulationUserUndefined: Self = StObject.set(x, "attackSimulationUser", js.undefined)
    
    inline def setRepeatOffenceCount(value: NullableOption[Double]): Self = StObject.set(x, "repeatOffenceCount", value.asInstanceOf[js.Any])
    
    inline def setRepeatOffenceCountNull: Self = StObject.set(x, "repeatOffenceCount", null)
    
    inline def setRepeatOffenceCountUndefined: Self = StObject.set(x, "repeatOffenceCount", js.undefined)
  }
}
