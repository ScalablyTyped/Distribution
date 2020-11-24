package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDomainsDns extends js.Object {
  
  /** Output only. The list of DS records published for this domain. The list is automatically populated when `ds_state` is `DS_RECORDS_PUBLISHED`, otherwise it remains empty. */
  var dsRecords: js.UndefOr[js.Array[DsRecord]] = js.native
  
  /** Required. The state of DS records for this domain. Used to enable or disable automatic DNSSEC. */
  var dsState: js.UndefOr[String] = js.native
  
  /**
    * Output only. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. This field is
    * automatically populated with the name servers assigned to the Google Domains DNS zone.
    */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
}
object GoogleDomainsDns {
  
  @scala.inline
  def apply(): GoogleDomainsDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDomainsDns]
  }
  
  @scala.inline
  implicit class GoogleDomainsDnsOps[Self <: GoogleDomainsDns] (val x: Self) extends AnyVal {
    
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
    def setDsRecordsVarargs(value: DsRecord*): Self = this.set("dsRecords", js.Array(value :_*))
    
    @scala.inline
    def setDsRecords(value: js.Array[DsRecord]): Self = this.set("dsRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsRecords: Self = this.set("dsRecords", js.undefined)
    
    @scala.inline
    def setDsState(value: String): Self = this.set("dsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDsState: Self = this.set("dsState", js.undefined)
    
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
  }
}
