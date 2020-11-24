package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAlternativeNameServerConfig extends js.Object {
  
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not
    * available when an alternative name server is specified.
    */
  var targetNameServers: js.UndefOr[js.Array[PolicyAlternativeNameServerConfigTargetNameServer]] = js.native
}
object PolicyAlternativeNameServerConfig {
  
  @scala.inline
  def apply(): PolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAlternativeNameServerConfig]
  }
  
  @scala.inline
  implicit class PolicyAlternativeNameServerConfigOps[Self <: PolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTargetNameServersVarargs(value: PolicyAlternativeNameServerConfigTargetNameServer*): Self = this.set("targetNameServers", js.Array(value :_*))
    
    @scala.inline
    def setTargetNameServers(value: js.Array[PolicyAlternativeNameServerConfigTargetNameServer]): Self = this.set("targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNameServers: Self = this.set("targetNameServers", js.undefined)
  }
}
