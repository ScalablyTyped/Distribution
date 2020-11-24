package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CategoricalStatsHistogramBucket extends js.Object {
  
  /** Total number of values in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  
  /** Total number of distinct values in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.native
  
  /** Sample of value frequencies in this bucket. The total number of values returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2ValueFrequency]] = js.native
  
  /** Lower bound on the value frequency of the values in this bucket. */
  var valueFrequencyLowerBound: js.UndefOr[String] = js.native
  
  /** Upper bound on the value frequency of the values in this bucket. */
  var valueFrequencyUpperBound: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2CategoricalStatsHistogramBucket {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CategoricalStatsHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CategoricalStatsHistogramBucketOps[Self <: GooglePrivacyDlpV2CategoricalStatsHistogramBucket] (val x: Self) extends AnyVal {
    
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
    def setBucketSize(value: String): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    
    @scala.inline
    def setBucketValueCount(value: String): Self = this.set("bucketValueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketValueCount: Self = this.set("bucketValueCount", js.undefined)
    
    @scala.inline
    def setBucketValuesVarargs(value: GooglePrivacyDlpV2ValueFrequency*): Self = this.set("bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setBucketValues(value: js.Array[GooglePrivacyDlpV2ValueFrequency]): Self = this.set("bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketValues: Self = this.set("bucketValues", js.undefined)
    
    @scala.inline
    def setValueFrequencyLowerBound(value: String): Self = this.set("valueFrequencyLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFrequencyLowerBound: Self = this.set("valueFrequencyLowerBound", js.undefined)
    
    @scala.inline
    def setValueFrequencyUpperBound(value: String): Self = this.set("valueFrequencyUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFrequencyUpperBound: Self = this.set("valueFrequencyUpperBound", js.undefined)
  }
}
