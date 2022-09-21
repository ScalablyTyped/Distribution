package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatIgnored extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatIgnored
}
object ApplicationjsonCreatedatIgnored {
  
  inline def apply(applicationSlashjson: CreatedatIgnored): ApplicationjsonCreatedatIgnored = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatIgnored]
  }
  
  extension [Self <: ApplicationjsonCreatedatIgnored](x: Self) {
    
    inline def setApplicationSlashjson(value: CreatedatIgnored): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
