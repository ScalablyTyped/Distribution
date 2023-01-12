package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outcome extends StObject {
  
  /** More information about a FAILURE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE. Optional */
  var failureDetail: js.UndefOr[FailureDetail] = js.undefined
  
  /** More information about an INCONCLUSIVE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE. Optional */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.undefined
  
  /** More information about a SKIPPED outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED. Optional */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.undefined
  
  /** More information about a SUCCESS outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS. Optional */
  var successDetail: js.UndefOr[SuccessDetail] = js.undefined
  
  /** The simplest way to interpret a result. Required */
  var summary: js.UndefOr[String] = js.undefined
}
object Outcome {
  
  inline def apply(): Outcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outcome] (val x: Self) extends AnyVal {
    
    inline def setFailureDetail(value: FailureDetail): Self = StObject.set(x, "failureDetail", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailUndefined: Self = StObject.set(x, "failureDetail", js.undefined)
    
    inline def setInconclusiveDetail(value: InconclusiveDetail): Self = StObject.set(x, "inconclusiveDetail", value.asInstanceOf[js.Any])
    
    inline def setInconclusiveDetailUndefined: Self = StObject.set(x, "inconclusiveDetail", js.undefined)
    
    inline def setSkippedDetail(value: SkippedDetail): Self = StObject.set(x, "skippedDetail", value.asInstanceOf[js.Any])
    
    inline def setSkippedDetailUndefined: Self = StObject.set(x, "skippedDetail", js.undefined)
    
    inline def setSuccessDetail(value: SuccessDetail): Self = StObject.set(x, "successDetail", value.asInstanceOf[js.Any])
    
    inline def setSuccessDetailUndefined: Self = StObject.set(x, "successDetail", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
