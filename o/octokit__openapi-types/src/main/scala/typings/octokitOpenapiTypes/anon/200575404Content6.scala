package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200575404Content6` extends StObject {
  
  /** Response */
  var `200`: `575`
  
  /** Not Found if the discussion category name is invalid */
  var `404`: Content6
}
object `200575404Content6` {
  
  inline def apply(`200`: `575`, `404`: Content6): `200575404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200575404Content6`]
  }
  
  extension [Self <: `200575404Content6`](x: Self) {
    
    inline def set200(value: `575`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
