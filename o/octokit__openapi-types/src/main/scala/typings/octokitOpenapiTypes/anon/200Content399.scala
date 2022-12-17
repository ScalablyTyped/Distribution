package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content399` extends StObject {
  
  /** Response */
  var `200`: Content399
  
  var `304`: Any
}
object `200Content399` {
  
  inline def apply(`200`: Content399, `304`: Any): `200Content399` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content399`]
  }
  
  extension [Self <: `200Content399`](x: Self) {
    
    inline def set200(value: Content399): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
  }
}
