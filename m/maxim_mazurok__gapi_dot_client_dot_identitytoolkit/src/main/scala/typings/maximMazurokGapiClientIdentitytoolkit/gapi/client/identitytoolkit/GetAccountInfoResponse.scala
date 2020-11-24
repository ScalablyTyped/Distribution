package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountInfoResponse extends js.Object {
  
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
  implicit class GetAccountInfoResponseOps[Self <: GetAccountInfoResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
