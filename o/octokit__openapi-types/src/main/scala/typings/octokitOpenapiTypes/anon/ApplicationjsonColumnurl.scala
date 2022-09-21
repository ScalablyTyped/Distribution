package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonColumnurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Columnurl
}
object ApplicationjsonColumnurl {
  
  inline def apply(applicationSlashjson: Columnurl): ApplicationjsonColumnurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonColumnurl]
  }
  
  extension [Self <: ApplicationjsonColumnurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Columnurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
