package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Action extends StObject {
  
  /** Enable email notification for project owners and editors on job's completion/failure. */
  var jobNotificationEmails: js.UndefOr[js.Any] = js.undefined
  
  /** Publish a notification to a pubsub topic. */
  var pubSub: js.UndefOr[GooglePrivacyDlpV2PublishToPubSub] = js.undefined
  
  /** Publish findings to Cloud Datahub. */
  var publishFindingsToCloudDataCatalog: js.UndefOr[js.Any] = js.undefined
  
  /** Publish summary to Cloud Security Command Center (Alpha). */
  var publishSummaryToCscc: js.UndefOr[js.Any] = js.undefined
  
  /** Enable Stackdriver metric dlp.googleapis.com/finding_count. */
  var publishToStackdriver: js.UndefOr[js.Any] = js.undefined
  
  /** Save resulting findings in a provided location. */
  var saveFindings: js.UndefOr[GooglePrivacyDlpV2SaveFindings] = js.undefined
}
object GooglePrivacyDlpV2Action {
  
  inline def apply(): GooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Action]
  }
  
  extension [Self <: GooglePrivacyDlpV2Action](x: Self) {
    
    inline def setJobNotificationEmails(value: js.Any): Self = StObject.set(x, "jobNotificationEmails", value.asInstanceOf[js.Any])
    
    inline def setJobNotificationEmailsUndefined: Self = StObject.set(x, "jobNotificationEmails", js.undefined)
    
    inline def setPubSub(value: GooglePrivacyDlpV2PublishToPubSub): Self = StObject.set(x, "pubSub", value.asInstanceOf[js.Any])
    
    inline def setPubSubUndefined: Self = StObject.set(x, "pubSub", js.undefined)
    
    inline def setPublishFindingsToCloudDataCatalog(value: js.Any): Self = StObject.set(x, "publishFindingsToCloudDataCatalog", value.asInstanceOf[js.Any])
    
    inline def setPublishFindingsToCloudDataCatalogUndefined: Self = StObject.set(x, "publishFindingsToCloudDataCatalog", js.undefined)
    
    inline def setPublishSummaryToCscc(value: js.Any): Self = StObject.set(x, "publishSummaryToCscc", value.asInstanceOf[js.Any])
    
    inline def setPublishSummaryToCsccUndefined: Self = StObject.set(x, "publishSummaryToCscc", js.undefined)
    
    inline def setPublishToStackdriver(value: js.Any): Self = StObject.set(x, "publishToStackdriver", value.asInstanceOf[js.Any])
    
    inline def setPublishToStackdriverUndefined: Self = StObject.set(x, "publishToStackdriver", js.undefined)
    
    inline def setSaveFindings(value: GooglePrivacyDlpV2SaveFindings): Self = StObject.set(x, "saveFindings", value.asInstanceOf[js.Any])
    
    inline def setSaveFindingsUndefined: Self = StObject.set(x, "saveFindings", js.undefined)
  }
}
