package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200177404ContentApplicationjson` extends StObject {
  
  /** Response */
  var `200`: `177`
  
  /** Not Found if the discussion category name is invalid */
  var `404`: ContentApplicationjson
}
object `200177404ContentApplicationjson` {
  
  inline def apply(`200`: `177`, `404`: ContentApplicationjson): `200177404ContentApplicationjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200177404ContentApplicationjson`]
  }
  
  extension [Self <: `200177404ContentApplicationjson`](x: Self) {
    
    inline def set200(value: `177`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: ContentApplicationjson): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
