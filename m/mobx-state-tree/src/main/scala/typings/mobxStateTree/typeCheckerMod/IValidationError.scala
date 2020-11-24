package typings.mobxStateTree.typeCheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidationError extends js.Object {
  
  /** Validation context */
  var context: IValidationContext = js.native
  
  /** Error message */
  var message: js.UndefOr[String] = js.native
  
  /** Value that was being validated, either a snapshot or an instance */
  var value: js.Any = js.native
}
object IValidationError {
  
  @scala.inline
  def apply(context: IValidationContext, value: js.Any): IValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidationError]
  }
  
  @scala.inline
  implicit class IValidationErrorOps[Self <: IValidationError] (val x: Self) extends AnyVal {
    
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
    def setContextVarargs(value: IValidationContextEntry*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: IValidationContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
