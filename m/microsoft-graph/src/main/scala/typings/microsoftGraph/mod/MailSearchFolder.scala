package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailSearchFolder extends MailFolder {
  // The OData query to filter the messages.
  var filterQuery: js.UndefOr[String] = js.undefined
  /**
    * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be
    * done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a
    * shallow search of only each of the folders explicitly specified in sourceFolderIds.
    */
  var includeNestedFolders: js.UndefOr[Boolean] = js.undefined
  // Indicates whether a search folder is editable using REST APIs.
  var isSupported: js.UndefOr[Boolean] = js.undefined
  // The mailbox folders that should be mined.
  var sourceFolderIds: js.UndefOr[js.Array[String]] = js.undefined
}

object MailSearchFolder {
  @scala.inline
  def apply(
    childFolderCount: Int | Double = null,
    childFolders: js.Array[MailFolder] = null,
    displayName: String = null,
    filterQuery: String = null,
    id: String = null,
    includeNestedFolders: js.UndefOr[Boolean] = js.undefined,
    isSupported: js.UndefOr[Boolean] = js.undefined,
    messageRules: js.Array[MessageRule] = null,
    messages: js.Array[Message] = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    sourceFolderIds: js.Array[String] = null,
    totalItemCount: Int | Double = null,
    unreadItemCount: Int | Double = null
  ): MailSearchFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolderCount != null) __obj.updateDynamic("childFolderCount")(childFolderCount.asInstanceOf[js.Any])
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (filterQuery != null) __obj.updateDynamic("filterQuery")(filterQuery.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNestedFolders)) __obj.updateDynamic("includeNestedFolders")(includeNestedFolders.asInstanceOf[js.Any])
    if (!js.isUndefined(isSupported)) __obj.updateDynamic("isSupported")(isSupported.asInstanceOf[js.Any])
    if (messageRules != null) __obj.updateDynamic("messageRules")(messageRules.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties.asInstanceOf[js.Any])
    if (sourceFolderIds != null) __obj.updateDynamic("sourceFolderIds")(sourceFolderIds.asInstanceOf[js.Any])
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    if (unreadItemCount != null) __obj.updateDynamic("unreadItemCount")(unreadItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailSearchFolder]
  }
}

