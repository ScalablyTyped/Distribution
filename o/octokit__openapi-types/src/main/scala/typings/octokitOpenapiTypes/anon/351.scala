package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `351` extends StObject {
  
  /** Response */
  var `200`: Content324Headers
}
object `351` {
  
  inline def apply(`200`: Content324Headers): `351` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`351`]
  }
  
  extension [Self <: `351`](x: Self) {
    
    inline def set200(value: Content324Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
