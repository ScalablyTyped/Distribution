package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonServerinstances extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Serverinstances
}
object ApplicationjsonServerinstances {
  
  inline def apply(applicationSlashjson: Serverinstances): ApplicationjsonServerinstances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonServerinstances]
  }
  
  extension [Self <: ApplicationjsonServerinstances](x: Self) {
    
    inline def setApplicationSlashjson(value: Serverinstances): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
