package typings.portNumbers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("port-numbers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPort(service: String): PortInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPort")(service.asInstanceOf[js.Any]).asInstanceOf[PortInfo | Null]
  inline def getPort(service: String, protocol: String): PortInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPort")(service.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[PortInfo | Null]
  
  inline def getService(port: Double): ServiceInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(port.asInstanceOf[js.Any]).asInstanceOf[ServiceInfo | Null]
  inline def getService(port: Double, protocol: String): ServiceInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getService")(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[ServiceInfo | Null]
  
  trait PortInfo extends StObject {
    
    val description: String
    
    val port: Double
    
    val protocol: String
  }
  object PortInfo {
    
    inline def apply(description: String, port: Double, protocol: String): PortInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortInfo] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceInfo extends StObject {
    
    val description: String
    
    val name: String
  }
  object ServiceInfo {
    
    inline def apply(description: String, name: String): ServiceInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceInfo] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
