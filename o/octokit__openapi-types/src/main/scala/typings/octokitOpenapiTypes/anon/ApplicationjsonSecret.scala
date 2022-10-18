package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSecret extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Secret
}
object ApplicationjsonSecret {
  
  inline def apply(applicationSlashjson: Secret): ApplicationjsonSecret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSecret]
  }
  
  extension [Self <: ApplicationjsonSecret](x: Self) {
    
    inline def setApplicationSlashjson(value: Secret): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
