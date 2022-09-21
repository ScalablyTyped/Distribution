package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content204` extends StObject {
  
  /** Response */
  var `200`: Content204
}
object `200Content204` {
  
  inline def apply(`200`: Content204): `200Content204` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content204`]
  }
  
  extension [Self <: `200Content204`](x: Self) {
    
    inline def set200(value: Content204): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
