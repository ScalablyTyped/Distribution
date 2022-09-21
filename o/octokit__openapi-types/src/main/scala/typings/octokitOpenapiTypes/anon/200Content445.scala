package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content445` extends StObject {
  
  /** Response */
  var `200`: Content445
  
  var `401`: Content55
}
object `200Content445` {
  
  inline def apply(`200`: Content445, `401`: Content55): `200Content445` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content445`]
  }
  
  extension [Self <: `200Content445`](x: Self) {
    
    inline def set200(value: Content445): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content55): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
  }
}
