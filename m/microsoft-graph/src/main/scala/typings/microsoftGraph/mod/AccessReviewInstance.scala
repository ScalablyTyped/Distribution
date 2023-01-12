package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstance
  extends StObject
     with Entity {
  
  /**
    * Returns the collection of reviewers who were contacted to complete this review. While the reviewers and
    * fallbackReviewers properties of the accessReviewScheduleDefinition might specify group owners or managers as reviewers,
    * contactedReviewers returns their individual identities. Supports $select. Read-only.
    */
  var contactedReviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewer]]] = js.undefined
  
  /**
    * Each user reviewed in an accessReviewInstance has a decision item representing if they were approved, denied, or not
    * yet reviewed.
    */
  var decisions: js.UndefOr[NullableOption[js.Array[AccessReviewInstanceDecisionItem]]] = js.undefined
  
  /**
    * DateTime when review instance is scheduled to end.The DatetimeOffset type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports
    * $select. Read-only.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be
    * notified to take action if no users are found from the list of reviewers specified. This could occur when either the
    * group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a
    * user's manager does not exist. Supports $select.
    */
  var fallbackReviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * This collection of access review scopes is used to define who the reviewers are. Supports $select. For examples of
    * options for assigning reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
    */
  var reviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of
    * users reviewed in a group. Supports $select and $filter (contains only). Read-only.
    */
  var scope: js.UndefOr[NullableOption[AccessReviewScope]] = js.undefined
  
  /**
    * If the instance has multiple stages, this returns the collection of stages. A new stage will only be created when the
    * previous stage ends. The existence, number, and settings of stages on a review instance are created based on the
    * accessReviewStageSettings on the parent accessReviewScheduleDefinition.
    */
  var stages: js.UndefOr[NullableOption[js.Array[AccessReviewStage]]] = js.undefined
  
  /**
    * DateTime when review instance is scheduled to start. May be in the future. The DateTimeOffset type represents date and
    * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z. Supports $select. Read-only.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the status of an accessReview. Possible values: Initializing, NotStarted, Starting, InProgress, Completing,
    * Completed, AutoReviewing, and AutoReviewed. Supports $select, $orderby, and $filter (eq only). Read-only.
    */
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInstance {
  
  inline def apply(): AccessReviewInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewInstance] (val x: Self) extends AnyVal {
    
    inline def setContactedReviewers(value: NullableOption[js.Array[AccessReviewReviewer]]): Self = StObject.set(x, "contactedReviewers", value.asInstanceOf[js.Any])
    
    inline def setContactedReviewersNull: Self = StObject.set(x, "contactedReviewers", null)
    
    inline def setContactedReviewersUndefined: Self = StObject.set(x, "contactedReviewers", js.undefined)
    
    inline def setContactedReviewersVarargs(value: AccessReviewReviewer*): Self = StObject.set(x, "contactedReviewers", js.Array(value*))
    
    inline def setDecisions(value: NullableOption[js.Array[AccessReviewInstanceDecisionItem]]): Self = StObject.set(x, "decisions", value.asInstanceOf[js.Any])
    
    inline def setDecisionsNull: Self = StObject.set(x, "decisions", null)
    
    inline def setDecisionsUndefined: Self = StObject.set(x, "decisions", js.undefined)
    
    inline def setDecisionsVarargs(value: AccessReviewInstanceDecisionItem*): Self = StObject.set(x, "decisions", js.Array(value*))
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setFallbackReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "fallbackReviewers", value.asInstanceOf[js.Any])
    
    inline def setFallbackReviewersNull: Self = StObject.set(x, "fallbackReviewers", null)
    
    inline def setFallbackReviewersUndefined: Self = StObject.set(x, "fallbackReviewers", js.undefined)
    
    inline def setFallbackReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "fallbackReviewers", js.Array(value*))
    
    inline def setReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersNull: Self = StObject.set(x, "reviewers", null)
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setScope(value: NullableOption[AccessReviewScope]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeNull: Self = StObject.set(x, "scope", null)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setStages(value: NullableOption[js.Array[AccessReviewStage]]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesNull: Self = StObject.set(x, "stages", null)
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: AccessReviewStage*): Self = StObject.set(x, "stages", js.Array(value*))
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
