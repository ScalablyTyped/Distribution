package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `396` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Action]
}
object `396` {
  
  inline def apply(applicationSlashjson: js.Array[Action]): `396` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`396`]
  }
  
  extension [Self <: `396`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Action]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Action*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
