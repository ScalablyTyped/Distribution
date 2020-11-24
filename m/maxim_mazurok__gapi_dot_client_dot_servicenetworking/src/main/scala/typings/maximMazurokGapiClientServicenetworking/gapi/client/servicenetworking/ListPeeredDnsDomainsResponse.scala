package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPeeredDnsDomainsResponse extends js.Object {
  
  /** The list of peered DNS domains. */
  var peeredDnsDomains: js.UndefOr[js.Array[PeeredDnsDomain]] = js.native
}
object ListPeeredDnsDomainsResponse {
  
  @scala.inline
  def apply(): ListPeeredDnsDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPeeredDnsDomainsResponse]
  }
  
  @scala.inline
  implicit class ListPeeredDnsDomainsResponseOps[Self <: ListPeeredDnsDomainsResponse] (val x: Self) extends AnyVal {
    
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
    def setPeeredDnsDomainsVarargs(value: PeeredDnsDomain*): Self = this.set("peeredDnsDomains", js.Array(value :_*))
    
    @scala.inline
    def setPeeredDnsDomains(value: js.Array[PeeredDnsDomain]): Self = this.set("peeredDnsDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeeredDnsDomains: Self = this.set("peeredDnsDomains", js.undefined)
  }
}
