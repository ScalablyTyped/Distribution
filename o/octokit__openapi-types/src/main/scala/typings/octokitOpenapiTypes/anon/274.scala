package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `274` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `272` | `273`
}
object `274` {
  
  inline def apply(applicationSlashjson: `272` | `273`): `274` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`274`]
  }
  
  extension [Self <: `274`](x: Self) {
    
    inline def setApplicationSlashjson(value: `272` | `273`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
