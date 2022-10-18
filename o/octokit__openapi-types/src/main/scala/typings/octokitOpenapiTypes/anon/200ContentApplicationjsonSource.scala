package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSource` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSource
  
  var `304`: Any
}
object `200ContentApplicationjsonSource` {
  
  inline def apply(`200`: ContentApplicationjsonSource, `304`: Any): `200ContentApplicationjsonSource` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSource`]
  }
  
  extension [Self <: `200ContentApplicationjsonSource`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSource): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
