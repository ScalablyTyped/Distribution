package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `535` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Addedby]
}
object `535` {
  
  inline def apply(applicationSlashjson: js.Array[Addedby]): `535` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`535`]
  }
  
  extension [Self <: `535`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Addedby]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Addedby*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
