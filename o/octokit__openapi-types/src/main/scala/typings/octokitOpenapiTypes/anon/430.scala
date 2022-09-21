package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `430` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Architecture]
}
object `430` {
  
  inline def apply(applicationSlashjson: js.Array[Architecture]): `430` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`430`]
  }
  
  extension [Self <: `430`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Architecture]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Architecture*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
