package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /** Destination IP address. Not present for sockets that are listening and not connected. */
  var destinationIp: js.UndefOr[String] = js.undefined
  
  /** Destination port. Not present for sockets that are listening and not connected. */
  var destinationPort: js.UndefOr[Double] = js.undefined
  
  /** IANA Internet Protocol Number such as TCP(6) and UDP(17). */
  var protocol: js.UndefOr[String] = js.undefined
  
  /** Source IP address. */
  var sourceIp: js.UndefOr[String] = js.undefined
  
  /** Source port. */
  var sourcePort: js.UndefOr[Double] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
    
    inline def setDestinationIp(value: String): Self = StObject.set(x, "destinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationIpUndefined: Self = StObject.set(x, "destinationIp", js.undefined)
    
    inline def setDestinationPort(value: Double): Self = StObject.set(x, "destinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "destinationPort", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSourceIp(value: String): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
    
    inline def setSourcePort(value: Double): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
  }
}
