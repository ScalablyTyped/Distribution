package typings.passportSpotify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrategyOptionsBase extends js.Object {
  
  var authorizationURL: js.UndefOr[String] = js.native
  
  var callbackURL: String = js.native
  
  var clientID: String = js.native
  
  var clientSecret: String = js.native
  
  var scope: js.UndefOr[js.Array[String]] = js.native
  
  var scopeSeparator: js.UndefOr[String] = js.native
  
  var showDialog: js.UndefOr[Boolean] = js.native
  
  var tokenURL: js.UndefOr[String] = js.native
  
  var userProfileURL: js.UndefOr[String] = js.native
}
object StrategyOptionsBase {
  
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
    
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
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    
    @scala.inline
    def setShowDialog(value: Boolean): Self = this.set("showDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDialog: Self = this.set("showDialog", js.undefined)
    
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
    
    @scala.inline
    def setUserProfileURL(value: String): Self = this.set("userProfileURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileURL: Self = this.set("userProfileURL", js.undefined)
  }
}
