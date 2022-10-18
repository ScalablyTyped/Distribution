package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEventMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EventMessage
}
object ApplicationjsonEventMessage {
  
  inline def apply(applicationSlashjson: EventMessage): ApplicationjsonEventMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEventMessage]
  }
  
  extension [Self <: ApplicationjsonEventMessage](x: Self) {
    
    inline def setApplicationSlashjson(value: EventMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
