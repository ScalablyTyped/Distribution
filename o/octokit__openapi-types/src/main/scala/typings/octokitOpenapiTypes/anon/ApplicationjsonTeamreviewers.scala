package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTeamreviewers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Teamreviewers
}
object ApplicationjsonTeamreviewers {
  
  inline def apply(applicationSlashjson: Teamreviewers): ApplicationjsonTeamreviewers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTeamreviewers]
  }
  
  extension [Self <: ApplicationjsonTeamreviewers](x: Self) {
    
    inline def setApplicationSlashjson(value: Teamreviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
