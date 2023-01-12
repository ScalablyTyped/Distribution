package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExpiryLimit extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ExpiryLimit
}
object ApplicationjsonExpiryLimit {
  
  inline def apply(applicationSlashjson: ExpiryLimit): ApplicationjsonExpiryLimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExpiryLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonExpiryLimit] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ExpiryLimit): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
