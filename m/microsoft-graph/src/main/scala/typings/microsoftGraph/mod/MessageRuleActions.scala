package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRuleActions extends StObject {
  
  // A list of categories to be assigned to a message.
  var assignCategories: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The ID of a folder that a message is to be copied to.
  var copyToFolder: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether a message should be moved to the Deleted Items folder.
  var delete: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The email addresses of the recipients to which a message should be forwarded as an attachment.
  var forwardAsAttachmentTo: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // The email addresses of the recipients to which a message should be forwarded.
  var forwardTo: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // Indicates whether a message should be marked as read.
  var markAsRead: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Sets the importance of the message, which can be: low, normal, high.
  var markImportance: js.UndefOr[NullableOption[Importance]] = js.undefined
  
  // The ID of the folder that a message will be moved to.
  var moveToFolder: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether a message should be permanently deleted and not saved to the Deleted Items folder.
  var permanentDelete: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The email addresses to which a message should be redirected.
  var redirectTo: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // Indicates whether subsequent rules should be evaluated.
  var stopProcessingRules: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object MessageRuleActions {
  
  @scala.inline
  def apply(): MessageRuleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRuleActions]
  }
  
  @scala.inline
  implicit class MessageRuleActionsMutableBuilder[Self <: MessageRuleActions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "assignCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignCategoriesNull: Self = StObject.set(x, "assignCategories", null)
    
    @scala.inline
    def setAssignCategoriesUndefined: Self = StObject.set(x, "assignCategories", js.undefined)
    
    @scala.inline
    def setAssignCategoriesVarargs(value: String*): Self = StObject.set(x, "assignCategories", js.Array(value :_*))
    
    @scala.inline
    def setCopyToFolder(value: NullableOption[String]): Self = StObject.set(x, "copyToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyToFolderNull: Self = StObject.set(x, "copyToFolder", null)
    
    @scala.inline
    def setCopyToFolderUndefined: Self = StObject.set(x, "copyToFolder", js.undefined)
    
    @scala.inline
    def setDelete(value: NullableOption[Boolean]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setForwardAsAttachmentTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "forwardAsAttachmentTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardAsAttachmentToNull: Self = StObject.set(x, "forwardAsAttachmentTo", null)
    
    @scala.inline
    def setForwardAsAttachmentToUndefined: Self = StObject.set(x, "forwardAsAttachmentTo", js.undefined)
    
    @scala.inline
    def setForwardAsAttachmentToVarargs(value: Recipient*): Self = StObject.set(x, "forwardAsAttachmentTo", js.Array(value :_*))
    
    @scala.inline
    def setForwardTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "forwardTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardToNull: Self = StObject.set(x, "forwardTo", null)
    
    @scala.inline
    def setForwardToUndefined: Self = StObject.set(x, "forwardTo", js.undefined)
    
    @scala.inline
    def setForwardToVarargs(value: Recipient*): Self = StObject.set(x, "forwardTo", js.Array(value :_*))
    
    @scala.inline
    def setMarkAsRead(value: NullableOption[Boolean]): Self = StObject.set(x, "markAsRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkAsReadNull: Self = StObject.set(x, "markAsRead", null)
    
    @scala.inline
    def setMarkAsReadUndefined: Self = StObject.set(x, "markAsRead", js.undefined)
    
    @scala.inline
    def setMarkImportance(value: NullableOption[Importance]): Self = StObject.set(x, "markImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkImportanceNull: Self = StObject.set(x, "markImportance", null)
    
    @scala.inline
    def setMarkImportanceUndefined: Self = StObject.set(x, "markImportance", js.undefined)
    
    @scala.inline
    def setMoveToFolder(value: NullableOption[String]): Self = StObject.set(x, "moveToFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveToFolderNull: Self = StObject.set(x, "moveToFolder", null)
    
    @scala.inline
    def setMoveToFolderUndefined: Self = StObject.set(x, "moveToFolder", js.undefined)
    
    @scala.inline
    def setPermanentDelete(value: NullableOption[Boolean]): Self = StObject.set(x, "permanentDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentDeleteNull: Self = StObject.set(x, "permanentDelete", null)
    
    @scala.inline
    def setPermanentDeleteUndefined: Self = StObject.set(x, "permanentDelete", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectToNull: Self = StObject.set(x, "redirectTo", null)
    
    @scala.inline
    def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    @scala.inline
    def setRedirectToVarargs(value: Recipient*): Self = StObject.set(x, "redirectTo", js.Array(value :_*))
    
    @scala.inline
    def setStopProcessingRules(value: NullableOption[Boolean]): Self = StObject.set(x, "stopProcessingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopProcessingRulesNull: Self = StObject.set(x, "stopProcessingRules", null)
    
    @scala.inline
    def setStopProcessingRulesUndefined: Self = StObject.set(x, "stopProcessingRules", js.undefined)
  }
}
