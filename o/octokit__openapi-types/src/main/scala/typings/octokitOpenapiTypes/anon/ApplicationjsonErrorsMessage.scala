package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonErrorsMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ErrorsMessage
}
object ApplicationjsonErrorsMessage {
  
  inline def apply(applicationSlashjson: ErrorsMessage): ApplicationjsonErrorsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonErrorsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonErrorsMessage] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ErrorsMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
