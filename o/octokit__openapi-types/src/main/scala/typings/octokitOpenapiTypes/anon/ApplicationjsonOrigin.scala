package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOrigin extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Origin
}
object ApplicationjsonOrigin {
  
  inline def apply(applicationSlashjson: Origin): ApplicationjsonOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOrigin]
  }
  
  extension [Self <: ApplicationjsonOrigin](x: Self) {
    
    inline def setApplicationSlashjson(value: Origin): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
