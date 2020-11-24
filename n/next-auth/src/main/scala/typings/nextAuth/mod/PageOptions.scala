package typings.nextAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageOptions extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var newUser: js.UndefOr[String | Null] = js.native
  
  var signIn: js.UndefOr[String] = js.native
  
  var signOut: js.UndefOr[String] = js.native
  
  var verifyRequest: js.UndefOr[String] = js.native
}
object PageOptions {
  
  @scala.inline
  def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit class PageOptionsOps[Self <: PageOptions] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNewUser(value: String): Self = this.set("newUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewUser: Self = this.set("newUser", js.undefined)
    
    @scala.inline
    def setNewUserNull: Self = this.set("newUser", null)
    
    @scala.inline
    def setSignIn(value: String): Self = this.set("signIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignIn: Self = this.set("signIn", js.undefined)
    
    @scala.inline
    def setSignOut(value: String): Self = this.set("signOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignOut: Self = this.set("signOut", js.undefined)
    
    @scala.inline
    def setVerifyRequest(value: String): Self = this.set("verifyRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyRequest: Self = this.set("verifyRequest", js.undefined)
  }
}
