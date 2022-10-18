package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content255` extends StObject {
  
  /** Response */
  var `200`: Content255
}
object `200Content255` {
  
  inline def apply(`200`: Content255): `200Content255` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content255`]
  }
  
  extension [Self <: `200Content255`](x: Self) {
    
    inline def set200(value: Content255): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
