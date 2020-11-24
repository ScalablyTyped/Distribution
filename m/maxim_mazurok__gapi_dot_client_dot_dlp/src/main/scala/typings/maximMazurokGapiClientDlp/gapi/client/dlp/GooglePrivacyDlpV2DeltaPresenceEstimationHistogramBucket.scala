package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket extends js.Object {
  
  /** Number of records within these probability bounds. */
  var bucketSize: js.UndefOr[String] = js.native
  
  /** Total number of distinct quasi-identifier tuple values in this bucket. */
  var bucketValueCount: js.UndefOr[String] = js.native
  
  /** Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20. */
  var bucketValues: js.UndefOr[js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]] = js.native
  
  /** Always greater than or equal to min_probability. */
  var maxProbability: js.UndefOr[Double] = js.native
  
  /** Between 0 and 1. */
  var minProbability: js.UndefOr[Double] = js.native
}
object GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketOps[Self <: GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket] (val x: Self) extends AnyVal {
    
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
    def setBucketValuesVarargs(value: GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues*): Self = this.set("bucketValues", js.Array(value :_*))
    
    @scala.inline
    def setBucketValues(value: js.Array[GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]): Self = this.set("bucketValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketValues: Self = this.set("bucketValues", js.undefined)
    
    @scala.inline
    def setMaxProbability(value: Double): Self = this.set("maxProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProbability: Self = this.set("maxProbability", js.undefined)
    
    @scala.inline
    def setMinProbability(value: Double): Self = this.set("minProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProbability: Self = this.set("minProbability", js.undefined)
  }
}
