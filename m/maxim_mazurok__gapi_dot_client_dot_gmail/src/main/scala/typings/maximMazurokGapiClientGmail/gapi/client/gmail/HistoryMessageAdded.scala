package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryMessageAdded extends StObject {
  
  var message: js.UndefOr[Message] = js.undefined
}
object HistoryMessageAdded {
  
  @scala.inline
  def apply(): HistoryMessageAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryMessageAdded]
  }
  
  @scala.inline
  implicit class HistoryMessageAddedMutableBuilder[Self <: HistoryMessageAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
