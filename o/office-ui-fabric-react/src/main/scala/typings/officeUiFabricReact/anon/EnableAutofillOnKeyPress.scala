package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableAutofillOnKeyPress extends StObject {
  
  var enableAutofillOnKeyPress: js.Array[Double] = js.native
}
object EnableAutofillOnKeyPress {
  
  @scala.inline
  def apply(enableAutofillOnKeyPress: js.Array[Double]): EnableAutofillOnKeyPress = {
    val __obj = js.Dynamic.literal(enableAutofillOnKeyPress = enableAutofillOnKeyPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAutofillOnKeyPress]
  }
  
  @scala.inline
  implicit class EnableAutofillOnKeyPressMutableBuilder[Self <: EnableAutofillOnKeyPress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableAutofillOnKeyPress(value: js.Array[Double]): Self = StObject.set(x, "enableAutofillOnKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutofillOnKeyPressVarargs(value: Double*): Self = StObject.set(x, "enableAutofillOnKeyPress", js.Array(value :_*))
  }
}
