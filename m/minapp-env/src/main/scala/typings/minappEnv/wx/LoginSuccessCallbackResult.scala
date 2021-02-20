package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginSuccessCallbackResult extends StObject {
  
  /** 用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 [code2Session]((code2Session))，使用 code 换取 openid 和 session_key 等信息 */
  var code: String = js.native
}
object LoginSuccessCallbackResult {
  
  @scala.inline
  def apply(code: String): LoginSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class LoginSuccessCallbackResultMutableBuilder[Self <: LoginSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
