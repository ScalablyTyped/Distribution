package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonConditions` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonConditions
  
  var `304`: Any
  
  var `403`: Content6
  
  var `404`: Content6
}
object `200ContentApplicationjsonConditions` {
  
  inline def apply(`200`: ContentApplicationjsonConditions, `304`: Any, `403`: Content6, `404`: Content6): `200ContentApplicationjsonConditions` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonConditions`]
  }
  
  extension [Self <: `200ContentApplicationjsonConditions`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonConditions): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
