package typings.nodeZendesk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var asUser: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var disableGlobalState: js.UndefOr[Boolean] = js.native
  
  var oauth: js.UndefOr[Boolean] = js.native
  
  var remoteUri: String = js.native
  
  var token: String = js.native
  
  var username: String = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(remoteUri: String, token: String, username: String): ClientOptions = {
    val __obj = js.Dynamic.literal(remoteUri = remoteUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setRemoteUri(value: String): Self = this.set("remoteUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUser(value: String): Self = this.set("asUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsUser: Self = this.set("asUser", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDisableGlobalState(value: Boolean): Self = this.set("disableGlobalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableGlobalState: Self = this.set("disableGlobalState", js.undefined)
    
    @scala.inline
    def setOauth(value: Boolean): Self = this.set("oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth: Self = this.set("oauth", js.undefined)
  }
}
