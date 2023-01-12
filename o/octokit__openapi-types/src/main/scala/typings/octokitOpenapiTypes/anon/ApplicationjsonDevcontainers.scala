package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDevcontainers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Devcontainers
}
object ApplicationjsonDevcontainers {
  
  inline def apply(applicationSlashjson: Devcontainers): ApplicationjsonDevcontainers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDevcontainers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDevcontainers] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Devcontainers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
