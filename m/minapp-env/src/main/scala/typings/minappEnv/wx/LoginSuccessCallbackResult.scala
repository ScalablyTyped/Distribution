package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginSuccessCallbackResult extends js.Object {
  /** 用户登录凭证（有效期五分钟）。开发者需要在开发者服务器后台调用 [code2Session]((code2Session))，使用 code 换取 openid 和 session_key 等信息 */
  var code: String
}

object LoginSuccessCallbackResult {
  @scala.inline
  def apply(code: String): LoginSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginSuccessCallbackResult]
  }
}

