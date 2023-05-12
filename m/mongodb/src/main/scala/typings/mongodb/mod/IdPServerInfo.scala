package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdPServerInfo extends StObject {
  
  var clientId: String
  
  var issuer: String
  
  var requestScopes: js.UndefOr[js.Array[String]] = js.undefined
}
object IdPServerInfo {
  
  inline def apply(clientId: String, issuer: String): IdPServerInfo = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPServerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdPServerInfo] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setRequestScopes(value: js.Array[String]): Self = StObject.set(x, "requestScopes", value.asInstanceOf[js.Any])
    
    inline def setRequestScopesUndefined: Self = StObject.set(x, "requestScopes", js.undefined)
    
    inline def setRequestScopesVarargs(value: String*): Self = StObject.set(x, "requestScopes", js.Array(value*))
  }
}
