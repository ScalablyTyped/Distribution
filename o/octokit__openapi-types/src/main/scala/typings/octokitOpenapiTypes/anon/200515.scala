package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200515` extends StObject {
  
  /** Response */
  var `200`: `515`
  
  var `404`: Content48
}
object `200515` {
  
  inline def apply(`200`: `515`, `404`: Content48): `200515` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200515`]
  }
  
  extension [Self <: `200515`](x: Self) {
    
    inline def set200(value: `515`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
