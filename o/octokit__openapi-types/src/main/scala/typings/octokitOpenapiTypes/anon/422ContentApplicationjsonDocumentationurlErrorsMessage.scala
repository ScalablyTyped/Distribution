package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422ContentApplicationjsonDocumentationurlErrorsMessage` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreditsdetailed
  
  var `403`: Content41
  
  var `404`: Content41
  
  /** @description Validation failed, or the endpoint has been spammed. */
  var `422`: ContentApplicationjsonDocumentationurlErrorsMessage
}
object `422ContentApplicationjsonDocumentationurlErrorsMessage` {
  
  inline def apply(
    `200`: ContentApplicationjsonCreditsdetailed,
    `403`: Content41,
    `404`: Content41,
    `422`: ContentApplicationjsonDocumentationurlErrorsMessage
  ): `422ContentApplicationjsonDocumentationurlErrorsMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422ContentApplicationjsonDocumentationurlErrorsMessage`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `422ContentApplicationjsonDocumentationurlErrorsMessage`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreditsdetailed): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: ContentApplicationjsonDocumentationurlErrorsMessage): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
