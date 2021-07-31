package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2HybridInspectStatistics extends StObject {
  
  /** The number of hybrid inspection requests aborted because the job ran out of quota or was ended before they could be processed. */
  var abortedCount: js.UndefOr[String] = js.undefined
  
  /**
    * The number of hybrid requests currently being processed. Only populated when called via method `getDlpJob`. A burst of traffic may cause hybrid inspect requests to be enqueued.
    * Processing will take place as quickly as possible, but resource limitations may impact how long a request is enqueued for.
    */
  var pendingCount: js.UndefOr[String] = js.undefined
  
  /** The number of hybrid inspection requests processed within this job. */
  var processedCount: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2HybridInspectStatistics {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2HybridInspectStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2HybridInspectStatistics]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2HybridInspectStatisticsMutableBuilder[Self <: GooglePrivacyDlpV2HybridInspectStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortedCount(value: String): Self = StObject.set(x, "abortedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortedCountUndefined: Self = StObject.set(x, "abortedCount", js.undefined)
    
    @scala.inline
    def setPendingCount(value: String): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setProcessedCount(value: String): Self = StObject.set(x, "processedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedCountUndefined: Self = StObject.set(x, "processedCount", js.undefined)
  }
}
