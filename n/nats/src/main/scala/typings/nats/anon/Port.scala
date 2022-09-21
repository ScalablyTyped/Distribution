package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  var hostname: String
  
  var port: Double
  
  var tlsName: String
}
object Port {
  
  inline def apply(hostname: String, port: Double, tlsName: String): Port = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], tlsName = tlsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setTlsName(value: String): Self = StObject.set(x, "tlsName", value.asInstanceOf[js.Any])
  }
}
