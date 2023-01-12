package typings.maximMazurokGapiClientDns.gapi.client.dns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyAlternativeNameServerConfig extends StObject {
  
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not
    * available when an alternative name server is specified.
    */
  var targetNameServers: js.UndefOr[js.Array[PolicyAlternativeNameServerConfigTargetNameServer]] = js.undefined
}
object PolicyAlternativeNameServerConfig {
  
  inline def apply(): PolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAlternativeNameServerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNameServers(value: js.Array[PolicyAlternativeNameServerConfigTargetNameServer]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    inline def setTargetNameServersVarargs(value: PolicyAlternativeNameServerConfigTargetNameServer*): Self = StObject.set(x, "targetNameServers", js.Array(value*))
  }
}
