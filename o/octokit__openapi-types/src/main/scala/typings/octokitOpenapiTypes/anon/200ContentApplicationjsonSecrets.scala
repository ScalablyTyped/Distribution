package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonSecrets` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonSecrets
}
object `200ContentApplicationjsonSecrets` {
  
  inline def apply(`200`: ContentApplicationjsonSecrets): `200ContentApplicationjsonSecrets` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonSecrets`]
  }
  
  extension [Self <: `200ContentApplicationjsonSecrets`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonSecrets): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
