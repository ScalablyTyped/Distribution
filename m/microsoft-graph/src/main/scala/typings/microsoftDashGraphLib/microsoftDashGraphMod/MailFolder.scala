package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailFolder extends Entity {
  // The number of immediate child mailFolders in the current mailFolder.
  var childFolderCount: js.UndefOr[scala.Double] = js.undefined
  // The collection of child folders in the mailFolder.
  var childFolders: js.UndefOr[js.Array[MailFolder]] = js.undefined
  // The mailFolder's display name.
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // The collection of rules that apply to the user's Inbox folder.
  var messageRules: js.UndefOr[js.Array[MessageRule]] = js.undefined
  // The collection of messages in the mailFolder.
  var messages: js.UndefOr[js.Array[Message]] = js.undefined
  // The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  // The unique identifier for the mailFolder's parent mailFolder.
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  // The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  // The number of items in the mailFolder.
  var totalItemCount: js.UndefOr[scala.Double] = js.undefined
  // The number of items in the mailFolder marked as unread.
  var unreadItemCount: js.UndefOr[scala.Double] = js.undefined
}

object MailFolder {
  @scala.inline
  def apply(
    childFolderCount: scala.Int | scala.Double = null,
    childFolders: js.Array[MailFolder] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    messageRules: js.Array[MessageRule] = null,
    messages: js.Array[Message] = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    totalItemCount: scala.Int | scala.Double = null,
    unreadItemCount: scala.Int | scala.Double = null
  ): MailFolder = {
    val __obj = js.Dynamic.literal()
    if (childFolderCount != null) __obj.updateDynamic("childFolderCount")(childFolderCount.asInstanceOf[js.Any])
    if (childFolders != null) __obj.updateDynamic("childFolders")(childFolders)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (messageRules != null) __obj.updateDynamic("messageRules")(messageRules)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    if (totalItemCount != null) __obj.updateDynamic("totalItemCount")(totalItemCount.asInstanceOf[js.Any])
    if (unreadItemCount != null) __obj.updateDynamic("unreadItemCount")(unreadItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailFolder]
  }
}

