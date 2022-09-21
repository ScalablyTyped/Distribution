package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAutofillOnKeyPress extends StObject {
  
  var enableAutofillOnKeyPress: js.Array[Double]
}
object EnableAutofillOnKeyPress {
  
  inline def apply(enableAutofillOnKeyPress: js.Array[Double]): EnableAutofillOnKeyPress = {
    val __obj = js.Dynamic.literal(enableAutofillOnKeyPress = enableAutofillOnKeyPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAutofillOnKeyPress]
  }
  
  extension [Self <: EnableAutofillOnKeyPress](x: Self) {
    
    inline def setEnableAutofillOnKeyPress(value: js.Array[Double]): Self = StObject.set(x, "enableAutofillOnKeyPress", value.asInstanceOf[js.Any])
    
    inline def setEnableAutofillOnKeyPressVarargs(value: Double*): Self = StObject.set(x, "enableAutofillOnKeyPress", js.Array(value*))
  }
}
