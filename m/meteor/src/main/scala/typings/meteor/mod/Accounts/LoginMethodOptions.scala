package typings.meteor.mod.Accounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginMethodOptions extends js.Object {
  
  /**
    * The arguments for the method
    */
  var methodArguments: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The method to call (default 'login')
    */
  var methodName: js.UndefOr[String] = js.native
  
  /**
    * Will be called with no arguments once the user is fully
    * logged in, or with the error on error.
    */
  var userCallback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]] = js.native
  
  /**
    * If provided, will be called with the result of the
    * method. If it throws, the client will not be logged in (and
    * its error will be passed to the callback).
    */
  var validateResult: js.UndefOr[js.Function] = js.native
}
object LoginMethodOptions {
  
  @scala.inline
  def apply(): LoginMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginMethodOptions]
  }
  
  @scala.inline
  implicit class LoginMethodOptionsOps[Self <: LoginMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setMethodArgumentsVarargs(value: js.Any*): Self = this.set("methodArguments", js.Array(value :_*))
    
    @scala.inline
    def setMethodArguments(value: js.Array[_]): Self = this.set("methodArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodArguments: Self = this.set("methodArguments", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
    
    @scala.inline
    def setUserCallback(value: /* err */ js.UndefOr[js.Any] => Unit): Self = this.set("userCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUserCallback: Self = this.set("userCallback", js.undefined)
    
    @scala.inline
    def setValidateResult(value: js.Function): Self = this.set("validateResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateResult: Self = this.set("validateResult", js.undefined)
  }
}
