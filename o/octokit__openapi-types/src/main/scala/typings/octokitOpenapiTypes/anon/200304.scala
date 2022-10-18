package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200304` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonBody
  
  var `304`: Any
  
  var `404`: Content6
}
object `200304` {
  
  inline def apply(`200`: ContentApplicationjsonBody, `304`: Any, `404`: Content6): `200304` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200304`]
  }
  
  extension [Self <: `200304`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonBody): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
