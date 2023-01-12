package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Message
}
object ApplicationjsonMessage {
  
  inline def apply(applicationSlashjson: Message): ApplicationjsonMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Message): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
