package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409500` extends StObject {
  
  /** Response */
  var `200`: Content499
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `404`: Content48
  
  var `409`: Content48
  
  var `500`: Content48
}
object `409500` {
  
  inline def apply(
    `200`: Content499,
    `400`: ContentApplicationjsonApplicationscimjson,
    `404`: Content48,
    `409`: Content48,
    `500`: Content48
  ): `409500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409500`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `409500`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content499): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content48): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content48): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
