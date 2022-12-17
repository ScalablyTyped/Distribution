package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `545` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Pusher]
}
object `545` {
  
  inline def apply(applicationSlashjson: js.Array[Pusher]): `545` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`545`]
  }
  
  extension [Self <: `545`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Pusher]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Pusher*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
