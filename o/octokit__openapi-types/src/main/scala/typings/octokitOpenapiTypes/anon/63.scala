package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  /** Response */
  var `200`: Content42
}
object `63` {
  
  inline def apply(`200`: Content42): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def set200(value: Content42): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
