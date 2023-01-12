package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import typings.microsoftGraph.mod.ResultInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseOperation
  extends StObject
     with Entity {
  
  /**
    * The type of action the operation represents. Possible values are:
    * addToReviewSet,applyTags,contentExport,convertToPdf,estimateStatistics, purgeData
    */
  var action: js.UndefOr[NullableOption[CaseAction]] = js.undefined
  
  // The date and time the operation was completed.
  var completedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user that created the operation.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // The date and time the operation was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The progress of the operation.
  var percentProgress: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Contains success and failure-specific result information.
  var resultInfo: js.UndefOr[NullableOption[ResultInfo]] = js.undefined
  
  /**
    * The status of the case operation. Possible values are: notStarted, submissionFailed, running, succeeded,
    * partiallySucceeded, failed.
    */
  var status: js.UndefOr[NullableOption[CaseOperationStatus]] = js.undefined
}
object CaseOperation {
  
  inline def apply(): CaseOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseOperation] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NullableOption[CaseAction]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCompletedDateTime(value: NullableOption[String]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setPercentProgress(value: NullableOption[Double]): Self = StObject.set(x, "percentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressNull: Self = StObject.set(x, "percentProgress", null)
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "percentProgress", js.undefined)
    
    inline def setResultInfo(value: NullableOption[ResultInfo]): Self = StObject.set(x, "resultInfo", value.asInstanceOf[js.Any])
    
    inline def setResultInfoNull: Self = StObject.set(x, "resultInfo", null)
    
    inline def setResultInfoUndefined: Self = StObject.set(x, "resultInfo", js.undefined)
    
    inline def setStatus(value: NullableOption[CaseOperationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
