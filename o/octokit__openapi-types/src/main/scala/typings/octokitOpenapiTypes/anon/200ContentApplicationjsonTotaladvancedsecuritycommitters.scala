package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTotaladvancedsecuritycommitters` extends StObject {
  
  /** Success */
  var `200`: ContentApplicationjsonTotaladvancedsecuritycommitters
  
  var `403`: Content6
}
object `200ContentApplicationjsonTotaladvancedsecuritycommitters` {
  
  inline def apply(`200`: ContentApplicationjsonTotaladvancedsecuritycommitters, `403`: Content6): `200ContentApplicationjsonTotaladvancedsecuritycommitters` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTotaladvancedsecuritycommitters`]
  }
  
  extension [Self <: `200ContentApplicationjsonTotaladvancedsecuritycommitters`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonTotaladvancedsecuritycommitters): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
