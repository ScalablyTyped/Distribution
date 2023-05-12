package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePinnedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Date and time when the event occurred.
  var eventDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
}
object MessagePinnedEventMessageDetail {
  
  inline def apply(): MessagePinnedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePinnedEventMessageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessagePinnedEventMessageDetail] (val x: Self) extends AnyVal {
    
    inline def setEventDateTime(value: NullableOption[String]): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeNull: Self = StObject.set(x, "eventDateTime", null)
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
  }
}
