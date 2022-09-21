package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOperations extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Operations
}
object ApplicationjsonOperations {
  
  inline def apply(applicationSlashjson: Operations): ApplicationjsonOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOperations]
  }
  
  extension [Self <: ApplicationjsonOperations](x: Self) {
    
    inline def setApplicationSlashjson(value: Operations): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
