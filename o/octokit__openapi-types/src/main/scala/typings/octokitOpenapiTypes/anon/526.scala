package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `526` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Contributions]
}
object `526` {
  
  inline def apply(applicationSlashjson: js.Array[Contributions]): `526` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`526`]
  }
  
  extension [Self <: `526`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Contributions]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Contributions*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
