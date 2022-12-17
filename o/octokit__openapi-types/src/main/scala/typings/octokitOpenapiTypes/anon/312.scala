package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `312` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Expectedheadsha | Null
}
object `312` {
  
  inline def apply(): `312` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`312`]
  }
  
  extension [Self <: `312`](x: Self) {
    
    inline def setApplicationSlashjson(value: Expectedheadsha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
