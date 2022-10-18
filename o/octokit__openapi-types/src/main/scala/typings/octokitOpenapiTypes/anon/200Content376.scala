package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content376` extends StObject {
  
  /** Response */
  var `200`: Content376
  
  /** Response */
  var `201`: Content376
}
object `200Content376` {
  
  inline def apply(`200`: Content376, `201`: Content376): `200Content376` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content376`]
  }
  
  extension [Self <: `200Content376`](x: Self) {
    
    inline def set200(value: Content376): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: Content376): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
