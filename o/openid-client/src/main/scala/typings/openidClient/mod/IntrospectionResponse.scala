package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.X5tS256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrospectionResponse
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var active: Boolean
  
  var aud: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var cnf: js.UndefOr[X5tS256] = js.undefined
  
  var exp: js.UndefOr[Double] = js.undefined
  
  var iat: js.UndefOr[Double] = js.undefined
  
  var iss: js.UndefOr[String] = js.undefined
  
  var jti: js.UndefOr[String] = js.undefined
  
  var scope: String
  
  var sid: js.UndefOr[String] = js.undefined
  
  var token_type: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object IntrospectionResponse {
  
  inline def apply(active: Boolean, scope: String): IntrospectionResponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResponse]
  }
  
  extension [Self <: IntrospectionResponse](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAud(value: String | js.Array[String]): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
    
    inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
    
    inline def setAudVarargs(value: String*): Self = StObject.set(x, "aud", js.Array(value :_*))
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setCnf(value: X5tS256): Self = StObject.set(x, "cnf", value.asInstanceOf[js.Any])
    
    inline def setCnfUndefined: Self = StObject.set(x, "cnf", js.undefined)
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
    
    inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
    
    inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
    
    inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
    
    inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
    
    inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
