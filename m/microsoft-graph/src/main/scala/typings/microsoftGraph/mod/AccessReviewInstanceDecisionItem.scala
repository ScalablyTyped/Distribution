package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewInstanceDecisionItem
  extends StObject
     with Entity {
  
  // The identifier of the accessReviewInstance parent. Supports $select. Read-only.
  var accessReviewId: js.UndefOr[String] = js.undefined
  
  // The identifier of the user who applied the decision. Read-only.
  var appliedBy: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
  
  /**
    * The timestamp when the approval decision was applied.00000000-0000-0000-0000-000000000000 if the assigned reviewer
    * hasn't applied the decision or it was automatically applied. The DatetimeOffset type represents date and time
    * information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is
    * 2014-01-01T00:00:00Z. Supports $select. Read-only.
    */
  var appliedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The result of applying the decision. Possible values: New, AppliedSuccessfully, AppliedWithUnknownFailure,
    * AppliedSuccessfullyButObjectNotFound and ApplyNotSupported. Supports $select, $orderby, and $filter (eq only).
    * Read-only.
    */
  var applyResult: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Result of the review. Possible values: Approve, Deny, NotReviewed, or DontKnow. Supports $select, $orderby, and $filter
    * (eq only).
    */
  var decision: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Justification left by the reviewer when they made the decision.
  var justification: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Every decision item in an access review represents a principal's access to a resource. This property represents details
    * of the principal. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is
    * 'Bob' and the resource is 'Sales'. Principals can be of two types - userIdentity and servicePrincipalIdentity. Supports
    * $select. Read-only.
    */
  var principal: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  /**
    * A link to the principal object. For example,
    * https://graph.microsoft.com/v1.0/users/a6c7aecb-cbfd-4763-87ef-e91b4bd509d9. Read-only.
    */
  var principalLink: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A system-generated recommendation for the approval decision based off last interactive sign-in to tenant. Recommend
    * approve if sign-in is within thirty days of start of review. Recommend deny if sign-in is greater than thirty days of
    * start of review. Recommendation not available otherwise. Possible values: Approve, Deny, or NoInfoAvailable. Supports
    * $select, $orderby, and $filter (eq only). Read-only.
    */
  var recommendation: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Every decision item in an access review represents a principal's access to a resource. This property represents details
    * of the resource. For example, if a decision item represents access of User 'Bob' to Group 'Sales' - The principal is
    * Bob and the resource is 'Sales'. Resources can be of multiple types. See accessReviewInstanceDecisionItemResource.
    * Read-only.
    */
  var resource: js.UndefOr[NullableOption[AccessReviewInstanceDecisionItemResource]] = js.undefined
  
  /**
    * A link to the resource. For example,
    * https://graph.microsoft.com/v1.0/servicePrincipals/c86300f3-8695-4320-9f6e-32a2555f5ff8. Supports $select. Read-only.
    */
  var resourceLink: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identifier of the reviewer.00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed. Supports
    * $select. Read-only.
    */
  var reviewedBy: js.UndefOr[NullableOption[UserIdentity]] = js.undefined
  
  // The timestamp when the review decision occurred. Supports $select. Read-only.
  var reviewedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewInstanceDecisionItem {
  
  inline def apply(): AccessReviewInstanceDecisionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewInstanceDecisionItem]
  }
  
  extension [Self <: AccessReviewInstanceDecisionItem](x: Self) {
    
    inline def setAccessReviewId(value: String): Self = StObject.set(x, "accessReviewId", value.asInstanceOf[js.Any])
    
    inline def setAccessReviewIdUndefined: Self = StObject.set(x, "accessReviewId", js.undefined)
    
    inline def setAppliedBy(value: NullableOption[UserIdentity]): Self = StObject.set(x, "appliedBy", value.asInstanceOf[js.Any])
    
    inline def setAppliedByNull: Self = StObject.set(x, "appliedBy", null)
    
    inline def setAppliedByUndefined: Self = StObject.set(x, "appliedBy", js.undefined)
    
    inline def setAppliedDateTime(value: NullableOption[String]): Self = StObject.set(x, "appliedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAppliedDateTimeNull: Self = StObject.set(x, "appliedDateTime", null)
    
    inline def setAppliedDateTimeUndefined: Self = StObject.set(x, "appliedDateTime", js.undefined)
    
    inline def setApplyResult(value: NullableOption[String]): Self = StObject.set(x, "applyResult", value.asInstanceOf[js.Any])
    
    inline def setApplyResultNull: Self = StObject.set(x, "applyResult", null)
    
    inline def setApplyResultUndefined: Self = StObject.set(x, "applyResult", js.undefined)
    
    inline def setDecision(value: NullableOption[String]): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionNull: Self = StObject.set(x, "decision", null)
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setJustification(value: NullableOption[String]): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationNull: Self = StObject.set(x, "justification", null)
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setPrincipal(value: NullableOption[Identity]): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalLink(value: NullableOption[String]): Self = StObject.set(x, "principalLink", value.asInstanceOf[js.Any])
    
    inline def setPrincipalLinkNull: Self = StObject.set(x, "principalLink", null)
    
    inline def setPrincipalLinkUndefined: Self = StObject.set(x, "principalLink", js.undefined)
    
    inline def setPrincipalNull: Self = StObject.set(x, "principal", null)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setRecommendation(value: NullableOption[String]): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setRecommendationNull: Self = StObject.set(x, "recommendation", null)
    
    inline def setRecommendationUndefined: Self = StObject.set(x, "recommendation", js.undefined)
    
    inline def setResource(value: NullableOption[AccessReviewInstanceDecisionItemResource]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceLink(value: NullableOption[String]): Self = StObject.set(x, "resourceLink", value.asInstanceOf[js.Any])
    
    inline def setResourceLinkNull: Self = StObject.set(x, "resourceLink", null)
    
    inline def setResourceLinkUndefined: Self = StObject.set(x, "resourceLink", js.undefined)
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setReviewedBy(value: NullableOption[UserIdentity]): Self = StObject.set(x, "reviewedBy", value.asInstanceOf[js.Any])
    
    inline def setReviewedByNull: Self = StObject.set(x, "reviewedBy", null)
    
    inline def setReviewedByUndefined: Self = StObject.set(x, "reviewedBy", js.undefined)
    
    inline def setReviewedDateTime(value: NullableOption[String]): Self = StObject.set(x, "reviewedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewedDateTimeNull: Self = StObject.set(x, "reviewedDateTime", null)
    
    inline def setReviewedDateTimeUndefined: Self = StObject.set(x, "reviewedDateTime", js.undefined)
  }
}
