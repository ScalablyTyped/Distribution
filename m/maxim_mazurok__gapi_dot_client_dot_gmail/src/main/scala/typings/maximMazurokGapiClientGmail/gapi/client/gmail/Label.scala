package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  /** The color to assign to the label. Color is only available for labels that have their `type` set to `user`. */
  var color: js.UndefOr[LabelColor] = js.native
  
  /** The immutable ID of the label. */
  var id: js.UndefOr[String] = js.native
  
  /** The visibility of the label in the label list in the Gmail web interface. */
  var labelListVisibility: js.UndefOr[String] = js.native
  
  /** The visibility of messages with this label in the message list in the Gmail web interface. */
  var messageListVisibility: js.UndefOr[String] = js.native
  
  /** The total number of messages with the label. */
  var messagesTotal: js.UndefOr[Double] = js.native
  
  /** The number of unread messages with the label. */
  var messagesUnread: js.UndefOr[Double] = js.native
  
  /** The display name of the label. */
  var name: js.UndefOr[String] = js.native
  
  /** The total number of threads with the label. */
  var threadsTotal: js.UndefOr[Double] = js.native
  
  /** The number of unread threads with the label. */
  var threadsUnread: js.UndefOr[Double] = js.native
  
  /**
    * The owner type for the label. User labels are created by the user and can be modified and deleted by the user and can be applied to any message or thread. System labels are
    * internally created and cannot be added, modified, or deleted. System labels may be able to be applied to or removed from messages and threads under some circumstances but this is
    * not guaranteed. For example, users can apply and remove the `INBOX` and `UNREAD` labels from messages and threads, but cannot apply or remove the `DRAFTS` or `SENT` labels from
    * messages or threads.
    */
  var `type`: js.UndefOr[String] = js.native
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: LabelColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelListVisibility(value: String): Self = StObject.set(x, "labelListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelListVisibilityUndefined: Self = StObject.set(x, "labelListVisibility", js.undefined)
    
    @scala.inline
    def setMessageListVisibility(value: String): Self = StObject.set(x, "messageListVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageListVisibilityUndefined: Self = StObject.set(x, "messageListVisibility", js.undefined)
    
    @scala.inline
    def setMessagesTotal(value: Double): Self = StObject.set(x, "messagesTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesTotalUndefined: Self = StObject.set(x, "messagesTotal", js.undefined)
    
    @scala.inline
    def setMessagesUnread(value: Double): Self = StObject.set(x, "messagesUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUnreadUndefined: Self = StObject.set(x, "messagesUnread", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setThreadsTotal(value: Double): Self = StObject.set(x, "threadsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsTotalUndefined: Self = StObject.set(x, "threadsTotal", js.undefined)
    
    @scala.inline
    def setThreadsUnread(value: Double): Self = StObject.set(x, "threadsUnread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUnreadUndefined: Self = StObject.set(x, "threadsUnread", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
