package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `618` extends StObject {
  
  /** Response */
  var `200`: Content604
}
object `618` {
  
  inline def apply(`200`: Content604): `618` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`618`]
  }
  
  extension [Self <: `618`](x: Self) {
    
    inline def set200(value: Content604): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
