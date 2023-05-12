package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSimulationSimulationUserCoverage extends StObject {
  
  // User in an attack simulation and training campaign.
  var attackSimulationUser: js.UndefOr[NullableOption[AttackSimulationUser]] = js.undefined
  
  // Number of link clicks in the received payloads by the user in attack simulation and training campaigns.
  var clickCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Number of compromising actions by the user in attack simulation and training campaigns.
  var compromisedCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Date and time of the latest attack simulation and training campaign that the user was included in.
  var latestSimulationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Number of attack simulation and training campaigns that the user was included in.
  var simulationCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttackSimulationSimulationUserCoverage {
  
  inline def apply(): AttackSimulationSimulationUserCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSimulationSimulationUserCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackSimulationSimulationUserCoverage] (val x: Self) extends AnyVal {
    
    inline def setAttackSimulationUser(value: NullableOption[AttackSimulationUser]): Self = StObject.set(x, "attackSimulationUser", value.asInstanceOf[js.Any])
    
    inline def setAttackSimulationUserNull: Self = StObject.set(x, "attackSimulationUser", null)
    
    inline def setAttackSimulationUserUndefined: Self = StObject.set(x, "attackSimulationUser", js.undefined)
    
    inline def setClickCount(value: NullableOption[Double]): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountNull: Self = StObject.set(x, "clickCount", null)
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setCompromisedCount(value: NullableOption[Double]): Self = StObject.set(x, "compromisedCount", value.asInstanceOf[js.Any])
    
    inline def setCompromisedCountNull: Self = StObject.set(x, "compromisedCount", null)
    
    inline def setCompromisedCountUndefined: Self = StObject.set(x, "compromisedCount", js.undefined)
    
    inline def setLatestSimulationDateTime(value: NullableOption[String]): Self = StObject.set(x, "latestSimulationDateTime", value.asInstanceOf[js.Any])
    
    inline def setLatestSimulationDateTimeNull: Self = StObject.set(x, "latestSimulationDateTime", null)
    
    inline def setLatestSimulationDateTimeUndefined: Self = StObject.set(x, "latestSimulationDateTime", js.undefined)
    
    inline def setSimulationCount(value: NullableOption[Double]): Self = StObject.set(x, "simulationCount", value.asInstanceOf[js.Any])
    
    inline def setSimulationCountNull: Self = StObject.set(x, "simulationCount", null)
    
    inline def setSimulationCountUndefined: Self = StObject.set(x, "simulationCount", js.undefined)
  }
}
