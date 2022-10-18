package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Active]
}
object `44` {
  
  inline def apply(applicationSlashjson: js.Array[Active]): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Active]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Active*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
