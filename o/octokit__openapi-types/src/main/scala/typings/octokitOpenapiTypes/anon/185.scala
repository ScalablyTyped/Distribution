package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `185` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Days]
}
object `185` {
  
  inline def apply(applicationSlashjson: js.Array[Days]): `185` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`185`]
  }
  
  extension [Self <: `185`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Days]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Days*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
