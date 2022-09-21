package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `607` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[IdKey]
}
object `607` {
  
  inline def apply(applicationSlashjson: js.Array[IdKey]): `607` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`607`]
  }
  
  extension [Self <: `607`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[IdKey]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: IdKey*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
