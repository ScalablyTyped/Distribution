package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonError extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Error
}
object ApplicationjsonError {
  
  inline def apply(applicationSlashjson: Error): ApplicationjsonError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonError]
  }
  
  extension [Self <: ApplicationjsonError](x: Self) {
    
    inline def setApplicationSlashjson(value: Error): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
