package typings.maximMazurokGapiClientDomains.gapi.client.domains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomDns extends js.Object {
  
  /** The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled. */
  var dsRecords: js.UndefOr[js.Array[DsRecord]] = js.native
  
  /** Required. A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format. */
  var nameServers: js.UndefOr[js.Array[String]] = js.native
}
object CustomDns {
  
  @scala.inline
  def apply(): CustomDns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomDns]
  }
  
  @scala.inline
  implicit class CustomDnsOps[Self <: CustomDns] (val x: Self) extends AnyVal {
    
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
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameServers: Self = this.set("nameServers", js.undefined)
  }
}
