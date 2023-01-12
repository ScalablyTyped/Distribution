package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesRepositoryselection extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesRepositoryselection
}
object ApplicationjsonRepositoriesRepositoryselection {
  
  inline def apply(applicationSlashjson: RepositoriesRepositoryselection): ApplicationjsonRepositoriesRepositoryselection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesRepositoryselection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositoriesRepositoryselection] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RepositoriesRepositoryselection): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
