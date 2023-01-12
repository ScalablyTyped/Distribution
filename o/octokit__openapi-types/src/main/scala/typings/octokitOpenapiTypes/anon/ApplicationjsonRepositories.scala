package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Repositories
}
object ApplicationjsonRepositories {
  
  inline def apply(applicationSlashjson: Repositories): ApplicationjsonRepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositories] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Repositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
