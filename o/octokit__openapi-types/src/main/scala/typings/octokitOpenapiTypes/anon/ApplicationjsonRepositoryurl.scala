package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoryurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Repositoryurl
}
object ApplicationjsonRepositoryurl {
  
  inline def apply(applicationSlashjson: Repositoryurl): ApplicationjsonRepositoryurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoryurl]
  }
  
  extension [Self <: ApplicationjsonRepositoryurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Repositoryurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
