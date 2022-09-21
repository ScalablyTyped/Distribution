package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `554` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Addedby]
}
object `554` {
  
  inline def apply(applicationSlashjson: js.Array[Addedby]): `554` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`554`]
  }
  
  extension [Self <: `554`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Addedby]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Addedby*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
