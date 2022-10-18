package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content210` extends StObject {
  
  /** Response */
  var `200`: Content210
  
  var `304`: Any
  
  var `401`: Content6
}
object `200Content210` {
  
  inline def apply(`200`: Content210, `304`: Any, `401`: Content6): `200Content210` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content210`]
  }
  
  extension [Self <: `200Content210`](x: Self) {
    
    inline def set200(value: Content210): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
