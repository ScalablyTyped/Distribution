package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Dismissedreason]
}
object `15` {
  
  inline def apply(applicationSlashjson: js.Array[Dismissedreason]): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Dismissedreason]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Dismissedreason*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
