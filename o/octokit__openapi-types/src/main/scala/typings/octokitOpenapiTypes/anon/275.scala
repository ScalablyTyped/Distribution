package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `275` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Lockreason | Null
}
object `275` {
  
  inline def apply(): `275` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`275`]
  }
  
  extension [Self <: `275`](x: Self) {
    
    inline def setApplicationSlashjson(value: Lockreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
