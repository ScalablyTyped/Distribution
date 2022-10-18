package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `165` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BuildtypeSource | Null
}
object `165` {
  
  inline def apply(): `165` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`165`]
  }
  
  extension [Self <: `165`](x: Self) {
    
    inline def setApplicationSlashjson(value: BuildtypeSource): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
