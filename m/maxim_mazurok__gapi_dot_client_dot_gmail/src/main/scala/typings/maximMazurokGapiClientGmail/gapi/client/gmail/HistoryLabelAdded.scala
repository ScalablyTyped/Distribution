package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryLabelAdded extends StObject {
  
  /** Label IDs added to the message. */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[Message] = js.undefined
}
object HistoryLabelAdded {
  
  inline def apply(): HistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLabelAdded]
  }
  
  extension [Self <: HistoryLabelAdded](x: Self) {
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
