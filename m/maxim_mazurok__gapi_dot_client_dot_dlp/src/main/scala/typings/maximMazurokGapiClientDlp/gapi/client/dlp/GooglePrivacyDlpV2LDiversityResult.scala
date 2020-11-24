package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2LDiversityResult extends js.Object {
  
  /** Histogram of l-diversity equivalence class sensitive value frequencies. */
  var sensitiveValueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2LDiversityResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LDiversityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LDiversityResultOps[Self <: GooglePrivacyDlpV2LDiversityResult] (val x: Self) extends AnyVal {
    
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
    def setSensitiveValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2LDiversityHistogramBucket*): Self = this.set("sensitiveValueFrequencyHistogramBuckets", js.Array(value :_*))
    
    @scala.inline
    def setSensitiveValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2LDiversityHistogramBucket]): Self = this.set("sensitiveValueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveValueFrequencyHistogramBuckets: Self = this.set("sensitiveValueFrequencyHistogramBuckets", js.undefined)
  }
}
