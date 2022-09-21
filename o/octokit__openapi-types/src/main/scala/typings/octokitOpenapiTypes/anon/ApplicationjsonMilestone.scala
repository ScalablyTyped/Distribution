package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMilestone extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Milestone
}
object ApplicationjsonMilestone {
  
  inline def apply(applicationSlashjson: Milestone): ApplicationjsonMilestone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMilestone]
  }
  
  extension [Self <: ApplicationjsonMilestone](x: Self) {
    
    inline def setApplicationSlashjson(value: Milestone): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
