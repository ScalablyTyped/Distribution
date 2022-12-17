package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304400` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSecurityadvisory
  
  var `304`: Any
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `403`: Content48
  
  var `404`: Content48
  
  var `409`: Content48
  
  var `422`: Content395
}
object `200304400` {
  
  inline def apply(
    `200`: ContentApplicationjsonSecurityadvisory,
    `304`: Any,
    `400`: ContentApplicationjsonApplicationscimjson,
    `403`: Content48,
    `404`: Content48,
    `409`: Content48,
    `422`: Content395
  ): `200304400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304400`]
  }
  
  extension [Self <: `200304400`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSecurityadvisory): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content48): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content395): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
