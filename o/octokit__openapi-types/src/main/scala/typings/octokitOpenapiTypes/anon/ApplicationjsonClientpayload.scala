package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonClientpayload extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Clientpayload
}
object ApplicationjsonClientpayload {
  
  inline def apply(applicationSlashjson: Clientpayload): ApplicationjsonClientpayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonClientpayload]
  }
  
  extension [Self <: ApplicationjsonClientpayload](x: Self) {
    
    inline def setApplicationSlashjson(value: Clientpayload): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
