package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `152` | Null
}
object `153` {
  
  inline def apply(): `153` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`153`]
  }
  
  extension [Self <: `153`](x: Self) {
    
    inline def setApplicationSlashjson(value: `152`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
