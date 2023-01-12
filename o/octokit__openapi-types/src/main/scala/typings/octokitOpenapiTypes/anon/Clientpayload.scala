package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clientpayload extends StObject {
  
  /** @description JSON payload with extra information about the webhook event that your action or workflow may use. */
  var client_payload: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /** @description A custom webhook event name. Must be 100 characters or fewer. */
  var event_type: String
}
object Clientpayload {
  
  inline def apply(event_type: String): Clientpayload = {
    val __obj = js.Dynamic.literal(event_type = event_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientpayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clientpayload] (val x: Self) extends AnyVal {
    
    inline def setClient_payload(value: StringDictionary[Any]): Self = StObject.set(x, "client_payload", value.asInstanceOf[js.Any])
    
    inline def setClient_payloadUndefined: Self = StObject.set(x, "client_payload", js.undefined)
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
  }
}
