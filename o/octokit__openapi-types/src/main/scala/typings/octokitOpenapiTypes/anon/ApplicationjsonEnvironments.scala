package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnvironments extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Environments
}
object ApplicationjsonEnvironments {
  
  inline def apply(applicationSlashjson: Environments): ApplicationjsonEnvironments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEnvironments] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Environments): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
