package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Action extends StObject {
  
  /** Create a de-identified copy of the input data. Applicable for non-image data only. The de-identified copy is in the same location as the original data. */
  var deidentify: js.UndefOr[GooglePrivacyDlpV2Deidentify] = js.undefined
  
  /** Enable email notification for project owners and editors on job's completion/failure. */
  var jobNotificationEmails: js.UndefOr[Any] = js.undefined
  
  /** Publish a notification to a pubsub topic. */
  var pubSub: js.UndefOr[GooglePrivacyDlpV2PublishToPubSub] = js.undefined
  
  /** Publish findings to Cloud Datahub. */
  var publishFindingsToCloudDataCatalog: js.UndefOr[Any] = js.undefined
  
  /** Publish summary to Cloud Security Command Center (Alpha). */
  var publishSummaryToCscc: js.UndefOr[Any] = js.undefined
  
  /** Enable Stackdriver metric dlp.googleapis.com/finding_count. */
  var publishToStackdriver: js.UndefOr[Any] = js.undefined
  
  /** Save resulting findings in a provided location. */
  var saveFindings: js.UndefOr[GooglePrivacyDlpV2SaveFindings] = js.undefined
}
object GooglePrivacyDlpV2Action {
  
  inline def apply(): GooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Action] (val x: Self) extends AnyVal {
    
    inline def setDeidentify(value: GooglePrivacyDlpV2Deidentify): Self = StObject.set(x, "deidentify", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyUndefined: Self = StObject.set(x, "deidentify", js.undefined)
    
    inline def setJobNotificationEmails(value: Any): Self = StObject.set(x, "jobNotificationEmails", value.asInstanceOf[js.Any])
    
    inline def setJobNotificationEmailsUndefined: Self = StObject.set(x, "jobNotificationEmails", js.undefined)
    
    inline def setPubSub(value: GooglePrivacyDlpV2PublishToPubSub): Self = StObject.set(x, "pubSub", value.asInstanceOf[js.Any])
    
    inline def setPubSubUndefined: Self = StObject.set(x, "pubSub", js.undefined)
    
    inline def setPublishFindingsToCloudDataCatalog(value: Any): Self = StObject.set(x, "publishFindingsToCloudDataCatalog", value.asInstanceOf[js.Any])
    
    inline def setPublishFindingsToCloudDataCatalogUndefined: Self = StObject.set(x, "publishFindingsToCloudDataCatalog", js.undefined)
    
    inline def setPublishSummaryToCscc(value: Any): Self = StObject.set(x, "publishSummaryToCscc", value.asInstanceOf[js.Any])
    
    inline def setPublishSummaryToCsccUndefined: Self = StObject.set(x, "publishSummaryToCscc", js.undefined)
    
    inline def setPublishToStackdriver(value: Any): Self = StObject.set(x, "publishToStackdriver", value.asInstanceOf[js.Any])
    
    inline def setPublishToStackdriverUndefined: Self = StObject.set(x, "publishToStackdriver", js.undefined)
    
    inline def setSaveFindings(value: GooglePrivacyDlpV2SaveFindings): Self = StObject.set(x, "saveFindings", value.asInstanceOf[js.Any])
    
    inline def setSaveFindingsUndefined: Self = StObject.set(x, "saveFindings", js.undefined)
  }
}
