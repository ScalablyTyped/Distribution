package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Message | Errors
}
object `38` {
  
  inline def apply(applicationSlashjson: Message | Errors): `38` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setApplicationSlashjson(value: Message | Errors): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
