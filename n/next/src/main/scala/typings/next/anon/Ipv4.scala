package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv4 extends StObject {
  
  var ipv4: String
  
  var port: Double
  
  var serviceName: String
}
object Ipv4 {
  
  inline def apply(ipv4: String, port: Double, serviceName: String): Ipv4 = {
    val __obj = js.Dynamic.literal(ipv4 = ipv4.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ipv4]
  }
  
  extension [Self <: Ipv4](x: Self) {
    
    inline def setIpv4(value: String): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
