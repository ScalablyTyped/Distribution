package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content531` extends StObject {
  
  /** Response */
  var `200`: Content531
  
  var `410`: Content48
}
object `200Content531` {
  
  inline def apply(`200`: Content531, `410`: Content48): `200Content531` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content531`]
  }
  
  extension [Self <: `200Content531`](x: Self) {
    
    inline def set200(value: Content531): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
