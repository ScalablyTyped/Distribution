package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `442` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Bodyhtml]
}
object `442` {
  
  inline def apply(applicationSlashjson: js.Array[Bodyhtml]): `442` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`442`]
  }
  
  extension [Self <: `442`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Bodyhtml]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Bodyhtml*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
