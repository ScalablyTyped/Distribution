package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content551` extends StObject {
  
  /** Response */
  var `200`: Content551
  
  var `410`: Content55
}
object `200Content551` {
  
  inline def apply(`200`: Content551, `410`: Content55): `200Content551` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content551`]
  }
  
  extension [Self <: `200Content551`](x: Self) {
    
    inline def set200(value: Content551): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content55): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
