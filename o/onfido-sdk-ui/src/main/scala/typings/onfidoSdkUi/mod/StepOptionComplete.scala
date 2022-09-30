package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionComplete extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var submessage: js.UndefOr[String] = js.undefined
}
object StepOptionComplete {
  
  inline def apply(): StepOptionComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionComplete]
  }
  
  extension [Self <: StepOptionComplete](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSubmessage(value: String): Self = StObject.set(x, "submessage", value.asInstanceOf[js.Any])
    
    inline def setSubmessageUndefined: Self = StObject.set(x, "submessage", js.undefined)
  }
}
