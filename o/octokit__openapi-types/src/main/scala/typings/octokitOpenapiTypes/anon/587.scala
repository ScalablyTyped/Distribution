package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `587` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ActiveConfigEvents | Null
}
object `587` {
  
  inline def apply(): `587` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`587`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `587`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ActiveConfigEvents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
