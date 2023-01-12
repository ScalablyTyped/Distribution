package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageApprovalStage extends StObject {
  
  // The number of days that a request can be pending a response before it is automatically denied.
  var durationBeforeAutomaticDenial: js.UndefOr[NullableOption[String]] = js.undefined
  
  // If escalation is required, the time a request can be pending a response from a primary approver.
  var durationBeforeEscalation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * If escalation is enabled and the primary approvers do not respond before the escalation time, the escalationApprovers
    * are the users who will be asked to approve requests.
    */
  var escalationApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  // The subjects, typically users, who are the fallback escalation approvers.
  var fallbackEscalationApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  // The subjects, typically users, who are the fallback primary approvers.
  var fallbackPrimaryApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  // Indicates whether the approver is required to provide a justification for approving a request.
  var isApproverJustificationRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // If true, then one or more escalationApprovers are configured in this approval stage.
  var isEscalationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The subjects, typically users, who will be asked to approve requests. A collection of singleUser, groupMembers,
    * requestorManager, internalSponsors or externalSponsors.
    */
  var primaryApprovers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
}
object AccessPackageApprovalStage {
  
  inline def apply(): AccessPackageApprovalStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageApprovalStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageApprovalStage] (val x: Self) extends AnyVal {
    
    inline def setDurationBeforeAutomaticDenial(value: NullableOption[String]): Self = StObject.set(x, "durationBeforeAutomaticDenial", value.asInstanceOf[js.Any])
    
    inline def setDurationBeforeAutomaticDenialNull: Self = StObject.set(x, "durationBeforeAutomaticDenial", null)
    
    inline def setDurationBeforeAutomaticDenialUndefined: Self = StObject.set(x, "durationBeforeAutomaticDenial", js.undefined)
    
    inline def setDurationBeforeEscalation(value: NullableOption[String]): Self = StObject.set(x, "durationBeforeEscalation", value.asInstanceOf[js.Any])
    
    inline def setDurationBeforeEscalationNull: Self = StObject.set(x, "durationBeforeEscalation", null)
    
    inline def setDurationBeforeEscalationUndefined: Self = StObject.set(x, "durationBeforeEscalation", js.undefined)
    
    inline def setEscalationApprovers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "escalationApprovers", value.asInstanceOf[js.Any])
    
    inline def setEscalationApproversNull: Self = StObject.set(x, "escalationApprovers", null)
    
    inline def setEscalationApproversUndefined: Self = StObject.set(x, "escalationApprovers", js.undefined)
    
    inline def setEscalationApproversVarargs(value: SubjectSet*): Self = StObject.set(x, "escalationApprovers", js.Array(value*))
    
    inline def setFallbackEscalationApprovers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "fallbackEscalationApprovers", value.asInstanceOf[js.Any])
    
    inline def setFallbackEscalationApproversNull: Self = StObject.set(x, "fallbackEscalationApprovers", null)
    
    inline def setFallbackEscalationApproversUndefined: Self = StObject.set(x, "fallbackEscalationApprovers", js.undefined)
    
    inline def setFallbackEscalationApproversVarargs(value: SubjectSet*): Self = StObject.set(x, "fallbackEscalationApprovers", js.Array(value*))
    
    inline def setFallbackPrimaryApprovers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "fallbackPrimaryApprovers", value.asInstanceOf[js.Any])
    
    inline def setFallbackPrimaryApproversNull: Self = StObject.set(x, "fallbackPrimaryApprovers", null)
    
    inline def setFallbackPrimaryApproversUndefined: Self = StObject.set(x, "fallbackPrimaryApprovers", js.undefined)
    
    inline def setFallbackPrimaryApproversVarargs(value: SubjectSet*): Self = StObject.set(x, "fallbackPrimaryApprovers", js.Array(value*))
    
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
