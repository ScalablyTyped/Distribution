package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content27404Content6` extends StObject {
  
  /** Response */
  var `200`: Content27
  
  var `404`: Content6
}
object `200Content27404Content6` {
  
  inline def apply(`200`: Content27, `404`: Content6): `200Content27404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content27404Content6`]
  }
  
  extension [Self <: `200Content27404Content6`](x: Self) {
    
    inline def set200(value: Content27): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
