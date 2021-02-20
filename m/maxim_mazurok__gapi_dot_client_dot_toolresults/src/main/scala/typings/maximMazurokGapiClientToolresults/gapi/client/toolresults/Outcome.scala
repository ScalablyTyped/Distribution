package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Outcome extends StObject {
  
  /** More information about a FAILURE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not FAILURE. Optional */
  var failureDetail: js.UndefOr[FailureDetail] = js.native
  
  /** More information about an INCONCLUSIVE outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not INCONCLUSIVE. Optional */
  var inconclusiveDetail: js.UndefOr[InconclusiveDetail] = js.native
  
  /** More information about a SKIPPED outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SKIPPED. Optional */
  var skippedDetail: js.UndefOr[SkippedDetail] = js.native
  
  /** More information about a SUCCESS outcome. Returns INVALID_ARGUMENT if this field is set but the summary is not SUCCESS. Optional */
  var successDetail: js.UndefOr[SuccessDetail] = js.native
  
  /** The simplest way to interpret a result. Required */
  var summary: js.UndefOr[String] = js.native
}
object Outcome {
  
  @scala.inline
  def apply(): Outcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Outcome]
  }
  
  @scala.inline
  implicit class OutcomeMutableBuilder[Self <: Outcome] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureDetail(value: FailureDetail): Self = StObject.set(x, "failureDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailUndefined: Self = StObject.set(x, "failureDetail", js.undefined)
    
    @scala.inline
    def setInconclusiveDetail(value: InconclusiveDetail): Self = StObject.set(x, "inconclusiveDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInconclusiveDetailUndefined: Self = StObject.set(x, "inconclusiveDetail", js.undefined)
    
    @scala.inline
    def setSkippedDetail(value: SkippedDetail): Self = StObject.set(x, "skippedDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippedDetailUndefined: Self = StObject.set(x, "skippedDetail", js.undefined)
    
    @scala.inline
    def setSuccessDetail(value: SuccessDetail): Self = StObject.set(x, "successDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessDetailUndefined: Self = StObject.set(x, "successDetail", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
