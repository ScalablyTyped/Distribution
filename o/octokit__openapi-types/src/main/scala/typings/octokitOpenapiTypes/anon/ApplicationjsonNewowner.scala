package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNewowner extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Newowner
}
object ApplicationjsonNewowner {
  
  inline def apply(applicationSlashjson: Newowner): ApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNewowner]
  }
  
  extension [Self <: ApplicationjsonNewowner](x: Self) {
    
    inline def setApplicationSlashjson(value: Newowner): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
