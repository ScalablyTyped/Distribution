package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `657` extends StObject {
  
  /** Response */
  var `200`: Content299Headers
}
object `657` {
  
  inline def apply(`200`: Content299Headers): `657` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`657`]
  }
  
  extension [Self <: `657`](x: Self) {
    
    inline def set200(value: Content299Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
