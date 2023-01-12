package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoryselectionTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoryselectionTotalcount
}
object ApplicationjsonRepositoryselectionTotalcount {
  
  inline def apply(applicationSlashjson: RepositoryselectionTotalcount): ApplicationjsonRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoryselectionTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositoryselectionTotalcount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: RepositoryselectionTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
