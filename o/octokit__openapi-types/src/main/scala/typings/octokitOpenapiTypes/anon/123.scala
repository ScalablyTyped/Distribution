package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Waittimer | Null
}
object `123` {
  
  inline def apply(): `123` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`123`]
  }
  
  extension [Self <: `123`](x: Self) {
    
    inline def setApplicationSlashjson(value: Waittimer): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
