package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsSettings extends StObject {
  
  /** An arbitrary DNS provider identified by its name servers. */
  var customDns: js.UndefOr[CustomDns] = js.undefined
  
  /** The list of glue records for this `Registration`. Commonly empty. */
  var glueRecords: js.UndefOr[js.Array[GlueRecord]] = js.undefined
  
  /** The free DNS zone provided by [Google Domains](https://domains.google/). */
  var googleDomainsDns: js.UndefOr[GoogleDomainsDns] = js.undefined
}
object DnsSettings {
  
  @scala.inline
  def apply(): DnsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsSettings]
  }
  
  @scala.inline
  implicit class DnsSettingsMutableBuilder[Self <: DnsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomDns(value: CustomDns): Self = StObject.set(x, "customDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDnsUndefined: Self = StObject.set(x, "customDns", js.undefined)
    
    @scala.inline
    def setGlueRecords(value: js.Array[GlueRecord]): Self = StObject.set(x, "glueRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueRecordsUndefined: Self = StObject.set(x, "glueRecords", js.undefined)
    
    @scala.inline
    def setGlueRecordsVarargs(value: GlueRecord*): Self = StObject.set(x, "glueRecords", js.Array(value :_*))
    
    @scala.inline
    def setGoogleDomainsDns(value: GoogleDomainsDns): Self = StObject.set(x, "googleDomainsDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleDomainsDnsUndefined: Self = StObject.set(x, "googleDomainsDns", js.undefined)
  }
}
