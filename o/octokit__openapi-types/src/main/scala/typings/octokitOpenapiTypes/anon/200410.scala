package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200410` extends StObject {
  
  /** Response */
  var `200`: Content146
  
  var `410`: Content6
}
object `200410` {
  
  inline def apply(`200`: Content146, `410`: Content6): `200410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200410`]
  }
  
  extension [Self <: `200410`](x: Self) {
    
    inline def set200(value: Content146): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
