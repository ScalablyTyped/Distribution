package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreatePerfSamplesResponse extends StObject {
  
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}
object BatchCreatePerfSamplesResponse {
  
  @scala.inline
  def apply(): BatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePerfSamplesResponse]
  }
  
  @scala.inline
  implicit class BatchCreatePerfSamplesResponseMutableBuilder[Self <: BatchCreatePerfSamplesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerfSamples(value: js.Array[PerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    @scala.inline
    def setPerfSamplesVarargs(value: PerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
