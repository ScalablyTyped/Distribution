package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEnabledrepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Enabledrepositories
}
object ApplicationjsonEnabledrepositories {
  
  inline def apply(applicationSlashjson: Enabledrepositories): ApplicationjsonEnabledrepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEnabledrepositories]
  }
  
  extension [Self <: ApplicationjsonEnabledrepositories](x: Self) {
    
    inline def setApplicationSlashjson(value: Enabledrepositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
