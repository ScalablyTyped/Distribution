package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enabledebuglogging | Null
}
object `174` {
  
  inline def apply(): `174` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`174`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `174`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Enabledebuglogging): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
