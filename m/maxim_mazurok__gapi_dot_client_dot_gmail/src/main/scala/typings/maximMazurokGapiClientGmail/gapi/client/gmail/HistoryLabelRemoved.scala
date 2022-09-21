package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryLabelRemoved extends StObject {
  
  /** Label IDs removed from the message. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[Message] = js.undefined
}
object HistoryLabelRemoved {
  
  inline def apply(): HistoryLabelRemoved = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLabelRemoved]
  }
  
  extension [Self <: HistoryLabelRemoved](x: Self) {
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value*))
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
