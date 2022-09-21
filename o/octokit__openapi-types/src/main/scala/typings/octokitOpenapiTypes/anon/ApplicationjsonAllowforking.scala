package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowforking extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowforking
}
object ApplicationjsonAllowforking {
  
  inline def apply(applicationSlashjson: Allowforking): ApplicationjsonAllowforking = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowforking]
  }
  
  extension [Self <: ApplicationjsonAllowforking](x: Self) {
    
    inline def setApplicationSlashjson(value: Allowforking): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
