package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  var asUser: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var disableGlobalState: js.UndefOr[Boolean] = js.undefined
  
  var oauth: js.UndefOr[Boolean] = js.undefined
  
  var remoteUri: String
  
  var token: String
  
  var username: String
}
object ClientOptions {
  
  @scala.inline
  def apply(remoteUri: String, token: String, username: String): ClientOptions = {
    val __obj = js.Dynamic.literal(remoteUri = remoteUri.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsUser(value: String): Self = StObject.set(x, "asUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUserUndefined: Self = StObject.set(x, "asUser", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDisableGlobalState(value: Boolean): Self = StObject.set(x, "disableGlobalState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGlobalStateUndefined: Self = StObject.set(x, "disableGlobalState", js.undefined)
    
    @scala.inline
    def setOauth(value: Boolean): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    @scala.inline
    def setRemoteUri(value: String): Self = StObject.set(x, "remoteUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
