package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `608` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Onfreetrial]
}
object `608` {
  
  inline def apply(applicationSlashjson: js.Array[Onfreetrial]): `608` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`608`]
  }
  
  extension [Self <: `608`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Onfreetrial]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Onfreetrial*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
