package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationThread
  extends StObject
     with Entity {
  
  // The Cc: recipients for the thread.
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  
  // Indicates whether any of the posts within this thread has at least one attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.undefined
  
  // Indicates if the thread is locked.
  var isLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.undefined
  
  // Read-only. Nullable.
  var posts: js.UndefOr[NullableOption[js.Array[Post]]] = js.undefined
  
  // A short summary from the body of the latest post in this conversation.
  var preview: js.UndefOr[String] = js.undefined
  
  // The To: recipients for the thread.
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.undefined
  
  // All the users that sent a message to this thread.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.undefined
}
object ConversationThread {
  
  inline def apply(): ConversationThread = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationThread]
  }
  
  extension [Self <: ConversationThread](x: Self) {
    
    inline def setCcRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
    
    inline def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
    
    inline def setCcRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "ccRecipients", js.Array(value :_*))
    
    inline def setHasAttachments(value: Boolean): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    inline def setLastDeliveredDateTime(value: String): Self = StObject.set(x, "lastDeliveredDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastDeliveredDateTimeUndefined: Self = StObject.set(x, "lastDeliveredDateTime", js.undefined)
    
    inline def setPosts(value: NullableOption[js.Array[Post]]): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    
    inline def setPostsNull: Self = StObject.set(x, "posts", null)
    
    inline def setPostsUndefined: Self = StObject.set(x, "posts", js.undefined)
    
    inline def setPostsVarargs(value: Post*): Self = StObject.set(x, "posts", js.Array(value :_*))
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setToRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "toRecipients", value.asInstanceOf[js.Any])
    
    inline def setToRecipientsUndefined: Self = StObject.set(x, "toRecipients", js.undefined)
    
    inline def setToRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "toRecipients", js.Array(value :_*))
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setUniqueSenders(value: js.Array[String]): Self = StObject.set(x, "uniqueSenders", value.asInstanceOf[js.Any])
    
    inline def setUniqueSendersUndefined: Self = StObject.set(x, "uniqueSenders", js.undefined)
    
    inline def setUniqueSendersVarargs(value: String*): Self = StObject.set(x, "uniqueSenders", js.Array(value :_*))
  }
}
