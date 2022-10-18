package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Body]
}
object `10` {
  
  inline def apply(applicationSlashjson: js.Array[Body]): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Body]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Body*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
