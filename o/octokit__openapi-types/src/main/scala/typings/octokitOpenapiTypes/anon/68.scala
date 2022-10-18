package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `67` | Null
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setApplicationSlashjson(value: `67`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
