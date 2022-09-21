package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreatePerfSamplesRequest extends StObject {
  
  /** The set of PerfSamples to create should not include existing timestamps */
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}
object BatchCreatePerfSamplesRequest {
  
  inline def apply(): BatchCreatePerfSamplesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePerfSamplesRequest]
  }
  
  extension [Self <: BatchCreatePerfSamplesRequest](x: Self) {
    
    inline def setPerfSamples(value: js.Array[PerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    inline def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    inline def setPerfSamplesVarargs(value: PerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value*))
  }
}
