package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content19` extends StObject {
  
  /** Response */
  var `200`: Content19
  
  var `422`: Content8
}
object `200Content19` {
  
  inline def apply(`200`: Content19, `422`: Content8): `200Content19` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content19`]
  }
  
  extension [Self <: `200Content19`](x: Self) {
    
    inline def set200(value: Content19): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
