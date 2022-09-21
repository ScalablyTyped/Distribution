package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2 extends StObject {
  
  var client: Any
  
  var info: OAuth2Info
  
  var redirectURI: String
  
  var req: OAuth2Req
  
  var transactionID: String
  
  var user: Any
}
object OAuth2 {
  
  inline def apply(
    client: Any,
    info: OAuth2Info,
    redirectURI: String,
    req: OAuth2Req,
    transactionID: String,
    user: Any
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2]
  }
  
  extension [Self <: OAuth2](x: Self) {
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: OAuth2Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setRedirectURI(value: String): Self = StObject.set(x, "redirectURI", value.asInstanceOf[js.Any])
    
    inline def setReq(value: OAuth2Req): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setTransactionID(value: String): Self = StObject.set(x, "transactionID", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
