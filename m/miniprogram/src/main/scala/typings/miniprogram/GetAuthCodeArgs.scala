package typings.miniprogram

import typings.miniprogram.anon.AuthCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthCodeArgs extends AsyncCallback[AuthCode] {
  
  /**
    * The scope of auth, there are 12 types:
    * `USER_ID`,
    * `USER_NICKNAME`,
    * `USER_NAME`, `USER_LOGIN_ID`,
    * `HASH_LOGIN_ID`,
    * `USER_AVATAR`, `USER_GENDER`,
    * `USER_BIRTHDAY`,
    * `USER_NATIONALITY`,
    * `USER_CONTACTINFO`,
    * `auth_base`,
    * `auth_user`.
    */
  var scopes: String | js.Array[String] = js.native
}
object GetAuthCodeArgs {
  
  @scala.inline
  def apply(scopes: String | js.Array[String]): GetAuthCodeArgs = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthCodeArgs]
  }
  
  @scala.inline
  implicit class GetAuthCodeArgsOps[Self <: GetAuthCodeArgs] (val x: Self) extends AnyVal {
    
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
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: String | js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
}
