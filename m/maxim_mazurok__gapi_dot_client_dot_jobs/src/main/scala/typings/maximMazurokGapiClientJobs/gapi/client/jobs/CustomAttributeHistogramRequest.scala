package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomAttributeHistogramRequest extends js.Object {
  
  /**
    * Required. Specifies the custom field key to perform a histogram on. If specified without `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is
    * triggered, otherwise histogram is performed on long values.
    */
  var key: js.UndefOr[String] = js.native
  
  /** Optional. Specifies buckets used to perform a range histogram on Job's filterable long custom field values, or min/max value requirements. */
  var longValueHistogramBucketingOption: js.UndefOr[NumericBucketingOption] = js.native
  
  /** Optional. If set to true, the response includes the histogram value for each key as a string. */
  var stringValueHistogram: js.UndefOr[Boolean] = js.native
}
object CustomAttributeHistogramRequest {
  
  @scala.inline
  def apply(): CustomAttributeHistogramRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeHistogramRequest]
  }
  
  @scala.inline
  implicit class CustomAttributeHistogramRequestOps[Self <: CustomAttributeHistogramRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLongValueHistogramBucketingOption(value: NumericBucketingOption): Self = this.set("longValueHistogramBucketingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongValueHistogramBucketingOption: Self = this.set("longValueHistogramBucketingOption", js.undefined)
    
    @scala.inline
    def setStringValueHistogram(value: Boolean): Self = this.set("stringValueHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValueHistogram: Self = this.set("stringValueHistogram", js.undefined)
  }
}
