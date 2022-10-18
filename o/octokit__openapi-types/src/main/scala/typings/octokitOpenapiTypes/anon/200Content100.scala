package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content100` extends StObject {
  
  /** Response */
  var `200`: Content100
}
object `200Content100` {
  
  inline def apply(`200`: Content100): `200Content100` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content100`]
  }
  
  extension [Self <: `200Content100`](x: Self) {
    
    inline def set200(value: Content100): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
