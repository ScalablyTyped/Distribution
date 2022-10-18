package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content87Headers` extends StObject {
  
  /** Response */
  var `200`: Content87Headers
}
object `200Content87Headers` {
  
  inline def apply(`200`: Content87Headers): `200Content87Headers` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content87Headers`]
  }
  
  extension [Self <: `200Content87Headers`](x: Self) {
    
    inline def set200(value: Content87Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
