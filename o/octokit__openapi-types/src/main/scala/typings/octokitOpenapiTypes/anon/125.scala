package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Defaultbranchonly | Null
}
object `125` {
  
  inline def apply(): `125` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setApplicationSlashjson(value: Defaultbranchonly): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
