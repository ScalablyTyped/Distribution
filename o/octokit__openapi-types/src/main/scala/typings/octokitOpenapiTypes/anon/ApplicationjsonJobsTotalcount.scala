package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonJobsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: JobsTotalcount
}
object ApplicationjsonJobsTotalcount {
  
  inline def apply(applicationSlashjson: JobsTotalcount): ApplicationjsonJobsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonJobsTotalcount]
  }
  
  extension [Self <: ApplicationjsonJobsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: JobsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
