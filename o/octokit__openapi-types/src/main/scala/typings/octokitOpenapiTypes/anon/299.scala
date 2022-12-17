package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `299` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Displayname | Null
}
object `299` {
  
  inline def apply(): `299` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`299`]
  }
  
  extension [Self <: `299`](x: Self) {
    
    inline def setApplicationSlashjson(value: Displayname): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
