package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `585` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Onfreetrial]
}
object `585` {
  
  inline def apply(applicationSlashjson: js.Array[Onfreetrial]): `585` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`585`]
  }
  
  extension [Self <: `585`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Onfreetrial]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Onfreetrial*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
