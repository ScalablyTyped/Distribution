package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: (Conclusion & Actions) | (DictkeyStatus & Actions)
}
object `182` {
  
  inline def apply(applicationSlashjson: (Conclusion & Actions) | (DictkeyStatus & Actions)): `182` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  extension [Self <: `182`](x: Self) {
    
    inline def setApplicationSlashjson(value: (Conclusion & Actions) | (DictkeyStatus & Actions)): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
