package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `404Content6410Content6` extends StObject {
  
  /** Response */
  var `200`: Content61
  
  var `404`: Content6
  
  var `410`: Content6
}
object `404Content6410Content6` {
  
  inline def apply(`200`: Content61, `404`: Content6, `410`: Content6): `404Content6410Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`404Content6410Content6`]
  }
  
  extension [Self <: `404Content6410Content6`](x: Self) {
    
    inline def set200(value: Content61): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content6): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
