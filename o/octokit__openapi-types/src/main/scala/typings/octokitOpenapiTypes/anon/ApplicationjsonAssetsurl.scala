package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssetsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Assetsurl
}
object ApplicationjsonAssetsurl {
  
  inline def apply(applicationSlashjson: Assetsurl): ApplicationjsonAssetsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssetsurl]
  }
  
  extension [Self <: ApplicationjsonAssetsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Assetsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
