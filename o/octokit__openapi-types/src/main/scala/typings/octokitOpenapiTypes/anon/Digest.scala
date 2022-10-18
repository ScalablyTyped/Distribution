package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digest extends StObject {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  /** @example "sha256" */
  var digest: js.UndefOr[String] = js.undefined
  
  /** @example "foo@bar.com" */
  var email: js.UndefOr[String] = js.undefined
  
  var insecure_ssl: js.UndefOr[String | Double] = js.undefined
  
  /** @example "foo" */
  var password: js.UndefOr[String] = js.undefined
  
  /** @example "roomer" */
  var room: js.UndefOr[String] = js.undefined
  
  var secret: js.UndefOr[String] = js.undefined
  
  /** @example "foo" */
  var subdomain: js.UndefOr[String] = js.undefined
  
  /** @example "abc" */
  var token: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Digest {
  
  inline def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  
  extension [Self <: Digest](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInsecure_ssl(value: String | Double): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
    
    inline def setSubdomainUndefined: Self = StObject.set(x, "subdomain", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
