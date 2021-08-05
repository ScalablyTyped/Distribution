package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryMessageAdded extends StObject {
  
  var message: js.UndefOr[Message] = js.undefined
}
object HistoryMessageAdded {
  
  inline def apply(): HistoryMessageAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryMessageAdded]
  }
  
  extension [Self <: HistoryMessageAdded](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
