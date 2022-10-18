package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssignee extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Assignee
}
object ApplicationjsonAssignee {
  
  inline def apply(applicationSlashjson: Assignee): ApplicationjsonAssignee = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssignee]
  }
  
  extension [Self <: ApplicationjsonAssignee](x: Self) {
    
    inline def setApplicationSlashjson(value: Assignee): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
