package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `254` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Vcs | Null
}
object `254` {
  
  inline def apply(): `254` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`254`]
  }
  
  extension [Self <: `254`](x: Self) {
    
    inline def setApplicationSlashjson(value: Vcs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
