package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Targeturl]
}
object `114` {
  
  inline def apply(applicationSlashjson: js.Array[Targeturl]): `114` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  
  extension [Self <: `114`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Targeturl]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Targeturl*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
