package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailFolder
  extends StObject
     with Entity {
  
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[NullableOption[js.Array[MailFolder]]] = js.undefined
  
  // The mailFolder's display name.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[NullableOption[js.Array[MessageRule]]] = js.undefined
  
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[NullableOption[js.Array[Message]]] = js.undefined
  
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[NullableOption[js.Array[MultiValueLegacyExtendedProperty]]] = js.undefined
  
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[NullableOption[js.Array[SingleValueLegacyExtendedProperty]]] = js.undefined
  
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object MailFolder {
  
  @scala.inline
  def apply(): MailFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailFolder]
  }
  
  @scala.inline
  implicit class MailFolderMutableBuilder[Self <: MailFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildFolderCount(value: NullableOption[Double]): Self = StObject.set(x, "childFolderCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFolderCountNull: Self = StObject.set(x, "childFolderCount", null)
    
    @scala.inline
    def setChildFolderCountUndefined: Self = StObject.set(x, "childFolderCount", js.undefined)
    
    @scala.inline
    def setChildFolders(value: NullableOption[js.Array[MailFolder]]): Self = StObject.set(x, "childFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildFoldersNull: Self = StObject.set(x, "childFolders", null)
    
    @scala.inline
    def setChildFoldersUndefined: Self = StObject.set(x, "childFolders", js.undefined)
    
    @scala.inline
    def setChildFoldersVarargs(value: MailFolder*): Self = StObject.set(x, "childFolders", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMessageRules(value: NullableOption[js.Array[MessageRule]]): Self = StObject.set(x, "messageRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRulesNull: Self = StObject.set(x, "messageRules", null)
    
    @scala.inline
    def setMessageRulesUndefined: Self = StObject.set(x, "messageRules", js.undefined)
    
    @scala.inline
    def setMessageRulesVarargs(value: MessageRule*): Self = StObject.set(x, "messageRules", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: NullableOption[js.Array[Message]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesNull: Self = StObject.set(x, "messages", null)
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setMultiValueExtendedProperties(value: NullableOption[js.Array[MultiValueLegacyExtendedProperty]]): Self = StObject.set(x, "multiValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValueExtendedPropertiesNull: Self = StObject.set(x, "multiValueExtendedProperties", null)
    
    @scala.inline
    def setMultiValueExtendedPropertiesUndefined: Self = StObject.set(x, "multiValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setMultiValueExtendedPropertiesVarargs(value: MultiValueLegacyExtendedProperty*): Self = StObject.set(x, "multiValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setParentFolderId(value: NullableOption[String]): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedProperties(value: NullableOption[js.Array[SingleValueLegacyExtendedProperty]]): Self = StObject.set(x, "singleValueExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValueExtendedPropertiesNull: Self = StObject.set(x, "singleValueExtendedProperties", null)
    
    @scala.inline
    def setSingleValueExtendedPropertiesUndefined: Self = StObject.set(x, "singleValueExtendedProperties", js.undefined)
    
    @scala.inline
    def setSingleValueExtendedPropertiesVarargs(value: SingleValueLegacyExtendedProperty*): Self = StObject.set(x, "singleValueExtendedProperties", js.Array(value :_*))
    
    @scala.inline
    def setTotalItemCount(value: NullableOption[Double]): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCountNull: Self = StObject.set(x, "totalItemCount", null)
    
    @scala.inline
    def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
    
    @scala.inline
    def setUnreadItemCount(value: NullableOption[Double]): Self = StObject.set(x, "unreadItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreadItemCountNull: Self = StObject.set(x, "unreadItemCount", null)
    
    @scala.inline
    def setUnreadItemCountUndefined: Self = StObject.set(x, "unreadItemCount", js.undefined)
  }
}
