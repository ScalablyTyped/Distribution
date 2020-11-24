package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2HybridInspectStatistics extends js.Object {
  
  /** The number of hybrid inspection requests aborted because the job ran out of quota or was ended before they could be processed. */
  var abortedCount: js.UndefOr[String] = js.native
  
  /**
    * The number of hybrid requests currently being processed. Only populated when called via method `getDlpJob`. A burst of traffic may cause hybrid inspect requests to be enqueued.
    * Processing will take place as quickly as possible, but resource limitations may impact how long a request is enqueued for.
    */
  var pendingCount: js.UndefOr[String] = js.native
  
  /** The number of hybrid inspection requests processed within this job. */
  var processedCount: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2HybridInspectStatistics {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridInspectStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridInspectStatistics]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridInspectStatisticsOps[Self <: GooglePrivacyDlpV2HybridInspectStatistics] (val x: Self) extends AnyVal {
    
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
    def setAbortedCount(value: String): Self = this.set("abortedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortedCount: Self = this.set("abortedCount", js.undefined)
    
    @scala.inline
    def setPendingCount(value: String): Self = this.set("pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingCount: Self = this.set("pendingCount", js.undefined)
    
    @scala.inline
    def setProcessedCount(value: String): Self = this.set("processedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessedCount: Self = this.set("processedCount", js.undefined)
  }
}
