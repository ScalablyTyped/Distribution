package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassiveSignals extends StObject {
  
  var enabled: Boolean
}
object PassiveSignals {
  
  inline def apply(enabled: Boolean): PassiveSignals = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassiveSignals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PassiveSignals] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
