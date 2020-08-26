package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversation extends Entity {
  // Indicates whether any of the posts within this Conversation has at least one attachment.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastDeliveredDateTime: js.UndefOr[String] = js.native
  // A short summary from the body of the latest post in this converstaion.
  var preview: js.UndefOr[String] = js.native
  // A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.native
  // The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
  var topic: js.UndefOr[String] = js.native
  // All the users that sent a message to this Conversation.
  var uniqueSenders: js.UndefOr[js.Array[String]] = js.native
}

object Conversation {
  @scala.inline
  def apply(): Conversation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Conversation]
  }
  @scala.inline
  implicit class ConversationOps[Self <: Conversation] (val x: Self) extends AnyVal {
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
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    @scala.inline
    def setLastDeliveredDateTime(value: String): Self = this.set("lastDeliveredDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeliveredDateTime: Self = this.set("lastDeliveredDateTime", js.undefined)
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setThreadsVarargs(value: ConversationThread*): Self = this.set("threads", js.Array(value :_*))
    @scala.inline
    def setThreads(value: js.Array[ConversationThread]): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
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

