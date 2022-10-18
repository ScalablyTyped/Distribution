package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Mergemethod | Null
}
object `172` {
  
  inline def apply(): `172` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`172`]
  }
  
  extension [Self <: `172`](x: Self) {
    
    inline def setApplicationSlashjson(value: Mergemethod): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
