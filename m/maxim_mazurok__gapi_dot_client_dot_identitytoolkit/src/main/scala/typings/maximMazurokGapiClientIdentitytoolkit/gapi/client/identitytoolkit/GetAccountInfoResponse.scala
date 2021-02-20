package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountInfoResponse extends StObject {
  
  /** The fixed string "identitytoolkit#GetAccountInfoResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The info of the users. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.native
}
object GetAccountInfoResponse {
  
  @scala.inline
  def apply(): GetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountInfoResponse]
  }
  
  @scala.inline
  implicit class GetAccountInfoResponseMutableBuilder[Self <: GetAccountInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
