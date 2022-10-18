package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content31` extends StObject {
  
  /** Response */
  var `200`: Content31
  
  var `401`: Content6
}
object `200Content31` {
  
  inline def apply(`200`: Content31, `401`: Content6): `200Content31` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content31`]
  }
  
  extension [Self <: `200Content31`](x: Self) {
    
    inline def set200(value: Content31): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
