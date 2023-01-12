package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.mod.ClaimsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthTime
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var accountId: String
  
  var acr: js.UndefOr[String] = js.undefined
  
  var amr: js.UndefOr[js.Array[String]] = js.undefined
  
  var authTime: js.UndefOr[Double] = js.undefined
  
  var claims: js.UndefOr[ClaimsParameter] = js.undefined
  
  var client: typings.oidcProvider.mod.Client
  
  var expiresWithSession: js.UndefOr[Boolean] = js.undefined
  
  var grantId: String
  
  var gty: String
  
  var jkt: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var scope: String
  
  var sessionUid: js.UndefOr[String] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.undefined
}
object AuthTime {
  
  inline def apply(
    accountId: String,
    client: typings.oidcProvider.mod.Client,
    grantId: String,
    gty: String,
    scope: String
  ): AuthTime = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], grantId = grantId.asInstanceOf[js.Any], gty = gty.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthTime] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAcr(value: String): Self = StObject.set(x, "acr", value.asInstanceOf[js.Any])
    
    inline def setAcrUndefined: Self = StObject.set(x, "acr", js.undefined)
    
    inline def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
    
    inline def setAmrUndefined: Self = StObject.set(x, "amr", js.undefined)
    
    inline def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value*))
    
    inline def setAuthTime(value: Double): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setAuthTimeUndefined: Self = StObject.set(x, "authTime", js.undefined)
    
    inline def setClaims(value: ClaimsParameter): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClient(value: typings.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setExpiresWithSession(value: Boolean): Self = StObject.set(x, "expiresWithSession", value.asInstanceOf[js.Any])
    
    inline def setExpiresWithSessionUndefined: Self = StObject.set(x, "expiresWithSession", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setGty(value: String): Self = StObject.set(x, "gty", value.asInstanceOf[js.Any])
    
    inline def setJkt(value: String): Self = StObject.set(x, "jkt", value.asInstanceOf[js.Any])
    
    inline def setJktUndefined: Self = StObject.set(x, "jkt", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setResource(value: String | js.Array[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceVarargs(value: String*): Self = StObject.set(x, "resource", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSessionUid(value: String): Self = StObject.set(x, "sessionUid", value.asInstanceOf[js.Any])
    
    inline def setSessionUidUndefined: Self = StObject.set(x, "sessionUid", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setX5tNumbersignS256(value: String): Self = StObject.set(x, "x5t#S256", value.asInstanceOf[js.Any])
    
    inline def setX5tNumbersignS256Undefined: Self = StObject.set(x, "x5t#S256", js.undefined)
  }
}
