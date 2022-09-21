package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalStage
  extends StObject
     with Entity {
  
  // Indicates whether the stage is assigned to the calling user to review. Read-only.
  var assignedToMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The label provided by the policy creator to identify an approval stage. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The justification associated with the approval stage decision.
  var justification: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The result of this approval record. Possible values include: NotReviewed, Approved, Denied.
  var reviewResult: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The identifier of the reviewer. 00000000-0000-0000-0000-000000000000 if the assigned reviewer hasn't reviewed.
    * Read-only.
    */
  var reviewedBy: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  /**
    * The date and time when a decision was recorded. The date and time information uses ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var reviewedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The stage status. Possible values: InProgress, Initializing, Completed, Expired. Read-only.
  var status: js.UndefOr[NullableOption[String]] = js.undefined
}
object ApprovalStage {
  
  inline def apply(): ApprovalStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalStage]
  }
  
  extension [Self <: ApprovalStage](x: Self) {
    
    inline def setAssignedToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "assignedToMe", value.asInstanceOf[js.Any])
    
    inline def setAssignedToMeNull: Self = StObject.set(x, "assignedToMe", null)
    
    inline def setAssignedToMeUndefined: Self = StObject.set(x, "assignedToMe", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setJustification(value: NullableOption[String]): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    inline def setJustificationNull: Self = StObject.set(x, "justification", null)
    
    inline def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    inline def setReviewResult(value: NullableOption[String]): Self = StObject.set(x, "reviewResult", value.asInstanceOf[js.Any])
    
    inline def setReviewResultNull: Self = StObject.set(x, "reviewResult", null)
    
    inline def setReviewResultUndefined: Self = StObject.set(x, "reviewResult", js.undefined)
    
    inline def setReviewedBy(value: NullableOption[Identity]): Self = StObject.set(x, "reviewedBy", value.asInstanceOf[js.Any])
    
    inline def setReviewedByNull: Self = StObject.set(x, "reviewedBy", null)
    
    inline def setReviewedByUndefined: Self = StObject.set(x, "reviewedBy", js.undefined)
    
    inline def setReviewedDateTime(value: NullableOption[String]): Self = StObject.set(x, "reviewedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReviewedDateTimeNull: Self = StObject.set(x, "reviewedDateTime", null)
    
    inline def setReviewedDateTimeUndefined: Self = StObject.set(x, "reviewedDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
