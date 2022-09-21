package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSchemas extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Schemas
}
object ApplicationjsonSchemas {
  
  inline def apply(applicationSlashjson: Schemas): ApplicationjsonSchemas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSchemas]
  }
  
  extension [Self <: ApplicationjsonSchemas](x: Self) {
    
    inline def setApplicationSlashjson(value: Schemas): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
