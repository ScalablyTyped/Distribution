package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Clientsecret]
}
object `95` {
  
  inline def apply(applicationSlashjson: js.Array[Clientsecret]): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Clientsecret]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Clientsecret*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
