package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Downloadcount]
}
object `178` {
  
  inline def apply(applicationSlashjson: js.Array[Downloadcount]): `178` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`178`]
  }
  
  extension [Self <: `178`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Downloadcount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Downloadcount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
