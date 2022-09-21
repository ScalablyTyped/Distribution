package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonErrorsArray` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonErrorsArray
  
  /** Resource not found */
  var `404`: Any
}
object `200ContentApplicationjsonErrorsArray` {
  
  inline def apply(`200`: ContentApplicationjsonErrorsArray, `404`: Any): `200ContentApplicationjsonErrorsArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonErrorsArray`]
  }
  
  extension [Self <: `200ContentApplicationjsonErrorsArray`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonErrorsArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
