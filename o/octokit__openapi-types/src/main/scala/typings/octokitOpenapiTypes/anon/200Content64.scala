package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content64` extends StObject {
  
  /** Response */
  var `200`: Content64
}
object `200Content64` {
  
  inline def apply(`200`: Content64): `200Content64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content64`]
  }
  
  extension [Self <: `200Content64`](x: Self) {
    
    inline def set200(value: Content64): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
