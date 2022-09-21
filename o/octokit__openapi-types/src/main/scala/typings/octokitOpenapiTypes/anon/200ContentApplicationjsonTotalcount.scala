package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonTotalcount
}
object `200ContentApplicationjsonTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonTotalcount): `200ContentApplicationjsonTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonTotalcount`]
  }
  
  extension [Self <: `200ContentApplicationjsonTotalcount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
