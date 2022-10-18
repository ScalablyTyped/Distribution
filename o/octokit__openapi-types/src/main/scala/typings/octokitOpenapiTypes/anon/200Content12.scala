package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content12` extends StObject {
  
  /** Response */
  var `200`: Content12
}
object `200Content12` {
  
  inline def apply(`200`: Content12): `200Content12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content12`]
  }
  
  extension [Self <: `200Content12`](x: Self) {
    
    inline def set200(value: Content12): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
