package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Action extends js.Object {
  
  /** Enable email notification for project owners and editors on job's completion/failure. */
  var jobNotificationEmails: js.UndefOr[js.Any] = js.native
  
  /** Publish a notification to a pubsub topic. */
  var pubSub: js.UndefOr[GooglePrivacyDlpV2PublishToPubSub] = js.native
  
  /** Publish findings to Cloud Datahub. */
  var publishFindingsToCloudDataCatalog: js.UndefOr[js.Any] = js.native
  
  /** Publish summary to Cloud Security Command Center (Alpha). */
  var publishSummaryToCscc: js.UndefOr[js.Any] = js.native
  
  /** Enable Stackdriver metric dlp.googleapis.com/finding_count. */
  var publishToStackdriver: js.UndefOr[js.Any] = js.native
  
  /** Save resulting findings in a provided location. */
  var saveFindings: js.UndefOr[GooglePrivacyDlpV2SaveFindings] = js.native
}
object GooglePrivacyDlpV2Action {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Action]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ActionOps[Self <: GooglePrivacyDlpV2Action] (val x: Self) extends AnyVal {
    
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
    def setJobNotificationEmails(value: js.Any): Self = this.set("jobNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobNotificationEmails: Self = this.set("jobNotificationEmails", js.undefined)
    
    @scala.inline
    def setPubSub(value: GooglePrivacyDlpV2PublishToPubSub): Self = this.set("pubSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubSub: Self = this.set("pubSub", js.undefined)
    
    @scala.inline
    def setPublishFindingsToCloudDataCatalog(value: js.Any): Self = this.set("publishFindingsToCloudDataCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishFindingsToCloudDataCatalog: Self = this.set("publishFindingsToCloudDataCatalog", js.undefined)
    
    @scala.inline
    def setPublishSummaryToCscc(value: js.Any): Self = this.set("publishSummaryToCscc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishSummaryToCscc: Self = this.set("publishSummaryToCscc", js.undefined)
    
    @scala.inline
    def setPublishToStackdriver(value: js.Any): Self = this.set("publishToStackdriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishToStackdriver: Self = this.set("publishToStackdriver", js.undefined)
    
    @scala.inline
    def setSaveFindings(value: GooglePrivacyDlpV2SaveFindings): Self = this.set("saveFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveFindings: Self = this.set("saveFindings", js.undefined)
  }
}
