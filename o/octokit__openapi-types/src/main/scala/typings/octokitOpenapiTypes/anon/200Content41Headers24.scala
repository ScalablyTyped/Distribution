package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content41Headers24` extends StObject {
  
  /** Response */
  var `200`: Content41Headers24
  
  var `304`: Any
}
object `200Content41Headers24` {
  
  inline def apply(`200`: Content41Headers24, `304`: Any): `200Content41Headers24` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content41Headers24`]
  }
  
  extension [Self <: `200Content41Headers24`](x: Self) {
    
    inline def set200(value: Content41Headers24): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
