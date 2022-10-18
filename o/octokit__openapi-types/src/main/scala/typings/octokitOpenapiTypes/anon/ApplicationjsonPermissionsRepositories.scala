package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPermissionsRepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: PermissionsRepositories
}
object ApplicationjsonPermissionsRepositories {
  
  inline def apply(applicationSlashjson: PermissionsRepositories): ApplicationjsonPermissionsRepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPermissionsRepositories]
  }
  
  extension [Self <: ApplicationjsonPermissionsRepositories](x: Self) {
    
    inline def setApplicationSlashjson(value: PermissionsRepositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
