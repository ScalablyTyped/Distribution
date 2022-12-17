package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content425304Unknown` extends StObject {
  
  /** Response */
  var `200`: Content425
  
  var `304`: Any
  
  var `404`: Content48
}
object `200Content425304Unknown` {
  
  inline def apply(`200`: Content425, `304`: Any, `404`: Content48): `200Content425304Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content425304Unknown`]
  }
  
  extension [Self <: `200Content425304Unknown`](x: Self) {
    
    inline def set200(value: Content425): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
