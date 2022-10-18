package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `654` extends StObject {
  
  /** Response */
  var `200`: Content625
}
object `654` {
  
  inline def apply(`200`: Content625): `654` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`654`]
  }
  
  extension [Self <: `654`](x: Self) {
    
    inline def set200(value: Content625): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
