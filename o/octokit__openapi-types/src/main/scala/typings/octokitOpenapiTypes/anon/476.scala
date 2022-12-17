package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `476` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[EnvironmentsState]
}
object `476` {
  
  inline def apply(applicationSlashjson: js.Array[EnvironmentsState]): `476` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`476`]
  }
  
  extension [Self <: `476`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[EnvironmentsState]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: EnvironmentsState*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
