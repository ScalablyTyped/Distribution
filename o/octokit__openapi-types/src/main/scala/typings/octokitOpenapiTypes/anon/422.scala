package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonDeliveredat
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content8
}
object `422` {
  
  inline def apply(
    `200`: ContentApplicationjsonDeliveredat,
    `400`: ContentApplicationjsonApplicationscimjson,
    `422`: Content8
  ): `422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`422`]
  }
  
  extension [Self <: `422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonDeliveredat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
