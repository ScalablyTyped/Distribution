package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCheckrunsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Checkrunsurl
}
object ApplicationjsonCheckrunsurl {
  
  inline def apply(applicationSlashjson: Checkrunsurl): ApplicationjsonCheckrunsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCheckrunsurl]
  }
  
  extension [Self <: ApplicationjsonCheckrunsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Checkrunsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
