package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `246` extends StObject {
  
  /** Response */
  var `200`: Content245
}
object `246` {
  
  inline def apply(`200`: Content245): `246` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`246`]
  }
  
  extension [Self <: `246`](x: Self) {
    
    inline def set200(value: Content245): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
