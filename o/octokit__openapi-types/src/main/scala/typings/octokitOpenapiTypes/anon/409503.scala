package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409503` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonRecord
  
  /** @description Response */
  var `202`: ContentApplicationjsonRunurl
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `409`: Content41
  
  var `503`: ContentApplicationjsonCodeDocumentationurlMessage
}
object `409503` {
  
  inline def apply(
    `200`: ContentApplicationjsonRecord,
    `202`: ContentApplicationjsonRunurl,
    `403`: Content41,
    `404`: Content41,
    `409`: Content41,
    `503`: ContentApplicationjsonCodeDocumentationurlMessage
  ): `409503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonRecord): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonRunurl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content41): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set503(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
