package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Contributions]
}
object `117` {
  
  inline def apply(applicationSlashjson: js.Array[Contributions]): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Contributions]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Contributions*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
