package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Forks]
}
object `19` {
  
  inline def apply(applicationSlashjson: js.Array[Forks]): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Forks]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Forks*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
