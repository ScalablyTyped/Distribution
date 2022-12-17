package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `243` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Events | Null
}
object `243` {
  
  inline def apply(): `243` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`243`]
  }
  
  extension [Self <: `243`](x: Self) {
    
    inline def setApplicationSlashjson(value: Events): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
