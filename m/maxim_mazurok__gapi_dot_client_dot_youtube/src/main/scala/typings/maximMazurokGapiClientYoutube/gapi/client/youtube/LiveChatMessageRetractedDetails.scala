package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageRetractedDetails extends StObject {
  
  var retractedMessageId: js.UndefOr[String] = js.undefined
}
object LiveChatMessageRetractedDetails {
  
  inline def apply(): LiveChatMessageRetractedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageRetractedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveChatMessageRetractedDetails] (val x: Self) extends AnyVal {
    
    inline def setRetractedMessageId(value: String): Self = StObject.set(x, "retractedMessageId", value.asInstanceOf[js.Any])
    
    inline def setRetractedMessageIdUndefined: Self = StObject.set(x, "retractedMessageId", js.undefined)
  }
}
