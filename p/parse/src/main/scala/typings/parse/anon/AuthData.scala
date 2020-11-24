package typings.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthData extends js.Object {
  
  var authData: js.UndefOr[typings.parse.mod.global.Parse.AuthData] = js.native
}
object AuthData {
  
  @scala.inline
  def apply(): AuthData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthData]
  }
  
  @scala.inline
  implicit class AuthDataOps[Self <: AuthData] (val x: Self) extends AnyVal {
    
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
    def setAuthData(value: typings.parse.mod.global.Parse.AuthData): Self = this.set("authData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthData: Self = this.set("authData", js.undefined)
  }
}
