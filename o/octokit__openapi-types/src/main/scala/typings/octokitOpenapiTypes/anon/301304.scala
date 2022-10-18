package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301304` extends StObject {
  
  /** Response */
  var `200`: `144`
  
  var `301`: Content6
  
  var `304`: Any
  
  var `404`: Content6
  
  var `410`: Content6
}
object `301304` {
  
  inline def apply(`200`: `144`, `301`: Content6, `304`: Any, `404`: Content6, `410`: Content6): `301304` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301304`]
  }
  
  extension [Self <: `301304`](x: Self) {
    
    inline def set200(value: `144`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content6): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
