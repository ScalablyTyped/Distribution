package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `481` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Waittimer]
}
object `481` {
  
  inline def apply(applicationSlashjson: js.Array[Waittimer]): `481` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`481`]
  }
  
  extension [Self <: `481`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Waittimer]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Waittimer*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
