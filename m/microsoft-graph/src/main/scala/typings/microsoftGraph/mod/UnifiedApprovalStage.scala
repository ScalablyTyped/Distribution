package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnifiedApprovalStage extends StObject {
  
  // The number of days that a request can be pending a response before it is automatically denied.
  var approvalStageTimeOutInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The escalation approvers for this stage when the primary approvers don't respond.
  var escalationApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  /**
    * The time a request can be pending a response from a primary approver before it can be escalated to the escalation
    * approvers.
    */
  var escalationTimeInMinutes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Indicates whether the approver must provide justification for their reponse.
  var isApproverJustificationRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether escalation if enabled.
  var isEscalationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The primary approvers of this stage.
  var primaryApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
}
object UnifiedApprovalStage {
  
  inline def apply(): UnifiedApprovalStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnifiedApprovalStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnifiedApprovalStage] (val x: Self) extends AnyVal {
    
    inline def setApprovalStageTimeOutInDays(value: NullableOption[Double]): Self = StObject.set(x, "approvalStageTimeOutInDays", value.asInstanceOf[js.Any])
    
    inline def setApprovalStageTimeOutInDaysNull: Self = StObject.set(x, "approvalStageTimeOutInDays", null)
    
    inline def setApprovalStageTimeOutInDaysUndefined: Self = StObject.set(x, "approvalStageTimeOutInDays", js.undefined)
    
    inline def setEscalationApprovers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "escalationApprovers", value.asInstanceOf[js.Any])
    
    inline def setEscalationApproversNull: Self = StObject.set(x, "escalationApprovers", null)
    
    inline def setEscalationApproversUndefined: Self = StObject.set(x, "escalationApprovers", js.undefined)
    
    inline def setEscalationApproversVarargs(value: SubjectSet*): Self = StObject.set(x, "escalationApprovers", js.Array(value*))
    
    inline def setEscalationTimeInMinutes(value: NullableOption[Double]): Self = StObject.set(x, "escalationTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEscalationTimeInMinutesNull: Self = StObject.set(x, "escalationTimeInMinutes", null)
    
    inline def setEscalationTimeInMinutesUndefined: Self = StObject.set(x, "escalationTimeInMinutes", js.undefined)
    
    inline def setIsApproverJustificationRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isApproverJustificationRequired", value.asInstanceOf[js.Any])
    
    inline def setIsApproverJustificationRequiredNull: Self = StObject.set(x, "isApproverJustificationRequired", null)
    
    inline def setIsApproverJustificationRequiredUndefined: Self = StObject.set(x, "isApproverJustificationRequired", js.undefined)
    
    inline def setIsEscalationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEscalationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEscalationEnabledNull: Self = StObject.set(x, "isEscalationEnabled", null)
    
    inline def setIsEscalationEnabledUndefined: Self = StObject.set(x, "isEscalationEnabled", js.undefined)
    
    inline def setPrimaryApprovers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "primaryApprovers", value.asInstanceOf[js.Any])
    
    inline def setPrimaryApproversNull: Self = StObject.set(x, "primaryApprovers", null)
    
    inline def setPrimaryApproversUndefined: Self = StObject.set(x, "primaryApprovers", js.undefined)
    
    inline def setPrimaryApproversVarargs(value: SubjectSet*): Self = StObject.set(x, "primaryApprovers", js.Array(value*))
  }
}
