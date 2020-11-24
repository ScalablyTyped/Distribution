package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnenoteOperationError extends js.Object {
  
  // The error code.
  var code: js.UndefOr[NullableOption[String]] = js.native
  
  // The error message.
  var message: js.UndefOr[NullableOption[String]] = js.native
}
object OnenoteOperationError {
  
  @scala.inline
  def apply(): OnenoteOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteOperationError]
  }
  
  @scala.inline
  implicit class OnenoteOperationErrorOps[Self <: OnenoteOperationError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: NullableOption[String]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
  }
}
