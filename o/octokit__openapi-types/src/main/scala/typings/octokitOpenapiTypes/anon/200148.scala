package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200148` extends StObject {
  
  /** Response */
  var `200`: `148`
  
  var `301`: Content6
  
  var `404`: Content6
  
  var `410`: Content6
}
object `200148` {
  
  inline def apply(`200`: `148`, `301`: Content6, `404`: Content6, `410`: Content6): `200148` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200148`]
  }
  
  extension [Self <: `200148`](x: Self) {
    
    inline def set200(value: `148`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content6): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
