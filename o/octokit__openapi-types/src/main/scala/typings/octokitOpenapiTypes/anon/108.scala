package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Clientip | Null
}
object `108` {
  
  inline def apply(): `108` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setApplicationSlashjson(value: Clientip): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
