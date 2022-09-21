package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404405` extends StObject {
  
  /** if merge was successful */
  var `200`: ContentApplicationjsonMerged
  
  var `403`: Content55
  
  var `404`: Content55
  
  /** Method Not Allowed if merge cannot be performed */
  var `405`: ContentApplicationjsonDocumentationurl
  
  /** Conflict if sha was provided and pull request head did not match */
  var `409`: ContentApplicationjsonDocumentationurl
  
  var `422`: Content421
}
object `404405` {
  
  inline def apply(
    `200`: ContentApplicationjsonMerged,
    `403`: Content55,
    `404`: Content55,
    `405`: ContentApplicationjsonDocumentationurl,
    `409`: ContentApplicationjsonDocumentationurl,
    `422`: Content421
  ): `404405` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("405")(`405`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404405`]
  }
  
  extension [Self <: `404405`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonMerged): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set405(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "405", value.asInstanceOf[js.Any])
    
    inline def set409(value: ContentApplicationjsonDocumentationurl): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
