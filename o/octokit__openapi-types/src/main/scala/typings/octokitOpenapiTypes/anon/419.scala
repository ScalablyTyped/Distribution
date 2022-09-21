package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `419` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Action]
}
object `419` {
  
  inline def apply(applicationSlashjson: js.Array[Action]): `419` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`419`]
  }
  
  extension [Self <: `419`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Action]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Action*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
