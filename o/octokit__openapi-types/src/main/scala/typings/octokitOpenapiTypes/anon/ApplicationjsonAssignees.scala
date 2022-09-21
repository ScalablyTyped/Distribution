package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssignees extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Assignees
}
object ApplicationjsonAssignees {
  
  inline def apply(applicationSlashjson: Assignees): ApplicationjsonAssignees = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssignees]
  }
  
  extension [Self <: ApplicationjsonAssignees](x: Self) {
    
    inline def setApplicationSlashjson(value: Assignees): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
