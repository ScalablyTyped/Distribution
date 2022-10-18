package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400404` extends StObject {
  
  /** Response */
  var `200`: Content111
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content6
  
  var `409`: Content6
  
  var `500`: Content6
}
object `400404` {
  
  inline def apply(
    `200`: Content111,
    `400`: ContentApplicationjsonApplicationscimjson,
    `404`: Content6,
    `409`: Content6,
    `500`: Content6
  ): `400404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400404`]
  }
  
  extension [Self <: `400404`](x: Self) {
    
    inline def set200(value: Content111): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content6): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
