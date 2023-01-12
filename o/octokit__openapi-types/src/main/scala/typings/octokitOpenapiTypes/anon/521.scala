package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `521` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EventsName | Null
}
object `521` {
  
  inline def apply(): `521` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`521`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `521`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: EventsName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
