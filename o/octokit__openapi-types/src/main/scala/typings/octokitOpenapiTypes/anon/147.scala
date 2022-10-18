package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `147` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[DefaultDescription]
}
object `147` {
  
  inline def apply(applicationSlashjson: js.Array[DefaultDescription]): `147` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`147`]
  }
  
  extension [Self <: `147`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[DefaultDescription]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: DefaultDescription*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
