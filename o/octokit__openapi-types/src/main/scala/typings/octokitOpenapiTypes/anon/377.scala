package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `377` extends StObject {
  
  /** Response */
  var `200`: Content330
}
object `377` {
  
  inline def apply(`200`: Content330): `377` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`377`]
  }
  
  extension [Self <: `377`](x: Self) {
    
    inline def set200(value: Content330): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
