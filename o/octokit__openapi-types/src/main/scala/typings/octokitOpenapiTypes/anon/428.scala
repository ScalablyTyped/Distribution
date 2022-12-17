package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `428` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Marketplacependingchange]
}
object `428` {
  
  inline def apply(applicationSlashjson: js.Array[Marketplacependingchange]): `428` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`428`]
  }
  
  extension [Self <: `428`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Marketplacependingchange]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Marketplacependingchange*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
