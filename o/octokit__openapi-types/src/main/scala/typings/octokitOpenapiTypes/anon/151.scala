package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `149` | `150`
}
object `151` {
  
  inline def apply(applicationSlashjson: `149` | `150`): `151` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`151`]
  }
  
  extension [Self <: `151`](x: Self) {
    
    inline def setApplicationSlashjson(value: `149` | `150`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
