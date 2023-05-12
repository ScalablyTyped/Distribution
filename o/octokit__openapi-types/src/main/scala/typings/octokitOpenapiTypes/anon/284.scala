package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `284` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Lockreason | Null
}
object `284` {
  
  inline def apply(): `284` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`284`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `284`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Lockreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
