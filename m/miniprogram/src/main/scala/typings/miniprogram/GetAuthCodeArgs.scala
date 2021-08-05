package typings.miniprogram

import typings.miniprogram.anon.AuthCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthCodeArgs
  extends StObject
     with AsyncCallback[AuthCode] {
  
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
  var scopes: String | js.Array[String]
}
object GetAuthCodeArgs {
  
  inline def apply(scopes: String | js.Array[String]): GetAuthCodeArgs = {
    val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthCodeArgs]
  }
  
  extension [Self <: GetAuthCodeArgs](x: Self) {
    
    inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
  }
}
