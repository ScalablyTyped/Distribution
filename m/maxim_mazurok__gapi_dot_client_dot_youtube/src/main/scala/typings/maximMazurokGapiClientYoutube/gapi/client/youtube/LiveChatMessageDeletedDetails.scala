package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageDeletedDetails extends StObject {
  
  var deletedMessageId: js.UndefOr[String] = js.undefined
}
object LiveChatMessageDeletedDetails {
  
  @scala.inline
  def apply(): LiveChatMessageDeletedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageDeletedDetails]
  }
  
  @scala.inline
  implicit class LiveChatMessageDeletedDetailsMutableBuilder[Self <: LiveChatMessageDeletedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedMessageId(value: String): Self = StObject.set(x, "deletedMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedMessageIdUndefined: Self = StObject.set(x, "deletedMessageId", js.undefined)
  }
}
