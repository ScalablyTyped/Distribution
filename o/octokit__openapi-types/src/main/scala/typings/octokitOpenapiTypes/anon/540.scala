package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `540` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EventsName | Null
}
object `540` {
  
  inline def apply(): `540` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`540`]
  }
  
  extension [Self <: `540`](x: Self) {
    
    inline def setApplicationSlashjson(value: EventsName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
