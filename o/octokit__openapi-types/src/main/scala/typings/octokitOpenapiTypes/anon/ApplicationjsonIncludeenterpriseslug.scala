package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludeenterpriseslug extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Includeenterpriseslug
}
object ApplicationjsonIncludeenterpriseslug {
  
  inline def apply(applicationSlashjson: Includeenterpriseslug): ApplicationjsonIncludeenterpriseslug = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludeenterpriseslug]
  }
  
  extension [Self <: ApplicationjsonIncludeenterpriseslug](x: Self) {
    
    inline def setApplicationSlashjson(value: Includeenterpriseslug): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
