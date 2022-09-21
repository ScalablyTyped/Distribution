package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatAssessmentResult
  extends StObject
     with Entity {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The result message for each threat assessment.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The threat assessment result type. Possible values are: checkPolicy, rescan.
  var resultType: js.UndefOr[NullableOption[ThreatAssessmentResultType]] = js.undefined
}
object ThreatAssessmentResult {
  
  inline def apply(): ThreatAssessmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatAssessmentResult]
  }
  
  extension [Self <: ThreatAssessmentResult](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setResultType(value: NullableOption[ThreatAssessmentResultType]): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    inline def setResultTypeNull: Self = StObject.set(x, "resultType", null)
    
    inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
  }
}
