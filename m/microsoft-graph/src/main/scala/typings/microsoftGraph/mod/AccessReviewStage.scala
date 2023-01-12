package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewStage
  extends StObject
     with Entity {
  
  /**
    * Each user reviewed in an accessReviewStage has a decision item representing if they were approved, denied, or not yet
    * reviewed.
    */
  var decisions: js.UndefOr[NullableOption[js.Array[AccessReviewInstanceDecisionItem]]] = js.undefined
  
  /**
    * The date and time in ISO 8601 format and UTC time when the review stage is scheduled to end. This property is the
    * cumulative total of the durationInDays for all stages. Read-only.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * This collection of reviewer scopes is used to define the list of fallback reviewers. These fallback reviewers will be
    * notified to take action if no users are found from the list of reviewers specified. This could occur when either the
    * group owner is specified as the reviewer but the group owner does not exist, or manager is specified as reviewer but a
    * user's manager does not exist.
    */
  var fallbackReviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  /**
    * This collection of access review scopes is used to define who the reviewers are. For examples of options for assigning
    * reviewers, see Assign reviewers to your access review definition using the Microsoft Graph API.
    */
  var reviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  // The date and time in ISO 8601 format and UTC time when the review stage is scheduled to start. Read-only.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Specifies the status of an accessReviewStage. Possible values: Initializing, NotStarted, Starting, InProgress,
    * Completing, Completed, AutoReviewing, and AutoReviewed. Supports $orderby, and $filter (eq only). Read-only.
    */
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewStage {
  
  inline def apply(): AccessReviewStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewStage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewStage] (val x: Self) extends AnyVal {
    
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
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
