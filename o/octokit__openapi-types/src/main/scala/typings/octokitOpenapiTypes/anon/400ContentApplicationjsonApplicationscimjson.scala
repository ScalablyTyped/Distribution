package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400ContentApplicationjsonApplicationscimjson` extends StObject {
  
  /** Response */
  var `200`: Content52
  
  var `400`: ContentApplicationjsonApplicationscimjson
}
object `400ContentApplicationjsonApplicationscimjson` {
  
  inline def apply(`200`: Content52, `400`: ContentApplicationjsonApplicationscimjson): `400ContentApplicationjsonApplicationscimjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400ContentApplicationjsonApplicationscimjson`]
  }
  
  extension [Self <: `400ContentApplicationjsonApplicationscimjson`](x: Self) {
    
    inline def set200(value: Content52): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
  }
}
