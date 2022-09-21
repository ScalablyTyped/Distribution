package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEmailsExternalId extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EmailsExternalId
}
object ApplicationjsonEmailsExternalId {
  
  inline def apply(applicationSlashjson: EmailsExternalId): ApplicationjsonEmailsExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEmailsExternalId]
  }
  
  extension [Self <: ApplicationjsonEmailsExternalId](x: Self) {
    
    inline def setApplicationSlashjson(value: EmailsExternalId): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
