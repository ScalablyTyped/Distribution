package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `617` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Reposcount]
}
object `617` {
  
  inline def apply(applicationSlashjson: js.Array[Reposcount]): `617` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`617`]
  }
  
  extension [Self <: `617`](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Reposcount]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Reposcount*): Self = StObject.set(x, "application/json", js.Array(value*))
  }
}
