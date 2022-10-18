package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Insecuressl extends StObject {
  
  /** @example "form" */
  var content_type: js.UndefOr[String] = js.undefined
  
  /** @example "0" */
  var insecure_ssl: js.UndefOr[String] = js.undefined
  
  /** @example "********" */
  var secret: js.UndefOr[String] = js.undefined
  
  /** @example "http://example.com/2" */
  var url: js.UndefOr[String] = js.undefined
}
object Insecuressl {
  
  inline def apply(): Insecuressl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insecuressl]
  }
  
  extension [Self <: Insecuressl](x: Self) {
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setInsecure_ssl(value: String): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setInsecure_sslUndefined: Self = StObject.set(x, "insecure_ssl", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
