package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountInfoResponse extends StObject {
  
  /** The fixed string "identitytoolkit#GetAccountInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The info of the users. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}
object GetAccountInfoResponse {
  
  inline def apply(): GetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountInfoResponse]
  }
  
  extension [Self <: GetAccountInfoResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
