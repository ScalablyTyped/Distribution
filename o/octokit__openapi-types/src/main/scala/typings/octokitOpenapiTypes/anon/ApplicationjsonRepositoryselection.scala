package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoryselection extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Repositoryselection
}
object ApplicationjsonRepositoryselection {
  
  inline def apply(applicationSlashjson: Repositoryselection): ApplicationjsonRepositoryselection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoryselection]
  }
  
  extension [Self <: ApplicationjsonRepositoryselection](x: Self) {
    
    inline def setApplicationSlashjson(value: Repositoryselection): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
