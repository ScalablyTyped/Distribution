package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `173` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[BodyBodyhtml]
}
object `173` {
  
  inline def apply(applicationSlashjson: js.Array[BodyBodyhtml]): `173` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`173`]
  }
  
  extension [Self <: `173`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[BodyBodyhtml]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: BodyBodyhtml*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
