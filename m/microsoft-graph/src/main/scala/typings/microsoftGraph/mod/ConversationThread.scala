package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversationThread extends Entity {
  
  // The Cc: recipients for the thread.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  
  // Indicates whether any of the posts within this thread has at least one attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  
  // Indicates if the thread is locked.
  var isLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.native
  
  // Read-only. Nullable.
  var posts: js.UndefOr[NullableOption[js.Array[Post]]] = js.native
  
  // A short summary from the body of the latest post in this conversation.
  var preview: js.UndefOr[String] = js.native
  
  // The To: recipients for the thread.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.native
  
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.native
  
  // All the users that sent a message to this thread.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.native
}
object ConversationThread {
  
  @scala.inline
  def apply(): ConversationThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationThread]
  }
  
  @scala.inline
  implicit class ConversationThreadOps[Self <: ConversationThread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCcRecipientsVarargs(value: Recipient*): Self = this.set("ccRecipients", js.Array(value :_*))
    
    @scala.inline
    def setCcRecipients(value: js.Array[Recipient]): Self = this.set("ccRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcRecipients: Self = this.set("ccRecipients", js.undefined)
    
    @scala.inline
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLocked: Self = this.set("isLocked", js.undefined)
    
    @scala.inline
    def setLastDeliveredDateTime(value: String): Self = this.set("lastDeliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeliveredDateTime: Self = this.set("lastDeliveredDateTime", js.undefined)
    
    @scala.inline
    def setPostsVarargs(value: Post*): Self = this.set("posts", js.Array(value :_*))
    
    @scala.inline
    def setPosts(value: NullableOption[js.Array[Post]]): Self = this.set("posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosts: Self = this.set("posts", js.undefined)
    
    @scala.inline
    def setPostsNull: Self = this.set("posts", null)
    
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setToRecipientsVarargs(value: Recipient*): Self = this.set("toRecipients", js.Array(value :_*))
    
    @scala.inline
    def setToRecipients(value: js.Array[Recipient]): Self = this.set("toRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToRecipients: Self = this.set("toRecipients", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setUniqueSendersVarargs(value: String*): Self = this.set("uniqueSenders", js.Array(value :_*))
    
    @scala.inline
    def setUniqueSenders(value: js.Array[String]): Self = this.set("uniqueSenders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueSenders: Self = this.set("uniqueSenders", js.undefined)
  }
}
