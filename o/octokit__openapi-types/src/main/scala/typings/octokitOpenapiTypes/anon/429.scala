package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `429` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Subject]
}
object `429` {
  
  inline def apply(applicationSlashjson: js.Array[Subject]): `429` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`429`]
  }
  
  extension [Self <: `429`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Subject]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Subject*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
