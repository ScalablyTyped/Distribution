package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailFolder extends Entity {
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[Double] = js.native
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[js.Array[MailFolder]] = js.native
  // The mailFolder's display name.
  var displayName: js.UndefOr[String] = js.native
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[js.Array[MessageRule]] = js.native
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[js.Array[Message]] = js.native
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[String] = js.native
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[Double] = js.native
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[Double] = js.native
}

object MailFolder {
  @scala.inline
  def apply(): MailFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailFolder]
  }
  @scala.inline
  implicit class MailFolderOps[Self <: MailFolder] (val x: Self) extends AnyVal {
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
    def setChildFolderCount(value: Double): Self = this.set("childFolderCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildFolderCount: Self = this.set("childFolderCount", js.undefined)
    @scala.inline
    def setChildFoldersVarargs(value: MailFolder*): Self = this.set("childFolders", js.Array(value :_*))
    @scala.inline
    def setChildFolders(value: js.Array[MailFolder]): Self = this.set("childFolders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildFolders: Self = this.set("childFolders", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setMessageRulesVarargs(value: MessageRule*): Self = this.set("messageRules", js.Array(value :_*))
    @scala.inline
    def setMessageRules(value: js.Array[MessageRule]): Self = this.set("messageRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageRules: Self = this.set("messageRules", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    @scala.inline
    def setSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItemCount: Self = this.set("totalItemCount", js.undefined)
    @scala.inline
    def setUnreadItemCount(value: Double): Self = this.set("unreadItemCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreadItemCount: Self = this.set("unreadItemCount", js.undefined)
  }
  
}

