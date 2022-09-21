package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305` extends StObject {
  
  /** Response */
  var `200`: Content303
}
object `305` {
  
  inline def apply(`200`: Content303): `305` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`305`]
  }
  
  extension [Self <: `305`](x: Self) {
    
    inline def set200(value: Content303): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
