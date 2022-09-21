package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content436422Content421` extends StObject {
  
  /** Response */
  var `200`: Content436
  
  var `422`: Content421
}
object `200Content436422Content421` {
  
  inline def apply(`200`: Content436, `422`: Content421): `200Content436422Content421` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content436422Content421`]
  }
  
  extension [Self <: `200Content436422Content421`](x: Self) {
    
    inline def set200(value: Content436): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
