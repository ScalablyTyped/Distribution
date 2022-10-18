package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonArray
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content8
}
object `400` {
  
  inline def apply(
    `200`: ContentApplicationjsonArray,
    `400`: ContentApplicationjsonApplicationscimjson,
    `422`: Content8
  ): `400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400`]
  }
  
  extension [Self <: `400`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
