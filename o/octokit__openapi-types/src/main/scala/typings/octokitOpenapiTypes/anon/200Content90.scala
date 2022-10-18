package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content90` extends StObject {
  
  /** Response */
  var `200`: Content90
}
object `200Content90` {
  
  inline def apply(`200`: Content90): `200Content90` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content90`]
  }
  
  extension [Self <: `200Content90`](x: Self) {
    
    inline def set200(value: Content90): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
