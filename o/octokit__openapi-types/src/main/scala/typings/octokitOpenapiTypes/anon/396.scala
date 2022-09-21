package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `396` extends StObject {
  
  /** Response */
  var `200`: Content63Headers
}
object `396` {
  
  inline def apply(`200`: Content63Headers): `396` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`396`]
  }
  
  extension [Self <: `396`](x: Self) {
    
    inline def set200(value: Content63Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
