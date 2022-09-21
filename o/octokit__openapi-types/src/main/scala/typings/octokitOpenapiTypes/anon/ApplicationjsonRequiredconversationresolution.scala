package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRequiredconversationresolution extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Requiredconversationresolution
}
object ApplicationjsonRequiredconversationresolution {
  
  inline def apply(applicationSlashjson: Requiredconversationresolution): ApplicationjsonRequiredconversationresolution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRequiredconversationresolution]
  }
  
  extension [Self <: ApplicationjsonRequiredconversationresolution](x: Self) {
    
    inline def setApplicationSlashjson(value: Requiredconversationresolution): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
