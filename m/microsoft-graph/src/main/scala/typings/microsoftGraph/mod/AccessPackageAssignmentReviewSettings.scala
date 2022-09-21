package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageAssignmentReviewSettings extends StObject {
  
  /**
    * The default decision to apply if the access is not reviewed. The possible values are: keepAccess, removeAccess,
    * acceptAccessRecommendation, unknownFutureValue.
    */
  var expirationBehavior: js.UndefOr[NullableOption[AccessReviewExpirationBehavior]] = js.undefined
  
  // This collection specifies the users who will be the fallback reviewers when the primary reviewers don't respond.
  var fallbackReviewers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  // If true, access reviews are required for assignments through this policy.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether to display recommendations to the reviewer. The default value is true.
  var isRecommendationEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the reviewer must provide justification for the approval. The default value is true.
  var isReviewerJustificationRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies whether the principals can review their own assignments.
  var isSelfReview: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // This collection specifies the users or group of users who will review the access package assignments.
  var primaryReviewers: js.UndefOr[NullableOption[js.Array[SubjectSet]]] = js.undefined
  
  // When the first review should start and how often it should recur.
  var schedule: js.UndefOr[NullableOption[EntitlementManagementSchedule]] = js.undefined
}
object AccessPackageAssignmentReviewSettings {
  
  inline def apply(): AccessPackageAssignmentReviewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageAssignmentReviewSettings]
  }
  
  extension [Self <: AccessPackageAssignmentReviewSettings](x: Self) {
    
    inline def setExpirationBehavior(value: NullableOption[AccessReviewExpirationBehavior]): Self = StObject.set(x, "expirationBehavior", value.asInstanceOf[js.Any])
    
    inline def setExpirationBehaviorNull: Self = StObject.set(x, "expirationBehavior", null)
    
    inline def setExpirationBehaviorUndefined: Self = StObject.set(x, "expirationBehavior", js.undefined)
    
    inline def setFallbackReviewers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "fallbackReviewers", value.asInstanceOf[js.Any])
    
    inline def setFallbackReviewersNull: Self = StObject.set(x, "fallbackReviewers", null)
    
    inline def setFallbackReviewersUndefined: Self = StObject.set(x, "fallbackReviewers", js.undefined)
    
    inline def setFallbackReviewersVarargs(value: SubjectSet*): Self = StObject.set(x, "fallbackReviewers", js.Array(value*))
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setIsRecommendationEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isRecommendationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsRecommendationEnabledNull: Self = StObject.set(x, "isRecommendationEnabled", null)
    
    inline def setIsRecommendationEnabledUndefined: Self = StObject.set(x, "isRecommendationEnabled", js.undefined)
    
    inline def setIsReviewerJustificationRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isReviewerJustificationRequired", value.asInstanceOf[js.Any])
    
    inline def setIsReviewerJustificationRequiredNull: Self = StObject.set(x, "isReviewerJustificationRequired", null)
    
    inline def setIsReviewerJustificationRequiredUndefined: Self = StObject.set(x, "isReviewerJustificationRequired", js.undefined)
    
    inline def setIsSelfReview(value: NullableOption[Boolean]): Self = StObject.set(x, "isSelfReview", value.asInstanceOf[js.Any])
    
    inline def setIsSelfReviewNull: Self = StObject.set(x, "isSelfReview", null)
    
    inline def setIsSelfReviewUndefined: Self = StObject.set(x, "isSelfReview", js.undefined)
    
    inline def setPrimaryReviewers(value: NullableOption[js.Array[SubjectSet]]): Self = StObject.set(x, "primaryReviewers", value.asInstanceOf[js.Any])
    
    inline def setPrimaryReviewersNull: Self = StObject.set(x, "primaryReviewers", null)
    
    inline def setPrimaryReviewersUndefined: Self = StObject.set(x, "primaryReviewers", js.undefined)
    
    inline def setPrimaryReviewersVarargs(value: SubjectSet*): Self = StObject.set(x, "primaryReviewers", js.Array(value*))
    
    inline def setSchedule(value: NullableOption[EntitlementManagementSchedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
