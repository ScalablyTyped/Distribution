package typings.octokitAuthToken.typesMod

import typings.octokitAuthToken.octokitAuthTokenStrings.installation
import typings.octokitAuthToken.octokitAuthTokenStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstallationTokenAuthentication extends Authentication {
  
  var token: Token = js.native
  
  var tokenType: installation = js.native
  
  var `type`: token = js.native
}
object InstallationTokenAuthentication {
  
  @scala.inline
  def apply(token: Token, tokenType: installation, `type`: token): InstallationTokenAuthentication = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationTokenAuthentication]
  }
  
  @scala.inline
  implicit class InstallationTokenAuthenticationOps[Self <: InstallationTokenAuthentication] (val x: Self) extends AnyVal {
    
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
    def setTokenType(value: installation): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: token): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
