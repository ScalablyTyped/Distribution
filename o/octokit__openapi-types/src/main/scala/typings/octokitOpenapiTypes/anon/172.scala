package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `172` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: (Conclusion & Actions) | (DictkeyStatus & Actions)
}
object `172` {
  
  inline def apply(applicationSlashjson: (Conclusion & Actions) | (DictkeyStatus & Actions)): `172` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`172`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `172`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: (Conclusion & Actions) | (DictkeyStatus & Actions)): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
