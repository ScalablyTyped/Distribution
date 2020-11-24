package typings.passportTwitchLatest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateRet extends js.Object {
  
  var force_verify: js.UndefOr[Boolean] = js.native
}
object AuthenticateRet {
  
  @scala.inline
  def apply(): AuthenticateRet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateRet]
  }
  
  @scala.inline
  implicit class AuthenticateRetOps[Self <: AuthenticateRet] (val x: Self) extends AnyVal {
    
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
    def setForce_verify(value: Boolean): Self = this.set("force_verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_verify: Self = this.set("force_verify", js.undefined)
  }
}
