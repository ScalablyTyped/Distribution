package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Clientsecret & Pem
}
object `5` {
  
  inline def apply(applicationSlashjson: Clientsecret & Pem): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setApplicationSlashjson(value: Clientsecret & Pem): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
