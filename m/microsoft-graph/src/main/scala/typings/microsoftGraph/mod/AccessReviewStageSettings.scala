package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewStageSettings extends StObject {
  
  /**
    * Indicate which decisions will go to the next stage. Can be a sub-set of Approve, Deny, Recommendation, or NotReviewed.
    * If not provided, all decisions will go to the next stage. Optional.
    */
  var decisionsThatWillMoveToNextStage: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Defines the sequential or parallel order of the stages and depends on the stageId. Only sequential stages are currently
    * supported. For example, if stageId is 2, then dependsOn must be 1. If stageId is 1, do not specify dependsOn. Required
    * if stageId is not 1.
    */
  var dependsOn: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The duration of the stage. Required. NOTE: The cumulative value of this property across all stages 1. Will override the
    * instanceDurationInDays setting on the accessReviewScheduleDefinition object. 2. Cannot exceed the length of one
    * recurrence. That is, if the review recurs weekly, the cumulative durationInDays cannot exceed 7.
    */
  var durationInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * If provided, the fallback reviewers are asked to complete a review if the primary reviewers do not exist. For example,
    * if managers are selected as reviewers and a principal under review does not have a manager in Azure AD, the fallback
    * reviewers are asked to review that principal. NOTE: The value of this property will override the corresponding setting
    * on the accessReviewScheduleDefinition object.
    */
  var fallbackReviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * Indicates whether showing recommendations to reviewers is enabled. Required. NOTE: The value of this property will
    * override override the corresponding setting on the accessReviewScheduleDefinition object.
    */
  var recommendationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines who the reviewers are. If none are specified, the review is a self-review (users review their own access). For
    * examples of options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft
    * Graph API. NOTE: The value of this property will override the corresponding setting on the
    * accessReviewScheduleDefinition.
    */
  var reviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * Unique identifier of the accessReviewStageSettings object. The stageId will be used by the dependsOn property to
    * indicate the order of the stages. Required.
    */
  var stageId: js.UndefOr[String] = js.undefined
}
object AccessReviewStageSettings {
  
  inline def apply(): AccessReviewStageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewStageSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewStageSettings] (val x: Self) extends AnyVal {
    
    inline def setDecisionsThatWillMoveToNextStage(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "decisionsThatWillMoveToNextStage", value.asInstanceOf[js.Any])
    
    inline def setDecisionsThatWillMoveToNextStageNull: Self = StObject.set(x, "decisionsThatWillMoveToNextStage", null)
    
    inline def setDecisionsThatWillMoveToNextStageUndefined: Self = StObject.set(x, "decisionsThatWillMoveToNextStage", js.undefined)
    
    inline def setDecisionsThatWillMoveToNextStageVarargs(value: String*): Self = StObject.set(x, "decisionsThatWillMoveToNextStage", js.Array(value*))
    
    inline def setDependsOn(value: js.Array[String]): Self = StObject.set(x, "dependsOn", value.asInstanceOf[js.Any])
    
    inline def setDependsOnUndefined: Self = StObject.set(x, "dependsOn", js.undefined)
    
    inline def setDependsOnVarargs(value: String*): Self = StObject.set(x, "dependsOn", js.Array(value*))
    
    inline def setDurationInDays(value: Double): Self = StObject.set(x, "durationInDays", value.asInstanceOf[js.Any])
    
    inline def setDurationInDaysUndefined: Self = StObject.set(x, "durationInDays", js.undefined)
    
    inline def setFallbackReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "fallbackReviewers", value.asInstanceOf[js.Any])
    
    inline def setFallbackReviewersNull: Self = StObject.set(x, "fallbackReviewers", null)
    
    inline def setFallbackReviewersUndefined: Self = StObject.set(x, "fallbackReviewers", js.undefined)
    
    inline def setFallbackReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "fallbackReviewers", js.Array(value*))
    
    inline def setRecommendationsEnabled(value: Boolean): Self = StObject.set(x, "recommendationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRecommendationsEnabledUndefined: Self = StObject.set(x, "recommendationsEnabled", js.undefined)
    
    inline def setReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersNull: Self = StObject.set(x, "reviewers", null)
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setStageId(value: String): Self = StObject.set(x, "stageId", value.asInstanceOf[js.Any])
    
    inline def setStageIdUndefined: Self = StObject.set(x, "stageId", js.undefined)
  }
}
