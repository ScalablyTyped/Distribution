package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `470` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Columnurl]
}
object `470` {
  
  inline def apply(applicationSlashjson: js.Array[Columnurl]): `470` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`470`]
  }
  
  extension [Self <: `470`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Columnurl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Columnurl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
