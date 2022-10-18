package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content173` extends StObject {
  
  /** The list of reviews returns in chronological order. */
  var `200`: Content173
}
object `200Content173` {
  
  inline def apply(`200`: Content173): `200Content173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content173`]
  }
  
  extension [Self <: `200Content173`](x: Self) {
    
    inline def set200(value: Content173): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
