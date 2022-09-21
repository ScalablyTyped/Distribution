package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMarketplacepurchase extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Marketplacepurchase
}
object ApplicationjsonMarketplacepurchase {
  
  inline def apply(applicationSlashjson: Marketplacepurchase): ApplicationjsonMarketplacepurchase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMarketplacepurchase]
  }
  
  extension [Self <: ApplicationjsonMarketplacepurchase](x: Self) {
    
    inline def setApplicationSlashjson(value: Marketplacepurchase): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
