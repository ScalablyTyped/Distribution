package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowautomerge extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowautomerge
}
object ApplicationjsonAllowautomerge {
  
  inline def apply(applicationSlashjson: Allowautomerge): ApplicationjsonAllowautomerge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowautomerge]
  }
  
  extension [Self <: ApplicationjsonAllowautomerge](x: Self) {
    
    inline def setApplicationSlashjson(value: Allowautomerge): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
