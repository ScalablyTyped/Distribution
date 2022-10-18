package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `160` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Creator]
}
object `160` {
  
  inline def apply(applicationSlashjson: js.Array[Creator]): `160` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`160`]
  }
  
  extension [Self <: `160`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Creator]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Creator*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
