package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRuleActions extends js.Object {
  // A list of categories to be assigned to a message.
  var assignCategories: js.UndefOr[js.Array[String]] = js.native
  // The ID of a folder that a message is to be copied to.
  var copyToFolder: js.UndefOr[String] = js.native
  // Indicates whether a message should be moved to the Deleted Items folder.
  var delete: js.UndefOr[Boolean] = js.native
  // The email addresses of the recipients to which a message should be forwarded as an attachment.
  var forwardAsAttachmentTo: js.UndefOr[js.Array[Recipient]] = js.native
  // The email addresses of the recipients to which a message should be forwarded.
  var forwardTo: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether a message should be marked as read.
  var markAsRead: js.UndefOr[Boolean] = js.native
  // Sets the importance of the message, which can be: low, normal, high.
  var markImportance: js.UndefOr[Importance] = js.native
  // The ID of the folder that a message will be moved to.
  var moveToFolder: js.UndefOr[String] = js.native
  // Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
  var permanentDelete: js.UndefOr[Boolean] = js.native
  // The email addresses to which a message should be redirected.
  var redirectTo: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether subsequent rules should be evaluated.
  var stopProcessingRules: js.UndefOr[Boolean] = js.native
}

object MessageRuleActions {
  @scala.inline
  def apply(): MessageRuleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRuleActions]
  }
  @scala.inline
  implicit class MessageRuleActionsOps[Self <: MessageRuleActions] (val x: Self) extends AnyVal {
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
    def setAssignCategoriesVarargs(value: String*): Self = this.set("assignCategories", js.Array(value :_*))
    @scala.inline
    def setAssignCategories(value: js.Array[String]): Self = this.set("assignCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignCategories: Self = this.set("assignCategories", js.undefined)
    @scala.inline
    def setCopyToFolder(value: String): Self = this.set("copyToFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyToFolder: Self = this.set("copyToFolder", js.undefined)
    @scala.inline
    def setDelete(value: Boolean): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setForwardAsAttachmentToVarargs(value: Recipient*): Self = this.set("forwardAsAttachmentTo", js.Array(value :_*))
    @scala.inline
    def setForwardAsAttachmentTo(value: js.Array[Recipient]): Self = this.set("forwardAsAttachmentTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardAsAttachmentTo: Self = this.set("forwardAsAttachmentTo", js.undefined)
    @scala.inline
    def setForwardToVarargs(value: Recipient*): Self = this.set("forwardTo", js.Array(value :_*))
    @scala.inline
    def setForwardTo(value: js.Array[Recipient]): Self = this.set("forwardTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardTo: Self = this.set("forwardTo", js.undefined)
    @scala.inline
    def setMarkAsRead(value: Boolean): Self = this.set("markAsRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkAsRead: Self = this.set("markAsRead", js.undefined)
    @scala.inline
    def setMarkImportance(value: Importance): Self = this.set("markImportance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkImportance: Self = this.set("markImportance", js.undefined)
    @scala.inline
    def setMoveToFolder(value: String): Self = this.set("moveToFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveToFolder: Self = this.set("moveToFolder", js.undefined)
    @scala.inline
    def setPermanentDelete(value: Boolean): Self = this.set("permanentDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanentDelete: Self = this.set("permanentDelete", js.undefined)
    @scala.inline
    def setRedirectToVarargs(value: Recipient*): Self = this.set("redirectTo", js.Array(value :_*))
    @scala.inline
    def setRedirectTo(value: js.Array[Recipient]): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    @scala.inline
    def setStopProcessingRules(value: Boolean): Self = this.set("stopProcessingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopProcessingRules: Self = this.set("stopProcessingRules", js.undefined)
  }
  
}

