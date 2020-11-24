package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CategoricalStatsResult extends js.Object {
  
  /** Histogram of value frequencies in the column. */
  var valueFrequencyHistogramBuckets: js.UndefOr[js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]] = js.native
}
object GooglePrivacyDlpV2CategoricalStatsResult {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CategoricalStatsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CategoricalStatsResult]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CategoricalStatsResultOps[Self <: GooglePrivacyDlpV2CategoricalStatsResult] (val x: Self) extends AnyVal {
    
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
    def setValueFrequencyHistogramBucketsVarargs(value: GooglePrivacyDlpV2CategoricalStatsHistogramBucket*): Self = this.set("valueFrequencyHistogramBuckets", js.Array(value :_*))
    
    @scala.inline
    def setValueFrequencyHistogramBuckets(value: js.Array[GooglePrivacyDlpV2CategoricalStatsHistogramBucket]): Self = this.set("valueFrequencyHistogramBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueFrequencyHistogramBuckets: Self = this.set("valueFrequencyHistogramBuckets", js.undefined)
  }
}
