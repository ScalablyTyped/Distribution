package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `209` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Readonly]
}
object `209` {
  
  inline def apply(applicationSlashjson: js.Array[Readonly]): `209` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`209`]
  }
  
  extension [Self <: `209`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Readonly]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Readonly*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
