package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.oauth
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthTokenAuthentication extends Authentication {
  
  var token: Token = js.native
  
  var tokenType: oauth = js.native
  
  var `type`: token = js.native
}
object OAuthTokenAuthentication {
  
  @scala.inline
  def apply(token: Token, tokenType: oauth, `type`: token): OAuthTokenAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthTokenAuthentication]
  }
  
  @scala.inline
  implicit class OAuthTokenAuthenticationOps[Self <: OAuthTokenAuthentication] (val x: Self) extends AnyVal {
    
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
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: oauth): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: token): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
