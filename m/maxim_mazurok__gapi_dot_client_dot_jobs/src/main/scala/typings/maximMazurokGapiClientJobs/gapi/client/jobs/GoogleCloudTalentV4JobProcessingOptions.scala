package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4JobProcessingOptions extends js.Object {
  
  /** If set to `true`, the service does not attempt to resolve a more precise address for the job. */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  
  /**
    * Option for job HTML content sanitization. Applied fields are: * description * applicationInfo.instruction * incentives * qualifications * responsibilities HTML tags in these fields
    * may be stripped if sanitiazation isn't disabled. Defaults to HtmlSanitization.SIMPLE_FORMATTING_ONLY.
    */
  var htmlSanitization: js.UndefOr[String] = js.native
}
object GoogleCloudTalentV4JobProcessingOptions {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4JobProcessingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4JobProcessingOptions]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4JobProcessingOptionsOps[Self <: GoogleCloudTalentV4JobProcessingOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableStreetAddressResolution(value: Boolean): Self = this.set("disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStreetAddressResolution: Self = this.set("disableStreetAddressResolution", js.undefined)
    
    @scala.inline
    def setHtmlSanitization(value: String): Self = this.set("htmlSanitization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlSanitization: Self = this.set("htmlSanitization", js.undefined)
  }
}
