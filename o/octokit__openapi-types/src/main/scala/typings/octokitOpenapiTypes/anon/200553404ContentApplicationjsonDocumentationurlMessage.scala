package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200553404ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Response */
  var `200`: `553`
  
  /** Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `200553404ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`200`: `553`, `404`: ContentApplicationjsonDocumentationurlMessage): `200553404ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200553404ContentApplicationjsonDocumentationurlMessage`]
  }
  
  extension [Self <: `200553404ContentApplicationjsonDocumentationurlMessage`](x: Self) {
    
    inline def set200(value: `553`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
