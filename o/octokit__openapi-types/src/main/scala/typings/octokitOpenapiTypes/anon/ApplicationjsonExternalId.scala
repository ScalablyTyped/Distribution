package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonExternalId extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ExternalId
}
object ApplicationjsonExternalId {
  
  inline def apply(applicationSlashjson: ExternalId): ApplicationjsonExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonExternalId]
  }
  
  extension [Self <: ApplicationjsonExternalId](x: Self) {
    
    inline def setApplicationSlashjson(value: ExternalId): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
