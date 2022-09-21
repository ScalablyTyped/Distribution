package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyHtmlurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyHtmlurl
}
object ApplicationjsonBodyHtmlurl {
  
  inline def apply(applicationSlashjson: BodyHtmlurl): ApplicationjsonBodyHtmlurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyHtmlurl]
  }
  
  extension [Self <: ApplicationjsonBodyHtmlurl](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyHtmlurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
