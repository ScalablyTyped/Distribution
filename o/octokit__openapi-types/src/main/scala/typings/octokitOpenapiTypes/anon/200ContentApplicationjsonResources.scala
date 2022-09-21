package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonResources` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonResources
}
object `200ContentApplicationjsonResources` {
  
  inline def apply(`200`: ContentApplicationjsonResources): `200ContentApplicationjsonResources` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonResources`]
  }
  
  extension [Self <: `200ContentApplicationjsonResources`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonResources): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
