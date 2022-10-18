package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonClientsecret` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonClientsecret
}
object `200ContentApplicationjsonClientsecret` {
  
  inline def apply(`200`: ContentApplicationjsonClientsecret): `200ContentApplicationjsonClientsecret` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonClientsecret`]
  }
  
  extension [Self <: `200ContentApplicationjsonClientsecret`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonClientsecret): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
