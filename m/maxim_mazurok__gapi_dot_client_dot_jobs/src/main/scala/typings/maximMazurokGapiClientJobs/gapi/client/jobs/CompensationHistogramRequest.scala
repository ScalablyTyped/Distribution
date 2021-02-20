package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationHistogramRequest extends StObject {
  
  /** Required. Numeric histogram options, like buckets, whether include min or max value. */
  var bucketingOption: js.UndefOr[NumericBucketingOption] = js.native
  
  /**
    * Required. Type of the request, representing which field the histogramming should be performed over. A single request can only specify one histogram of each
    * `CompensationHistogramRequestType`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CompensationHistogramRequest {
  
  @scala.inline
  def apply(): CompensationHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationHistogramRequest]
  }
  
  @scala.inline
  implicit class CompensationHistogramRequestMutableBuilder[Self <: CompensationHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketingOption(value: NumericBucketingOption): Self = StObject.set(x, "bucketingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketingOptionUndefined: Self = StObject.set(x, "bucketingOption", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
