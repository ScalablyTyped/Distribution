package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesArrayRepositoryselection extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesArrayRepositoryselection
}
object ApplicationjsonRepositoriesArrayRepositoryselection {
  
  inline def apply(applicationSlashjson: RepositoriesArrayRepositoryselection): ApplicationjsonRepositoriesArrayRepositoryselection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesArrayRepositoryselection]
  }
  
  extension [Self <: ApplicationjsonRepositoriesArrayRepositoryselection](x: Self) {
    
    inline def setApplicationSlashjson(value: RepositoriesArrayRepositoryselection): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
