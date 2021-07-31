package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2Req extends StObject {
  
  var clientID: String
  
  var redirectURI: String
  
  var scope: String
  
  var state: String
  
  var transactionID: String
  
  var `type`: String
}
object OAuth2Req {
  
  @scala.inline
  def apply(
    clientID: String,
    redirectURI: String,
    scope: String,
    state: String,
    transactionID: String,
    `type`: String
  ): OAuth2Req = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Req]
  }
  
  @scala.inline
  implicit class OAuth2ReqMutableBuilder[Self <: OAuth2Req] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURI(value: String): Self = StObject.set(x, "redirectURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
