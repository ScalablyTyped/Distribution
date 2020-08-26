package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatMessageMention extends js.Object {
  /**
    * Index of an entity being mentioned in the specified chatMessage. Matches the {index} value in the corresponding
    * &amp;lt;at id='{index}'&amp;gt; tag in the message body.
    */
  var id: js.UndefOr[Double] = js.native
  // String used to represent the mention. For example, a user's display name, a team name.
  var mentionText: js.UndefOr[String] = js.native
  /**
    * The entity (user, application, team, or channel) that was mentioned. If it was a channel or team that was @mentioned,
    * the identitySet contains a conversation property giving the ID of the team/channel, and a conversationIdentityType
    * property that represents either the team or channel.
    */
  var mentioned: js.UndefOr[IdentitySet] = js.native
}

object ChatMessageMention {
  @scala.inline
  def apply(): ChatMessageMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatMessageMention]
  }
  @scala.inline
  implicit class ChatMessageMentionOps[Self <: ChatMessageMention] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMentionText(value: String): Self = this.set("mentionText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentionText: Self = this.set("mentionText", js.undefined)
    @scala.inline
    def setMentioned(value: IdentitySet): Self = this.set("mentioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentioned: Self = this.set("mentioned", js.undefined)
  }
  
}

