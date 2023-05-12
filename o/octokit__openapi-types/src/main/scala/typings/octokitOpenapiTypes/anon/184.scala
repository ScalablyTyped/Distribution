package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `184` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: (DictkeyStringUnknownStatus & Actions) | (DictkeyStringUnknown & Actions)
}
object `184` {
  
  inline def apply(applicationSlashjson: (DictkeyStringUnknownStatus & Actions) | (DictkeyStringUnknown & Actions)): `184` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`184`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `184`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: (DictkeyStringUnknownStatus & Actions) | (DictkeyStringUnknown & Actions)): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
