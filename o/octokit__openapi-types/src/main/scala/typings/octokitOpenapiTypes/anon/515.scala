package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `515` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ActiveConfigEventsName | Null
}
object `515` {
  
  inline def apply(): `515` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`515`]
  }
  
  extension [Self <: `515`](x: Self) {
    
    inline def setApplicationSlashjson(value: ActiveConfigEventsName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
