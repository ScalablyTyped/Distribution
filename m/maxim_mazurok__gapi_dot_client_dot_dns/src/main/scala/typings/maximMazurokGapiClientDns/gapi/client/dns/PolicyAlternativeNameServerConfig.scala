package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAlternativeNameServerConfig extends StObject {
  
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
  implicit class PolicyAlternativeNameServerConfigMutableBuilder[Self <: PolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTargetNameServers(value: js.Array[PolicyAlternativeNameServerConfigTargetNameServer]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    @scala.inline
    def setTargetNameServersVarargs(value: PolicyAlternativeNameServerConfigTargetNameServer*): Self = StObject.set(x, "targetNameServers", js.Array(value :_*))
  }
}
