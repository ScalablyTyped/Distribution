package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCheckruns` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCheckruns
}
object `200ContentApplicationjsonCheckruns` {
  
  inline def apply(`200`: ContentApplicationjsonCheckruns): `200ContentApplicationjsonCheckruns` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCheckruns`]
  }
  
  extension [Self <: `200ContentApplicationjsonCheckruns`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCheckruns): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
