package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enabledebuglogging | Null
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setApplicationSlashjson(value: Enabledebuglogging): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
