package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `528` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Changetype]
}
object `528` {
  
  inline def apply(applicationSlashjson: js.Array[Changetype]): `528` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`528`]
  }
  
  extension [Self <: `528`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Changetype]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Changetype*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
