package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Permission | Null
}
object `121` {
  
  inline def apply(): `121` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`121`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Permission): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
