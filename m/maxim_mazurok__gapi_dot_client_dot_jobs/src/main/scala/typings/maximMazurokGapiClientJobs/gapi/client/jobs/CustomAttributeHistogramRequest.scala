package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAttributeHistogramRequest extends StObject {
  
  /**
    * Required. Specifies the custom field key to perform a histogram on. If specified without `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is
    * triggered, otherwise histogram is performed on long values.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /** Optional. Specifies buckets used to perform a range histogram on Job's filterable long custom field values, or min/max value requirements. */
  var longValueHistogramBucketingOption: js.UndefOr[NumericBucketingOption] = js.undefined
  
  /** Optional. If set to true, the response includes the histogram value for each key as a string. */
  var stringValueHistogram: js.UndefOr[Boolean] = js.undefined
}
object CustomAttributeHistogramRequest {
  
  @scala.inline
  def apply(): CustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeHistogramRequest]
  }
  
  @scala.inline
  implicit class CustomAttributeHistogramRequestMutableBuilder[Self <: CustomAttributeHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramBucketingOption(value: NumericBucketingOption): Self = StObject.set(x, "longValueHistogramBucketingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongValueHistogramBucketingOptionUndefined: Self = StObject.set(x, "longValueHistogramBucketingOption", js.undefined)
    
    @scala.inline
    def setStringValueHistogram(value: Boolean): Self = StObject.set(x, "stringValueHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueHistogramUndefined: Self = StObject.set(x, "stringValueHistogram", js.undefined)
  }
}
