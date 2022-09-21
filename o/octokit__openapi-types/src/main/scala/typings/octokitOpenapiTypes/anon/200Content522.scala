package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content522` extends StObject {
  
  /** Response */
  var `200`: Content522
  
  var `422`: Content421
}
object `200Content522` {
  
  inline def apply(`200`: Content522, `422`: Content421): `200Content522` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content522`]
  }
  
  extension [Self <: `200Content522`](x: Self) {
    
    inline def set200(value: Content522): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
