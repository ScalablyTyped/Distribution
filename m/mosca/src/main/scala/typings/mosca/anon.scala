package typings.mosca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CertPath extends StObject {
    
    var certPath: String = js.native
    
    var keyPath: String = js.native
    
    var port: Double = js.native
  }
  object CertPath {
    
    @scala.inline
    def apply(certPath: String, keyPath: String, port: Double): CertPath = {
      val __obj = js.Dynamic.literal(certPath = certPath.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertPath]
    }
    
    @scala.inline
    implicit class CertPathMutableBuilder[Self <: CertPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var port: Double = js.native
  }
  object Port {
    
    @scala.inline
    def apply(port: Double): Port = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
