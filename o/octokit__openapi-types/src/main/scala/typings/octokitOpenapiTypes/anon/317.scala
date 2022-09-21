package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `317` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Expectedheadsha | Null
}
object `317` {
  
  inline def apply(): `317` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`317`]
  }
  
  extension [Self <: `317`](x: Self) {
    
    inline def setApplicationSlashjson(value: Expectedheadsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
