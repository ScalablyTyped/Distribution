package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Line]
}
object `110` {
  
  inline def apply(applicationSlashjson: js.Array[Line]): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Line]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Line*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
