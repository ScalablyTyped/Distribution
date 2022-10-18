package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Object]
}
object `128` {
  
  inline def apply(applicationSlashjson: js.Array[Object]): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Object]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Object*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
