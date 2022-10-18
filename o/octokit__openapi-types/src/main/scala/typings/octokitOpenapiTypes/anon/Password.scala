package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Password extends StObject {
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var insecure_ssl: js.UndefOr[String | Double] = js.undefined
  
  /** @example "password" */
  var password: js.UndefOr[String] = js.undefined
  
  var secret: js.UndefOr[String] = js.undefined
  
  var url: String
  
  /** @example "kdaigle" */
  var username: js.UndefOr[String] = js.undefined
}
object Password {
  
  inline def apply(url: String): Password = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  extension [Self <: Password](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setInsecure_ssl(value: String | Double): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
