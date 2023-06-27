package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `300` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Events | Null
}
object `300` {
  
  inline def apply(): `300` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`300`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `300`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Events): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
