package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCodespaces extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Codespaces
}
object ApplicationjsonCodespaces {
  
  inline def apply(applicationSlashjson: Codespaces): ApplicationjsonCodespaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCodespaces]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCodespaces] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Codespaces): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
