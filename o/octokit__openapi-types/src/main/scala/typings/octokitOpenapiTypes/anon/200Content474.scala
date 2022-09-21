package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content474` extends StObject {
  
  /** Response */
  var `200`: Content474
  
  var `422`: Content418
}
object `200Content474` {
  
  inline def apply(`200`: Content474, `422`: Content418): `200Content474` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content474`]
  }
  
  extension [Self <: `200Content474`](x: Self) {
    
    inline def set200(value: Content474): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content418): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
