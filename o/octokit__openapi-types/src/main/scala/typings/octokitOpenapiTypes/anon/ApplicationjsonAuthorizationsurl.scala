package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorizationsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Authorizationsurl
}
object ApplicationjsonAuthorizationsurl {
  
  inline def apply(applicationSlashjson: Authorizationsurl): ApplicationjsonAuthorizationsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorizationsurl]
  }
  
  extension [Self <: ApplicationjsonAuthorizationsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Authorizationsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
