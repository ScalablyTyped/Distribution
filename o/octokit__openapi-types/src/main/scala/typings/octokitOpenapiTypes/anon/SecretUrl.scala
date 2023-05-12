package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.form
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretUrl extends StObject {
  
  /** @enum {string} */
  var content_type: json | form
  
  var insecure_ssl: String
  
  var secret: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var url: String
}
object SecretUrl {
  
  inline def apply(content_type: json | form, insecure_ssl: String, url: String): SecretUrl = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], insecure_ssl = insecure_ssl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecretUrl] (val x: Self) extends AnyVal {
    
    inline def setContent_type(value: json | form): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setInsecure_ssl(value: String): Self = StObject.set(x, "insecure_ssl", value.asInstanceOf[js.Any])
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
