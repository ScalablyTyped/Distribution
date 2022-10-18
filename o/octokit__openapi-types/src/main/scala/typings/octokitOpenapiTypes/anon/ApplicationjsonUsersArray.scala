package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUsersArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: UsersArray
}
object ApplicationjsonUsersArray {
  
  inline def apply(applicationSlashjson: UsersArray): ApplicationjsonUsersArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUsersArray]
  }
  
  extension [Self <: ApplicationjsonUsersArray](x: Self) {
    
    inline def setApplicationSlashjson(value: UsersArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
