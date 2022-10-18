package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `189` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Pattern]
}
object `189` {
  
  inline def apply(applicationSlashjson: js.Array[Pattern]): `189` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`189`]
  }
  
  extension [Self <: `189`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Pattern]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Pattern*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
