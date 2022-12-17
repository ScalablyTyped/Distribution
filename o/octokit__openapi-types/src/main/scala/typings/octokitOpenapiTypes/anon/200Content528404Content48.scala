package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content528404Content48` extends StObject {
  
  /** Response */
  var `200`: Content528
  
  var `404`: Content48
  
  var `410`: Content48
}
object `200Content528404Content48` {
  
  inline def apply(`200`: Content528, `404`: Content48, `410`: Content48): `200Content528404Content48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content528404Content48`]
  }
  
  extension [Self <: `200Content528404Content48`](x: Self) {
    
    inline def set200(value: Content528): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content48): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
