package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Forkof]
}
object `26` {
  
  inline def apply(applicationSlashjson: js.Array[Forkof]): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  extension [Self <: `26`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Forkof]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Forkof*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
