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
  
  @scala.inline
  def apply(): HistoryLabelAdded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryLabelAdded]
  }
  
  @scala.inline
  implicit class HistoryLabelAddedMutableBuilder[Self <: HistoryLabelAdded] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    @scala.inline
    def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
