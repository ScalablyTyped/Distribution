package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400403404` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationscimjsonActiveDisplayName
  
  var `304`: Any
  
  var `400`: Content592
  
  var `403`: Content592
  
  var `404`: Content592
  
  /** Response */
  var `429`: ContentApplicationjsonDocumentationurlMessage
}
object `400403404` {
  
  inline def apply(
    `200`: ContentApplicationscimjsonActiveDisplayName,
    `304`: Any,
    `400`: Content592,
    `403`: Content592,
    `404`: Content592,
    `429`: ContentApplicationjsonDocumentationurlMessage
  ): `400403404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("429")(`429`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400403404`]
  }
  
  extension [Self <: `400403404`](x: Self) {
    
    inline def set200(value: ContentApplicationscimjsonActiveDisplayName): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set400(value: Content592): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content592): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content592): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set429(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "429", value.asInstanceOf[js.Any])
  }
}
