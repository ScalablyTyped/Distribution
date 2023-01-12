package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `305` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Commitmessage | Null
}
object `305` {
  
  inline def apply(): `305` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(null)
    __obj.asInstanceOf[`305`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `305`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Commitmessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonNull: Self = StObject.set(x, "application/json", null)
  }
}
