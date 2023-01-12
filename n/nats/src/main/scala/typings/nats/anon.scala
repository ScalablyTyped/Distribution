package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hostname extends StObject {
    
    var hostname: String
    
    var port: Double
    
    var tlsName: String
  }
  object Hostname {
    
    inline def apply(hostname: String, port: Double, tlsName: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], tlsName = tlsName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTlsName(value: String): Self = StObject.set(x, "tlsName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Port extends StObject {
    
    var hostname: String
    
    var port: Double
  }
  object Port {
    
    inline def apply(hostname: String, port: Double): Port = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
