package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreatePerfSamplesRequest extends StObject {
  
  /** The set of PerfSamples to create should not include existing timestamps */
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.native
}
object BatchCreatePerfSamplesRequest {
  
  @scala.inline
  def apply(): BatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePerfSamplesRequest]
  }
  
  @scala.inline
  implicit class BatchCreatePerfSamplesRequestMutableBuilder[Self <: BatchCreatePerfSamplesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSamples(value: js.Array[PerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    @scala.inline
    def setPerfSamplesVarargs(value: PerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
