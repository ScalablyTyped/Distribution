package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Finding extends js.Object {
  
  /** Timestamp when finding was detected. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The unique finding id. */
  var findingId: js.UndefOr[String] = js.native
  
  /** The type of content that might have been found. Provided if `excluded_types` is false. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
  
  /** Time the job started that produced this finding. */
  var jobCreateTime: js.UndefOr[String] = js.native
  
  /** The job that stored the finding. */
  var jobName: js.UndefOr[String] = js.native
  
  /**
    * The labels associated with this `Finding`. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`.
    * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a
    * given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2Finding with TopLevel[js.Any]
  ] = js.native
  
  /** Confidence of how likely it is that the `info_type` is correct. */
  var likelihood: js.UndefOr[String] = js.native
  
  /** Where the content was found. */
  var location: js.UndefOr[GooglePrivacyDlpV2Location] = js.native
  
  /** Resource name in format projects/{project}/locations/{location}/findings/{finding} Populated only when viewing persisted findings. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The content that was found. Even if the content is not textual, it may be converted to a textual representation here. Provided if `include_quote` is true and the finding is less
    * than or equal to 4096 bytes long. If the finding exceeds 4096 bytes in length, the quote may be omitted.
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * Contains data parsed from quotes. Only populated if include_quote was set to true and a supported infoType was requested. Currently supported infoTypes: DATE, DATE_OF_BIRTH and
    * TIME.
    */
  var quoteInfo: js.UndefOr[GooglePrivacyDlpV2QuoteInfo] = js.native
  
  /** The job that stored the finding. */
  var resourceName: js.UndefOr[String] = js.native
  
  /** Job trigger name, if applicable, for this finding. */
  var triggerName: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2Finding {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Finding]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FindingOps[Self <: GooglePrivacyDlpV2Finding] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFindingId(value: String): Self = this.set("findingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingId: Self = this.set("findingId", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    
    @scala.inline
    def setJobCreateTime(value: String): Self = this.set("jobCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobCreateTime: Self = this.set("jobCreateTime", js.undefined)
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.GooglePrivacyDlpV2Finding with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLikelihood(value: String): Self = this.set("likelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLikelihood: Self = this.set("likelihood", js.undefined)
    
    @scala.inline
    def setLocation(value: GooglePrivacyDlpV2Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteInfo(value: GooglePrivacyDlpV2QuoteInfo): Self = this.set("quoteInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteInfo: Self = this.set("quoteInfo", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setTriggerName(value: String): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerName: Self = this.set("triggerName", js.undefined)
  }
}
