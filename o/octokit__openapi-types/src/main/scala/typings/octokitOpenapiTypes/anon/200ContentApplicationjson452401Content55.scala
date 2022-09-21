package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjson452401Content55` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjson452
  
  var `401`: Content55
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `500`: Content55
}
object `200ContentApplicationjson452401Content55` {
  
  inline def apply(
    `200`: ContentApplicationjson452,
    `401`: Content55,
    `403`: Content55,
    `404`: Content55,
    `500`: Content55
  ): `200ContentApplicationjson452401Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjson452401Content55`]
  }
  
  extension [Self <: `200ContentApplicationjson452401Content55`](x: Self) {
    
    inline def set200(value: ContentApplicationjson452): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content55): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
