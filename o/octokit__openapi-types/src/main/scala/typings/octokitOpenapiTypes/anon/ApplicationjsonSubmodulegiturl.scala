package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSubmodulegiturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Submodulegiturl
}
object ApplicationjsonSubmodulegiturl {
  
  inline def apply(applicationSlashjson: Submodulegiturl): ApplicationjsonSubmodulegiturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSubmodulegiturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSubmodulegiturl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Submodulegiturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
