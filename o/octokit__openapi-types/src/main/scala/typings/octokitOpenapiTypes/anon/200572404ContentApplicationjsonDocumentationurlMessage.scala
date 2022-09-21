package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200572404ContentApplicationjsonDocumentationurlMessage` extends StObject {
  
  /** Response */
  var `200`: `572`
  
  /** Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjsonDocumentationurlMessage
}
object `200572404ContentApplicationjsonDocumentationurlMessage` {
  
  inline def apply(`200`: `572`, `404`: ContentApplicationjsonDocumentationurlMessage): `200572404ContentApplicationjsonDocumentationurlMessage` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200572404ContentApplicationjsonDocumentationurlMessage`]
  }
  
  extension [Self <: `200572404ContentApplicationjsonDocumentationurlMessage`](x: Self) {
    
    inline def set200(value: `572`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
