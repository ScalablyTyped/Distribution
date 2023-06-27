package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `287` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Defaultbranchonly | Null
}
object `287` {
  
  inline def apply(): `287` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`287`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `287`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Defaultbranchonly): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
