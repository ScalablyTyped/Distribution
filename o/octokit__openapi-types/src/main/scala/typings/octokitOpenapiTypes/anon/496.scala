package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `496` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[EnvironmentsState]
}
object `496` {
  
  inline def apply(applicationSlashjson: js.Array[EnvironmentsState]): `496` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`496`]
  }
  
  extension [Self <: `496`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[EnvironmentsState]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: EnvironmentsState*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
