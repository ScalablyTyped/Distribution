package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content463403Content55404Content55` extends StObject {
  
  /** if child teams exist */
  var `200`: Content463
  
  var `403`: Content55
  
  var `404`: Content55
  
  var `422`: Content421
}
object `200Content463403Content55404Content55` {
  
  inline def apply(`200`: Content463, `403`: Content55, `404`: Content55, `422`: Content421): `200Content463403Content55404Content55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content463403Content55404Content55`]
  }
  
  extension [Self <: `200Content463403Content55404Content55`](x: Self) {
    
    inline def set200(value: Content463): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
