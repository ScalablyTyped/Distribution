package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryMessageDeleted extends StObject {
  
  var message: js.UndefOr[Message] = js.undefined
}
object HistoryMessageDeleted {
  
  @scala.inline
  def apply(): HistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryMessageDeleted]
  }
  
  @scala.inline
  implicit class HistoryMessageDeletedMutableBuilder[Self <: HistoryMessageDeleted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
