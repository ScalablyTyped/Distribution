package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200403` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonClientsecret
  
  var `403`: Content6
  
  var `404`: Content6
}
object `200403` {
  
  inline def apply(`200`: ContentApplicationjsonClientsecret, `403`: Content6, `404`: Content6): `200403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200403`]
  }
  
  extension [Self <: `200403`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonClientsecret): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
