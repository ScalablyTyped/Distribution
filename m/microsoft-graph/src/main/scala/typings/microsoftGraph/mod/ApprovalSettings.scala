package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalSettings extends StObject {
  
  // One of SingleStage, Serial, Parallel, NoApproval (default). NoApproval is used when isApprovalRequired is false.
  var approvalMode: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If approval is required, the one or two elements of this collection define each of the stages of approval. An empty
    * array if no approval is required.
    */
  var approvalStages: js.UndefOr[NullableOption[js.Array[UnifiedApprovalStage]]] = js.undefined
  
  // Indicates whether approval is required for requests in this policy.
  var isApprovalRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether approval is required for a user to extend their assignment.
  var isApprovalRequiredForExtension: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether the requestor is required to supply a justification in their request.
  var isRequestorJustificationRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object ApprovalSettings {
  
  inline def apply(): ApprovalSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalSettings]
  }
  
  extension [Self <: ApprovalSettings](x: Self) {
    
    inline def setApprovalMode(value: NullableOption[String]): Self = StObject.set(x, "approvalMode", value.asInstanceOf[js.Any])
    
    inline def setApprovalModeNull: Self = StObject.set(x, "approvalMode", null)
    
    inline def setApprovalModeUndefined: Self = StObject.set(x, "approvalMode", js.undefined)
    
    inline def setApprovalStages(value: NullableOption[js.Array[UnifiedApprovalStage]]): Self = StObject.set(x, "approvalStages", value.asInstanceOf[js.Any])
    
    inline def setApprovalStagesNull: Self = StObject.set(x, "approvalStages", null)
    
    inline def setApprovalStagesUndefined: Self = StObject.set(x, "approvalStages", js.undefined)
    
    inline def setApprovalStagesVarargs(value: UnifiedApprovalStage*): Self = StObject.set(x, "approvalStages", js.Array(value*))
    
    inline def setIsApprovalRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequired", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForExtension(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequiredForExtension", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequiredForExtensionNull: Self = StObject.set(x, "isApprovalRequiredForExtension", null)
    
    inline def setIsApprovalRequiredForExtensionUndefined: Self = StObject.set(x, "isApprovalRequiredForExtension", js.undefined)
    
    inline def setIsApprovalRequiredNull: Self = StObject.set(x, "isApprovalRequired", null)
    
    inline def setIsApprovalRequiredUndefined: Self = StObject.set(x, "isApprovalRequired", js.undefined)
    
    inline def setIsRequestorJustificationRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequestorJustificationRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequestorJustificationRequiredNull: Self = StObject.set(x, "isRequestorJustificationRequired", null)
    
    inline def setIsRequestorJustificationRequiredUndefined: Self = StObject.set(x, "isRequestorJustificationRequired", js.undefined)
  }
}
