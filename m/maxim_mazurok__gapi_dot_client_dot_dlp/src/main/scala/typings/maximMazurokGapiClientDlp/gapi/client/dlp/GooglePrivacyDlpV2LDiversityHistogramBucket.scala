package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LDiversityHistogramBucket extends js.Object {
  
  /** Total number of equivalence classes in this bucket. */
  var bucketSize: js.UndefOr[String] = js.native
  
  /** Total number of distinct equivalence classes in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.native
  
  /** Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2LDiversityEquivalenceClass]] = js.native
  
  /** Lower bound on the sensitive value frequencies of the equivalence classes in this bucket. */
  var sensitiveValueFrequencyLowerBound: js.UndefOr[String] = js.native
  
  /** Upper bound on the sensitive value frequencies of the equivalence classes in this bucket. */
  var sensitiveValueFrequencyUpperBound: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2LDiversityHistogramBucket {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LDiversityHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityHistogramBucket]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LDiversityHistogramBucketOps[Self <: GooglePrivacyDlpV2LDiversityHistogramBucket] (val x: Self) extends AnyVal {
    
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
    def setBucketValuesVarargs(value: GooglePrivacyDlpV2LDiversityEquivalenceClass*): Self = this.set("bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setBucketValues(value: js.Array[GooglePrivacyDlpV2LDiversityEquivalenceClass]): Self = this.set("bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketValues: Self = this.set("bucketValues", js.undefined)
    
    @scala.inline
    def setSensitiveValueFrequencyLowerBound(value: String): Self = this.set("sensitiveValueFrequencyLowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveValueFrequencyLowerBound: Self = this.set("sensitiveValueFrequencyLowerBound", js.undefined)
    
    @scala.inline
    def setSensitiveValueFrequencyUpperBound(value: String): Self = this.set("sensitiveValueFrequencyUpperBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveValueFrequencyUpperBound: Self = this.set("sensitiveValueFrequencyUpperBound", js.undefined)
  }
}
