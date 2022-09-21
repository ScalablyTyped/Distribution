package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectRightsRequestHistory extends StObject {
  
  // Identity of the user who changed the subject rights request.
  var changedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Data and time when the entity was changed.
  var eventDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The stage when the entity was changed. Possible values are: contentRetrieval, contentReview, generateReport,
    * contentDeletion, caseResolved, unknownFutureValue.
    */
  var stage: js.UndefOr[NullableOption[SubjectRightsRequestStage]] = js.undefined
  
  /**
    * The status of the stage when the entity was changed. Possible values are: notStarted, current, completed, failed,
    * unknownFutureValue.
    */
  var stageStatus: js.UndefOr[NullableOption[SubjectRightsRequestStageStatus]] = js.undefined
  
  // Type of history.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object SubjectRightsRequestHistory {
  
  inline def apply(): SubjectRightsRequestHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectRightsRequestHistory]
  }
  
  extension [Self <: SubjectRightsRequestHistory](x: Self) {
    
    inline def setChangedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedByNull: Self = StObject.set(x, "changedBy", null)
    
    inline def setChangedByUndefined: Self = StObject.set(x, "changedBy", js.undefined)
    
    inline def setEventDateTime(value: NullableOption[String]): Self = StObject.set(x, "eventDateTime", value.asInstanceOf[js.Any])
    
    inline def setEventDateTimeNull: Self = StObject.set(x, "eventDateTime", null)
    
    inline def setEventDateTimeUndefined: Self = StObject.set(x, "eventDateTime", js.undefined)
    
    inline def setStage(value: NullableOption[SubjectRightsRequestStage]): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageNull: Self = StObject.set(x, "stage", null)
    
    inline def setStageStatus(value: NullableOption[SubjectRightsRequestStageStatus]): Self = StObject.set(x, "stageStatus", value.asInstanceOf[js.Any])
    
    inline def setStageStatusNull: Self = StObject.set(x, "stageStatus", null)
    
    inline def setStageStatusUndefined: Self = StObject.set(x, "stageStatus", js.undefined)
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
