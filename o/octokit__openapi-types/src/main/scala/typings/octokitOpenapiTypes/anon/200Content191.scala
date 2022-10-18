package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content191` extends StObject {
  
  /** Response */
  var `200`: Content191
  
  var `403`: Content6
}
object `200Content191` {
  
  inline def apply(`200`: Content191, `403`: Content6): `200Content191` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content191`]
  }
  
  extension [Self <: `200Content191`](x: Self) {
    
    inline def set200(value: Content191): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
