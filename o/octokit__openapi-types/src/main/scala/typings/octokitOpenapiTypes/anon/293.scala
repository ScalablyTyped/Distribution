package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `293` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Source | Null
}
object `293` {
  
  inline def apply(): `293` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`293`]
  }
  
  extension [Self <: `293`](x: Self) {
    
    inline def setApplicationSlashjson(value: Source): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
