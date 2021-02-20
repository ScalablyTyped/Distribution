package typings.portNumbers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("port-numbers", "getPort")
  @js.native
  def getPort(service: String): PortInfo | Null = js.native
  @JSImport("port-numbers", "getPort")
  @js.native
  def getPort(service: String, protocol: String): PortInfo | Null = js.native
  
  @JSImport("port-numbers", "getService")
  @js.native
  def getService(port: Double): ServiceInfo | Null = js.native
  @JSImport("port-numbers", "getService")
  @js.native
  def getService(port: Double, protocol: String): ServiceInfo | Null = js.native
  
  @js.native
  trait PortInfo extends StObject {
    
    val description: String = js.native
    
    val port: Double = js.native
    
    val protocol: String = js.native
  }
  object PortInfo {
    
    @scala.inline
    def apply(description: String, port: Double, protocol: String): PortInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortInfo]
    }
    
    @scala.inline
    implicit class PortInfoMutableBuilder[Self <: PortInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServiceInfo extends StObject {
    
    val description: String = js.native
    
    val name: String = js.native
  }
  object ServiceInfo {
    
    @scala.inline
    def apply(description: String, name: String): ServiceInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceInfo]
    }
    
    @scala.inline
    implicit class ServiceInfoMutableBuilder[Self <: ServiceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
