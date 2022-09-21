package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContexts extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Contexts
}
object ApplicationjsonContexts {
  
  inline def apply(applicationSlashjson: Contexts): ApplicationjsonContexts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContexts]
  }
  
  extension [Self <: ApplicationjsonContexts](x: Self) {
    
    inline def setApplicationSlashjson(value: Contexts): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
