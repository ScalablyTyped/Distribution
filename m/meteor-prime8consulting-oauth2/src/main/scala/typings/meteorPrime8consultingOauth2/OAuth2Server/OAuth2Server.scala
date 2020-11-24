package typings.meteorPrime8consultingOauth2.OAuth2Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Server extends js.Object {
  
  var callMethod: CallMethod = js.native
  
  var collections: Collections = js.native
  
  var methodNames: MethodNames = js.native
  
  var oauthserver: js.Any = js.native
  
  var pubSubNames: PubSubNames = js.native
  
  var subscribeTo: SubscribeTo = js.native
}
object OAuth2Server {
  
  @scala.inline
  def apply(
    callMethod: CallMethod,
    collections: Collections,
    methodNames: MethodNames,
    oauthserver: js.Any,
    pubSubNames: PubSubNames,
    subscribeTo: SubscribeTo
  ): OAuth2Server = {
    val __obj = js.Dynamic.literal(callMethod = callMethod.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], methodNames = methodNames.asInstanceOf[js.Any], oauthserver = oauthserver.asInstanceOf[js.Any], pubSubNames = pubSubNames.asInstanceOf[js.Any], subscribeTo = subscribeTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Server]
  }
  
  @scala.inline
  implicit class OAuth2ServerOps[Self <: typings.meteorPrime8consultingOauth2.OAuth2Server.OAuth2Server] (val x: Self) extends AnyVal {
    
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
    def setCallMethod(value: CallMethod): Self = this.set("callMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollections(value: Collections): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNames(value: MethodNames): Self = this.set("methodNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthserver(value: js.Any): Self = this.set("oauthserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubSubNames(value: PubSubNames): Self = this.set("pubSubNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribeTo(value: SubscribeTo): Self = this.set("subscribeTo", value.asInstanceOf[js.Any])
  }
}
