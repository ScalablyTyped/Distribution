package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContributorsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Contributorsurl
}
object ApplicationjsonContributorsurl {
  
  inline def apply(applicationSlashjson: Contributorsurl): ApplicationjsonContributorsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContributorsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonContributorsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Contributorsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
