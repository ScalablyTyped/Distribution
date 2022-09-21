package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorBranch extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AuthorBranch
}
object ApplicationjsonAuthorBranch {
  
  inline def apply(applicationSlashjson: AuthorBranch): ApplicationjsonAuthorBranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorBranch]
  }
  
  extension [Self <: ApplicationjsonAuthorBranch](x: Self) {
    
    inline def setApplicationSlashjson(value: AuthorBranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
