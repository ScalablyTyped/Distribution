package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200621404ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** @description Response */
  var `200`: `621`
  
  /** @description Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `200621404ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`200`: `621`, `404`: ContentApplicationjsonDocumentationurlMessage): `200621404ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200621404ContentApplicationjsonDocumentationurlMessage`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200621404ContentApplicationjsonDocumentationurlMessage`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `621`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
