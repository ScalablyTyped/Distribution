package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAsync extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Async
}
object ApplicationjsonAsync {
  
  inline def apply(applicationSlashjson: Async): ApplicationjsonAsync = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAsync]
  }
  
  extension [Self <: ApplicationjsonAsync](x: Self) {
    
    inline def setApplicationSlashjson(value: Async): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
