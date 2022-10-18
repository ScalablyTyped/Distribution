package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHttpsenforced extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Httpsenforced
}
object ApplicationjsonHttpsenforced {
  
  inline def apply(applicationSlashjson: Httpsenforced): ApplicationjsonHttpsenforced = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHttpsenforced]
  }
  
  extension [Self <: ApplicationjsonHttpsenforced](x: Self) {
    
    inline def setApplicationSlashjson(value: Httpsenforced): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
