package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonError` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonError
}
object `200ContentApplicationjsonError` {
  
  inline def apply(`200`: ContentApplicationjsonError): `200ContentApplicationjsonError` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonError`]
  }
  
  extension [Self <: `200ContentApplicationjsonError`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonError): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
