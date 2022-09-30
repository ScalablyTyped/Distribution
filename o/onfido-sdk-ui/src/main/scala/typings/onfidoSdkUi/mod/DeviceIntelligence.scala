package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceIntelligence extends StObject {
  
  var passive_signals: PassiveSignals
}
object DeviceIntelligence {
  
  inline def apply(passive_signals: PassiveSignals): DeviceIntelligence = {
    val __obj = js.Dynamic.literal(passive_signals = passive_signals.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceIntelligence]
  }
  
  extension [Self <: DeviceIntelligence](x: Self) {
    
    inline def setPassive_signals(value: PassiveSignals): Self = StObject.set(x, "passive_signals", value.asInstanceOf[js.Any])
  }
}
