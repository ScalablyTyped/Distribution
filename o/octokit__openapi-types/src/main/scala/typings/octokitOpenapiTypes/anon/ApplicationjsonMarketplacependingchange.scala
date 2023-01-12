package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMarketplacependingchange extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Marketplacependingchange
}
object ApplicationjsonMarketplacependingchange {
  
  inline def apply(applicationSlashjson: Marketplacependingchange): ApplicationjsonMarketplacependingchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMarketplacependingchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMarketplacependingchange] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Marketplacependingchange): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
