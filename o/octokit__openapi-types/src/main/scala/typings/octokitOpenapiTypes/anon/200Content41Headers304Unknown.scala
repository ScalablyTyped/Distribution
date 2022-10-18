package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content41Headers304Unknown` extends StObject {
  
  /** Response */
  var `200`: Content41Headers
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
}
object `200Content41Headers304Unknown` {
  
  inline def apply(`200`: Content41Headers, `304`: Any, `401`: Content6, `403`: Content6): `200Content41Headers304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content41Headers304Unknown`]
  }
  
  extension [Self <: `200Content41Headers304Unknown`](x: Self) {
    
    inline def set200(value: Content41Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
