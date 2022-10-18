package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content47403Content6404Content6` extends StObject {
  
  /** if child teams exist */
  var `200`: Content47
  
  var `403`: Content6
  
  var `404`: Content6
  
  var `422`: Content8
}
object `200Content47403Content6404Content6` {
  
  inline def apply(`200`: Content47, `403`: Content6, `404`: Content6, `422`: Content8): `200Content47403Content6404Content6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content47403Content6404Content6`]
  }
  
  extension [Self <: `200Content47403Content6404Content6`](x: Self) {
    
    inline def set200(value: Content47): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
