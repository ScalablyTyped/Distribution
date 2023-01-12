package typings.oidcProvider.mod

import typings.oidcProvider.anon.Encrypt
import typings.oidcProvider.anon.Kid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServer extends StObject {
  
  var accessTokenFormat: js.UndefOr[TokenFormat] = js.undefined
  
  var accessTokenTTL: js.UndefOr[Double] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var jwt: js.UndefOr[Encrypt] = js.undefined
  
  var paseto: js.UndefOr[Kid] = js.undefined
  
  var scope: String
}
object ResourceServer {
  
  inline def apply(scope: String): ResourceServer = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceServer] (val x: Self) extends AnyVal {
    
    inline def setAccessTokenFormat(value: TokenFormat): Self = StObject.set(x, "accessTokenFormat", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenFormatUndefined: Self = StObject.set(x, "accessTokenFormat", js.undefined)
    
    inline def setAccessTokenTTL(value: Double): Self = StObject.set(x, "accessTokenTTL", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenTTLUndefined: Self = StObject.set(x, "accessTokenTTL", js.undefined)
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setJwt(value: Encrypt): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setPaseto(value: Kid): Self = StObject.set(x, "paseto", value.asInstanceOf[js.Any])
    
    inline def setPasetoUndefined: Self = StObject.set(x, "paseto", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
