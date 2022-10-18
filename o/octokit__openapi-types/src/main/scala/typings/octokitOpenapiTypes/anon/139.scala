package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Oid]
}
object `139` {
  
  inline def apply(applicationSlashjson: js.Array[Oid]): `139` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`139`]
  }
  
  extension [Self <: `139`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Oid]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Oid*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
