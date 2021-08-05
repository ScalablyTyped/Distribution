package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompensationHistogramResult extends StObject {
  
  /** Histogram result. */
  var result: js.UndefOr[NumericBucketingResult] = js.undefined
  
  /** Type of the request, corresponding to CompensationHistogramRequest.type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object CompensationHistogramResult {
  
  inline def apply(): CompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationHistogramResult]
  }
  
  extension [Self <: CompensationHistogramResult](x: Self) {
    
    inline def setResult(value: NumericBucketingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
