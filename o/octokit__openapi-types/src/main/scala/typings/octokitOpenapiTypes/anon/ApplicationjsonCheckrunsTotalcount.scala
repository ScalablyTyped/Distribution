package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCheckrunsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CheckrunsTotalcount
}
object ApplicationjsonCheckrunsTotalcount {
  
  inline def apply(applicationSlashjson: CheckrunsTotalcount): ApplicationjsonCheckrunsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCheckrunsTotalcount]
  }
  
  extension [Self <: ApplicationjsonCheckrunsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: CheckrunsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
