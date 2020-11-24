package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidation extends js.Object {
  
  def Clone(): IValidation = js.native
  
  var RegularExpression: String = js.native
  
  var VBScript: String = js.native
}
object IValidation {
  
  @scala.inline
  def apply(Clone: () => IValidation, RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidation]
  }
  
  @scala.inline
  implicit class IValidationOps[Self <: IValidation] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IValidation): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegularExpression(value: String): Self = this.set("RegularExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBScript(value: String): Self = this.set("VBScript", value.asInstanceOf[js.Any])
  }
}
