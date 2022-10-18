package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Deliveriesurl]
}
object `131` {
  
  inline def apply(applicationSlashjson: js.Array[Deliveriesurl]): `131` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Deliveriesurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Deliveriesurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
