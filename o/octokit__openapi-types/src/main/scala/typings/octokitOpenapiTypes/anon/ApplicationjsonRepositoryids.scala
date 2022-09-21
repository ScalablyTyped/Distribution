package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoryids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Repositoryids
}
object ApplicationjsonRepositoryids {
  
  inline def apply(applicationSlashjson: Repositoryids): ApplicationjsonRepositoryids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoryids]
  }
  
  extension [Self <: ApplicationjsonRepositoryids](x: Self) {
    
    inline def setApplicationSlashjson(value: Repositoryids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
