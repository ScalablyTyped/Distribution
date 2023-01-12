package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectRightsRequestStageDetail extends StObject {
  
  // Describes the error, if any, for the current stage.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  /**
    * The stage of the subject rights request. Possible values are: contentRetrieval, contentReview, generateReport,
    * contentDeletion, caseResolved, unknownFutureValue.
    */
  var stage: js.UndefOr[NullableOption[SubjectRightsRequestStage]] = js.undefined
  
  // Status of the current stage. Possible values are: notStarted, current, completed, failed, unknownFutureValue.
  var status: js.UndefOr[NullableOption[SubjectRightsRequestStageStatus]] = js.undefined
}
object SubjectRightsRequestStageDetail {
  
  inline def apply(): SubjectRightsRequestStageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectRightsRequestStageDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectRightsRequestStageDetail] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStage(value: NullableOption[SubjectRightsRequestStage]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageNull: Self = StObject.set(x, "stage", null)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStatus(value: NullableOption[SubjectRightsRequestStageStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
