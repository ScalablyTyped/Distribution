package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationHistogramResult extends StObject {
  
  /** Histogram result. */
  var result: js.UndefOr[NumericBucketingResult] = js.native
  
  /** Type of the request, corresponding to CompensationHistogramRequest.type. */
  var `type`: js.UndefOr[String] = js.native
}
object CompensationHistogramResult {
  
  @scala.inline
  def apply(): CompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationHistogramResult]
  }
  
  @scala.inline
  implicit class CompensationHistogramResultMutableBuilder[Self <: CompensationHistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: NumericBucketingResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
