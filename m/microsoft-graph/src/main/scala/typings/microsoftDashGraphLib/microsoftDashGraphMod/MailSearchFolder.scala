package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailSearchFolder extends MailFolder {
  // The OData query to filter the messages.
  var filterQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be
    * done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a
    * shallow search of only each of the folders explicitly specified in sourceFolderIds.
    */
  var includeNestedFolders: js.UndefOr[scala.Boolean] = js.undefined
  // Indicates whether a search folder is editable using REST APIs.
  var isSupported: js.UndefOr[scala.Boolean] = js.undefined
  // The mailbox folders that should be mined.
  var sourceFolderIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object MailSearchFolder {
  @scala.inline
  def apply(
    childFolderCount: scala.Int | scala.Double = null,
    childFolders: js.Array[MailFolder] = null,
    displayName: java.lang.String = null,
    filterQuery: java.lang.String = null,
    id: java.lang.String = null,
    includeNestedFolders: js.UndefOr[scala.Boolean] = js.undefined,
    isSupported: js.UndefOr[scala.Boolean] = js.undefined,
    messageRules: js.Array[MessageRule] = null,
    messages: js.Array[Message] = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    sourceFolderIds: js.Array[java.lang.String] = null,
    totalItemCount: scala.Int | scala.Double = null,
    unreadItemCount: scala.Int | scala.Double = null
  ): MailSearchFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolderCount != null) __obj.updateDynamic("childFolderCount")(childFolderCount.asInstanceOf[js.Any])
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (filterQuery != null) __obj.updateDynamic("filterQuery")(filterQuery)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(includeNestedFolders)) __obj.updateDynamic("includeNestedFolders")(includeNestedFolders)
    if (!js.isUndefined(isSupported)) __obj.updateDynamic("isSupported")(isSupported)
    if (messageRules != null) __obj.updateDynamic("messageRules")(messageRules)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    if (sourceFolderIds != null) __obj.updateDynamic("sourceFolderIds")(sourceFolderIds)
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    if (unreadItemCount != null) __obj.updateDynamic("unreadItemCount")(unreadItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailSearchFolder]
  }
}

