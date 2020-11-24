package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailFolder extends Entity {
  
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[NullableOption[js.Array[MailFolder]]] = js.native
  
  // The mailFolder's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[NullableOption[js.Array[MessageRule]]] = js.native
  
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[NullableOption[js.Array[Message]]] = js.native
  
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.native
  
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.native
  
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[NullableOption[Double]] = js.native
  
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[NullableOption[Double]] = js.native
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
    def setChildFolderCount(value: NullableOption[Double]): Self = this.set("childFolderCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildFolderCount: Self = this.set("childFolderCount", js.undefined)
    
    @scala.inline
    def setChildFolderCountNull: Self = this.set("childFolderCount", null)
    
    @scala.inline
    def setChildFoldersVarargs(value: MailFolder*): Self = this.set("childFolders", js.Array(value :_*))
    
    @scala.inline
    def setChildFolders(value: NullableOption[js.Array[MailFolder]]): Self = this.set("childFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildFolders: Self = this.set("childFolders", js.undefined)
    
    @scala.inline
    def setChildFoldersNull: Self = this.set("childFolders", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setMessageRulesVarargs(value: MessageRule*): Self = this.set("messageRules", js.Array(value :_*))
    
    @scala.inline
    def setMessageRules(value: NullableOption[js.Array[MessageRule]]): Self = this.set("messageRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageRules: Self = this.set("messageRules", js.undefined)
    
    @scala.inline
    def setMessageRulesNull: Self = this.set("messageRules", null)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[Message]]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = this.set("multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = this.set("multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiValueExtendedProperties: Self = this.set("multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = this.set("multiValueExtendedProperties", null)
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setParentFolderIdNull: Self = this.set("parentFolderId", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = this.set("singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = this.set("singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleValueExtendedProperties: Self = this.set("singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = this.set("singleValueExtendedProperties", null)
    
    @scala.inline
    def setTotalItemCount(value: NullableOption[Double]): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItemCount: Self = this.set("totalItemCount", js.undefined)
    
    @scala.inline
    def setTotalItemCountNull: Self = this.set("totalItemCount", null)
    
    @scala.inline
    def setUnreadItemCount(value: NullableOption[Double]): Self = this.set("unreadItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreadItemCount: Self = this.set("unreadItemCount", js.undefined)
    
    @scala.inline
    def setUnreadItemCountNull: Self = this.set("unreadItemCount", null)
  }
}
