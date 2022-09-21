package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `250` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Events | Null
}
object `250` {
  
  inline def apply(): `250` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`250`]
  }
  
  extension [Self <: `250`](x: Self) {
    
    inline def setApplicationSlashjson(value: Events): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
