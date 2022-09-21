package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content550` extends StObject {
  
  /** Response */
  var `200`: Content550
  
  var `410`: Content55
}
object `200Content550` {
  
  inline def apply(`200`: Content550, `410`: Content55): `200Content550` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content550`]
  }
  
  extension [Self <: `200Content550`](x: Self) {
    
    inline def set200(value: Content550): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content55): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
