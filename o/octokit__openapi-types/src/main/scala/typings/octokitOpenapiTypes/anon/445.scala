package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `445` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Marketplacepurchase]
}
object `445` {
  
  inline def apply(applicationSlashjson: js.Array[Marketplacepurchase]): `445` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`445`]
  }
  
  extension [Self <: `445`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Marketplacepurchase]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Marketplacepurchase*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
