package typings.microsoftAjax.Sys.Net

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServiceError extends js.Object {
  
  def get_errorObject(): js.Any = js.native
  
  def get_exceptionType(): js.Any = js.native
  
  def get_message(): String = js.native
  
  def get_stackTrace(): String = js.native
  
  def get_statusCode(): Double = js.native
  
  def get_timedOut(): Boolean = js.native
}
object WebServiceError {
  
  @scala.inline
  def apply(
    get_errorObject: () => js.Any,
    get_exceptionType: () => js.Any,
    get_message: () => String,
    get_stackTrace: () => String,
    get_statusCode: () => Double,
    get_timedOut: () => Boolean
  ): WebServiceError = {
    val __obj = js.Dynamic.literal(get_errorObject = js.Any.fromFunction0(get_errorObject), get_exceptionType = js.Any.fromFunction0(get_exceptionType), get_message = js.Any.fromFunction0(get_message), get_stackTrace = js.Any.fromFunction0(get_stackTrace), get_statusCode = js.Any.fromFunction0(get_statusCode), get_timedOut = js.Any.fromFunction0(get_timedOut))
    __obj.asInstanceOf[WebServiceError]
  }
  
  @scala.inline
  implicit class WebServiceErrorOps[Self <: WebServiceError] (val x: Self) extends AnyVal {
    
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
    def setGet_errorObject(value: () => js.Any): Self = this.set("get_errorObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_exceptionType(value: () => js.Any): Self = this.set("get_exceptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_message(value: () => String): Self = this.set("get_message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_stackTrace(value: () => String): Self = this.set("get_stackTrace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_statusCode(value: () => Double): Self = this.set("get_statusCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_timedOut(value: () => Boolean): Self = this.set("get_timedOut", js.Any.fromFunction0(value))
  }
}
