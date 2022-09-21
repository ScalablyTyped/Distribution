package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOwnerurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Ownerurl
}
object ApplicationjsonOwnerurl {
  
  inline def apply(applicationSlashjson: Ownerurl): ApplicationjsonOwnerurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOwnerurl]
  }
  
  extension [Self <: ApplicationjsonOwnerurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Ownerurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
