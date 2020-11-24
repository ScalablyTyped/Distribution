package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsSettings extends js.Object {
  
  /** An arbitrary DNS provider identified by its name servers. */
  var customDns: js.UndefOr[CustomDns] = js.native
  
  /** The list of glue records for this `Registration`. Commonly empty. */
  var glueRecords: js.UndefOr[js.Array[GlueRecord]] = js.native
  
  /** The free DNS zone provided by [Google Domains](https://domains.google/). */
  var googleDomainsDns: js.UndefOr[GoogleDomainsDns] = js.native
}
object DnsSettings {
  
  @scala.inline
  def apply(): DnsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsSettings]
  }
  
  @scala.inline
  implicit class DnsSettingsOps[Self <: DnsSettings] (val x: Self) extends AnyVal {
    
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
    def setCustomDns(value: CustomDns): Self = this.set("customDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDns: Self = this.set("customDns", js.undefined)
    
    @scala.inline
    def setGlueRecordsVarargs(value: GlueRecord*): Self = this.set("glueRecords", js.Array(value :_*))
    
    @scala.inline
    def setGlueRecords(value: js.Array[GlueRecord]): Self = this.set("glueRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueRecords: Self = this.set("glueRecords", js.undefined)
    
    @scala.inline
    def setGoogleDomainsDns(value: GoogleDomainsDns): Self = this.set("googleDomainsDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleDomainsDns: Self = this.set("googleDomainsDns", js.undefined)
  }
}
