package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  /** Response */
  var `200`: Content41Headers
}
object `53` {
  
  inline def apply(`200`: Content41Headers): `53` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def set200(value: Content41Headers): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
