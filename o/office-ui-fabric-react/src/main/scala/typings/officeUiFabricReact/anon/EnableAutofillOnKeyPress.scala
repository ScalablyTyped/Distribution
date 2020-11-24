package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableAutofillOnKeyPress extends js.Object {
  
  var enableAutofillOnKeyPress: js.Array[Double] = js.native
}
object EnableAutofillOnKeyPress {
  
  @scala.inline
  def apply(enableAutofillOnKeyPress: js.Array[Double]): EnableAutofillOnKeyPress = {
    val __obj = js.Dynamic.literal(enableAutofillOnKeyPress = enableAutofillOnKeyPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAutofillOnKeyPress]
  }
  
  @scala.inline
  implicit class EnableAutofillOnKeyPressOps[Self <: EnableAutofillOnKeyPress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnableAutofillOnKeyPressVarargs(value: Double*): Self = this.set("enableAutofillOnKeyPress", js.Array(value :_*))
    
    @scala.inline
    def setEnableAutofillOnKeyPress(value: js.Array[Double]): Self = this.set("enableAutofillOnKeyPress", value.asInstanceOf[js.Any])
  }
}
