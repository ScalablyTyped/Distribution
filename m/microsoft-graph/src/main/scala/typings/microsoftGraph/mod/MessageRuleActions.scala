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
  
  inline def apply(): MessageRuleActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRuleActions]
  }
  
  extension [Self <: MessageRuleActions](x: Self) {
    
    inline def setAssignCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "assignCategories", value.asInstanceOf[js.Any])
    
    inline def setAssignCategoriesNull: Self = StObject.set(x, "assignCategories", null)
    
    inline def setAssignCategoriesUndefined: Self = StObject.set(x, "assignCategories", js.undefined)
    
    inline def setAssignCategoriesVarargs(value: String*): Self = StObject.set(x, "assignCategories", js.Array(value*))
    
    inline def setCopyToFolder(value: NullableOption[String]): Self = StObject.set(x, "copyToFolder", value.asInstanceOf[js.Any])
    
    inline def setCopyToFolderNull: Self = StObject.set(x, "copyToFolder", null)
    
    inline def setCopyToFolderUndefined: Self = StObject.set(x, "copyToFolder", js.undefined)
    
    inline def setDelete(value: NullableOption[Boolean]): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteNull: Self = StObject.set(x, "delete", null)
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setForwardAsAttachmentTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "forwardAsAttachmentTo", value.asInstanceOf[js.Any])
    
    inline def setForwardAsAttachmentToNull: Self = StObject.set(x, "forwardAsAttachmentTo", null)
    
    inline def setForwardAsAttachmentToUndefined: Self = StObject.set(x, "forwardAsAttachmentTo", js.undefined)
    
    inline def setForwardAsAttachmentToVarargs(value: Recipient*): Self = StObject.set(x, "forwardAsAttachmentTo", js.Array(value*))
    
    inline def setForwardTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "forwardTo", value.asInstanceOf[js.Any])
    
    inline def setForwardToNull: Self = StObject.set(x, "forwardTo", null)
    
    inline def setForwardToUndefined: Self = StObject.set(x, "forwardTo", js.undefined)
    
    inline def setForwardToVarargs(value: Recipient*): Self = StObject.set(x, "forwardTo", js.Array(value*))
    
    inline def setMarkAsRead(value: NullableOption[Boolean]): Self = StObject.set(x, "markAsRead", value.asInstanceOf[js.Any])
    
    inline def setMarkAsReadNull: Self = StObject.set(x, "markAsRead", null)
    
    inline def setMarkAsReadUndefined: Self = StObject.set(x, "markAsRead", js.undefined)
    
    inline def setMarkImportance(value: NullableOption[Importance]): Self = StObject.set(x, "markImportance", value.asInstanceOf[js.Any])
    
    inline def setMarkImportanceNull: Self = StObject.set(x, "markImportance", null)
    
    inline def setMarkImportanceUndefined: Self = StObject.set(x, "markImportance", js.undefined)
    
    inline def setMoveToFolder(value: NullableOption[String]): Self = StObject.set(x, "moveToFolder", value.asInstanceOf[js.Any])
    
    inline def setMoveToFolderNull: Self = StObject.set(x, "moveToFolder", null)
    
    inline def setMoveToFolderUndefined: Self = StObject.set(x, "moveToFolder", js.undefined)
    
    inline def setPermanentDelete(value: NullableOption[Boolean]): Self = StObject.set(x, "permanentDelete", value.asInstanceOf[js.Any])
    
    inline def setPermanentDeleteNull: Self = StObject.set(x, "permanentDelete", null)
    
    inline def setPermanentDeleteUndefined: Self = StObject.set(x, "permanentDelete", js.undefined)
    
    inline def setRedirectTo(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    inline def setRedirectToNull: Self = StObject.set(x, "redirectTo", null)
    
    inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    inline def setRedirectToVarargs(value: Recipient*): Self = StObject.set(x, "redirectTo", js.Array(value*))
    
    inline def setStopProcessingRules(value: NullableOption[Boolean]): Self = StObject.set(x, "stopProcessingRules", value.asInstanceOf[js.Any])
    
    inline def setStopProcessingRulesNull: Self = StObject.set(x, "stopProcessingRules", null)
    
    inline def setStopProcessingRulesUndefined: Self = StObject.set(x, "stopProcessingRules", js.undefined)
  }
}
