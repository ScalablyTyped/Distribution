package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageRuleActions extends js.Object {
  // A list of categories to be assigned to a message.
  var assignCategories: js.UndefOr[js.Array[String]] = js.undefined
  // The ID of a folder that a message is to be copied to.
  var copyToFolder: js.UndefOr[String] = js.undefined
  // Indicates whether a message should be moved to the Deleted Items folder.
  var delete: js.UndefOr[Boolean] = js.undefined
  // The email addresses of the recipients to which a message should be forwarded as an attachment.
  var forwardAsAttachmentTo: js.UndefOr[js.Array[Recipient]] = js.undefined
  // The email addresses of the recipients to which a message should be forwarded.
  var forwardTo: js.UndefOr[js.Array[Recipient]] = js.undefined
  // Indicates whether a message should be marked as read.
  var markAsRead: js.UndefOr[Boolean] = js.undefined
  // Sets the importance of the message, which can be: low, normal, high.
  var markImportance: js.UndefOr[Importance] = js.undefined
  // The ID of the folder that a message will be moved to.
  var moveToFolder: js.UndefOr[String] = js.undefined
  // Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
  var permanentDelete: js.UndefOr[Boolean] = js.undefined
  // The email addresses to which a message should be redirected.
  var redirectTo: js.UndefOr[js.Array[Recipient]] = js.undefined
  // Indicates whether subsequent rules should be evaluated.
  var stopProcessingRules: js.UndefOr[Boolean] = js.undefined
}

object MessageRuleActions {
  @scala.inline
  def apply(
    assignCategories: js.Array[String] = null,
    copyToFolder: String = null,
    delete: js.UndefOr[Boolean] = js.undefined,
    forwardAsAttachmentTo: js.Array[Recipient] = null,
    forwardTo: js.Array[Recipient] = null,
    markAsRead: js.UndefOr[Boolean] = js.undefined,
    markImportance: Importance = null,
    moveToFolder: String = null,
    permanentDelete: js.UndefOr[Boolean] = js.undefined,
    redirectTo: js.Array[Recipient] = null,
    stopProcessingRules: js.UndefOr[Boolean] = js.undefined
  ): MessageRuleActions = {
    val __obj = js.Dynamic.literal()
    if (assignCategories != null) __obj.updateDynamic("assignCategories")(assignCategories)
    if (copyToFolder != null) __obj.updateDynamic("copyToFolder")(copyToFolder)
    if (!js.isUndefined(delete)) __obj.updateDynamic("delete")(delete)
    if (forwardAsAttachmentTo != null) __obj.updateDynamic("forwardAsAttachmentTo")(forwardAsAttachmentTo)
    if (forwardTo != null) __obj.updateDynamic("forwardTo")(forwardTo)
    if (!js.isUndefined(markAsRead)) __obj.updateDynamic("markAsRead")(markAsRead)
    if (markImportance != null) __obj.updateDynamic("markImportance")(markImportance)
    if (moveToFolder != null) __obj.updateDynamic("moveToFolder")(moveToFolder)
    if (!js.isUndefined(permanentDelete)) __obj.updateDynamic("permanentDelete")(permanentDelete)
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo)
    if (!js.isUndefined(stopProcessingRules)) __obj.updateDynamic("stopProcessingRules")(stopProcessingRules)
    __obj.asInstanceOf[MessageRuleActions]
  }
}

