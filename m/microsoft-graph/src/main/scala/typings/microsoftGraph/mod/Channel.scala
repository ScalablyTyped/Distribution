package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends Entity {
  // Optional textual description for the channel.
  var description: js.UndefOr[String] = js.native
  // Channel name as it will appear to the user in Microsoft Teams.
  var displayName: js.UndefOr[String] = js.native
  // The email address for sending messages to the channel. Read-only.
  var email: js.UndefOr[String] = js.native
  // Metadata for the location where the channel's files are stored.
  var filesFolder: js.UndefOr[DriveItem] = js.native
  // A collection of all the messages in the channel. A navigation property. Nullable.
  var messages: js.UndefOr[js.Array[ChatMessage]] = js.native
  // A collection of all the tabs in the channel. A navigation property.
  var tabs: js.UndefOr[js.Array[TeamsTab]] = js.native
  /**
    * A hyperlink that will navigate to the channel in Microsoft Teams. This is the URL that you get when you right-click a
    * channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not
    * parsed. Read-only.
    */
  var webUrl: js.UndefOr[String] = js.native
}

object Channel {
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFilesFolder(value: DriveItem): Self = this.set("filesFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilesFolder: Self = this.set("filesFolder", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: ChatMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[ChatMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setTabsVarargs(value: TeamsTab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[TeamsTab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

