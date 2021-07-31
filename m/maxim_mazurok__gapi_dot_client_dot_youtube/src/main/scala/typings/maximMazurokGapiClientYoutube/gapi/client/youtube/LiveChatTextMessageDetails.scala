package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatTextMessageDetails extends StObject {
  
  /** The user's message. */
  var messageText: js.UndefOr[String] = js.undefined
}
object LiveChatTextMessageDetails {
  
  @scala.inline
  def apply(): LiveChatTextMessageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatTextMessageDetails]
  }
  
  @scala.inline
  implicit class LiveChatTextMessageDetailsMutableBuilder[Self <: LiveChatTextMessageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
  }
}
