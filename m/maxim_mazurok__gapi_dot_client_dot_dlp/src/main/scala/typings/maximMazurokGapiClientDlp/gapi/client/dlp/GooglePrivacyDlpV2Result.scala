package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Result extends js.Object {
  
  /**
    * Statistics related to the processing of hybrid inspect. Early access feature is in a pre-release state and might change or have limited support. For more information, see
    * https://cloud.google.com/products#product-launch-stages.
    */
  var hybridStats: js.UndefOr[GooglePrivacyDlpV2HybridInspectStatistics] = js.native
  
  /** Statistics of how many instances of each info type were found during inspect job. */
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeStats]] = js.native
  
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.native
  
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Result {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Result]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ResultOps[Self <: GooglePrivacyDlpV2Result] (val x: Self) extends AnyVal {
    
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
    def setHybridStats(value: GooglePrivacyDlpV2HybridInspectStatistics): Self = this.set("hybridStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHybridStats: Self = this.set("hybridStats", js.undefined)
    
    @scala.inline
    def setInfoTypeStatsVarargs(value: GooglePrivacyDlpV2InfoTypeStats*): Self = this.set("infoTypeStats", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypeStats(value: js.Array[GooglePrivacyDlpV2InfoTypeStats]): Self = this.set("infoTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypeStats: Self = this.set("infoTypeStats", js.undefined)
    
    @scala.inline
    def setProcessedBytes(value: String): Self = this.set("processedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessedBytes: Self = this.set("processedBytes", js.undefined)
    
    @scala.inline
    def setTotalEstimatedBytes(value: String): Self = this.set("totalEstimatedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalEstimatedBytes: Self = this.set("totalEstimatedBytes", js.undefined)
  }
}
