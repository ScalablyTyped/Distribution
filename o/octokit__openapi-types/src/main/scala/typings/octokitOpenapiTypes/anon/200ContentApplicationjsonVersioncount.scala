package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonVersioncount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonVersioncount
}
object `200ContentApplicationjsonVersioncount` {
  
  inline def apply(`200`: ContentApplicationjsonVersioncount): `200ContentApplicationjsonVersioncount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonVersioncount`]
  }
  
  extension [Self <: `200ContentApplicationjsonVersioncount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonVersioncount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
