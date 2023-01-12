package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUsers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Users
}
object ApplicationjsonUsers {
  
  inline def apply(applicationSlashjson: Users): ApplicationjsonUsers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonUsers] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Users): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
