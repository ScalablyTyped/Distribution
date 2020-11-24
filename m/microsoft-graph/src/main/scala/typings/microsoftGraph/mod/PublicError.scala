package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicError extends js.Object {
  
  var code: js.UndefOr[NullableOption[String]] = js.native
  
  var details: js.UndefOr[NullableOption[js.Array[PublicErrorDetail]]] = js.native
  
  var innerError: js.UndefOr[NullableOption[PublicInnerError]] = js.native
  
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  var target: js.UndefOr[NullableOption[String]] = js.native
}
object PublicError {
  
  @scala.inline
  def apply(): PublicError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicError]
  }
  
  @scala.inline
  implicit class PublicErrorOps[Self <: PublicError] (val x: Self) extends AnyVal {
    
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
    def setDetailsVarargs(value: PublicErrorDetail*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: NullableOption[js.Array[PublicErrorDetail]]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    
    @scala.inline
    def setInnerError(value: NullableOption[PublicInnerError]): Self = this.set("innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerError: Self = this.set("innerError", js.undefined)
    
    @scala.inline
    def setInnerErrorNull: Self = this.set("innerError", null)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setTarget(value: NullableOption[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
