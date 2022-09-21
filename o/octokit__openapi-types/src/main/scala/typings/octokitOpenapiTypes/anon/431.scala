package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `431` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Activewas]
}
object `431` {
  
  inline def apply(applicationSlashjson: js.Array[Activewas]): `431` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`431`]
  }
  
  extension [Self <: `431`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Activewas]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Activewas*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
