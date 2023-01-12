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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositoryselection] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Repositoryselection): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
