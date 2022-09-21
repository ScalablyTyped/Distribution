package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesArray
}
object ApplicationjsonRepositoriesArray {
  
  inline def apply(applicationSlashjson: RepositoriesArray): ApplicationjsonRepositoriesArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesArray]
  }
  
  extension [Self <: ApplicationjsonRepositoriesArray](x: Self) {
    
    inline def setApplicationSlashjson(value: RepositoriesArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
