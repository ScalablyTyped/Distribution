package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `311` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Commitmessage | Null
}
object `311` {
  
  inline def apply(): `311` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`311`]
  }
  
  extension [Self <: `311`](x: Self) {
    
    inline def setApplicationSlashjson(value: Commitmessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
