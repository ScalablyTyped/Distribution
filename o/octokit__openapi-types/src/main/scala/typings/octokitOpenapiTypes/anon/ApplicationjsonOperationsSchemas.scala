package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOperationsSchemas extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OperationsSchemas
}
object ApplicationjsonOperationsSchemas {
  
  inline def apply(applicationSlashjson: OperationsSchemas): ApplicationjsonOperationsSchemas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOperationsSchemas]
  }
  
  extension [Self <: ApplicationjsonOperationsSchemas](x: Self) {
    
    inline def setApplicationSlashjson(value: OperationsSchemas): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
