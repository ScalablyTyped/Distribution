package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `222` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdKey]
}
object `222` {
  
  inline def apply(applicationSlashjson: js.Array[IdKey]): `222` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`222`]
  }
  
  extension [Self <: `222`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[IdKey]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdKey*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
