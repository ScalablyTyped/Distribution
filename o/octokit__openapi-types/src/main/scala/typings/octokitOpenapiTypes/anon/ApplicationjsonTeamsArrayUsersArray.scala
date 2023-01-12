package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTeamsArrayUsersArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TeamsArrayUsersArray
}
object ApplicationjsonTeamsArrayUsersArray {
  
  inline def apply(applicationSlashjson: TeamsArrayUsersArray): ApplicationjsonTeamsArrayUsersArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTeamsArrayUsersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTeamsArrayUsersArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: TeamsArrayUsersArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
