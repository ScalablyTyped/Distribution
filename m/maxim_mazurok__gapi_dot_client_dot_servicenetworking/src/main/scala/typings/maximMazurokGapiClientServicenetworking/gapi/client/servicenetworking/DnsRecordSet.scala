package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DnsRecordSet extends js.Object {
  
  /** Required. As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) for examples see https://cloud.google.com/dns/records/json-record. */
  var data: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. The DNS or domain name of the record set, e.g. `test.example.com`. */
  var domain: js.UndefOr[String] = js.native
  
  /** Required. The period of time for which this RecordSet can be cached by resolvers. */
  var ttl: js.UndefOr[String] = js.native
  
  /** Required. The identifier of a supported record type. */
  var `type`: js.UndefOr[String] = js.native
}
object DnsRecordSet {
  
  @scala.inline
  def apply(): DnsRecordSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsRecordSet]
  }
  
  @scala.inline
  implicit class DnsRecordSetOps[Self <: DnsRecordSet] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: String*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
