package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExternalurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Externalurl
}
object ApplicationjsonExternalurl {
  
  inline def apply(applicationSlashjson: Externalurl): ApplicationjsonExternalurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExternalurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonExternalurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Externalurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
