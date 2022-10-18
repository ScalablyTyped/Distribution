package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectionGetAddressesAndPortsMod {
  
  inline def apply(key: Double): AddressesAndPorts = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[AddressesAndPorts]
  inline def apply(key: typings.nginstackEngine.libDbkeyDbkeyMod.^): AddressesAndPorts = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[AddressesAndPorts]
  
  @JSImport("@nginstack/engine/lib/connection/getAddressesAndPorts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AddressesAndPorts extends StObject {
    
    var addresses: js.Array[String]
    
    var httpPorts: js.Array[String]
    
    var httpsPorts: js.Array[String]
  }
  object AddressesAndPorts {
    
    inline def apply(addresses: js.Array[String], httpPorts: js.Array[String], httpsPorts: js.Array[String]): AddressesAndPorts = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], httpPorts = httpPorts.asInstanceOf[js.Any], httpsPorts = httpsPorts.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressesAndPorts]
    }
    
    extension [Self <: AddressesAndPorts](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setHttpPorts(value: js.Array[String]): Self = StObject.set(x, "httpPorts", value.asInstanceOf[js.Any])
      
      inline def setHttpPortsVarargs(value: String*): Self = StObject.set(x, "httpPorts", js.Array(value*))
      
      inline def setHttpsPorts(value: js.Array[String]): Self = StObject.set(x, "httpsPorts", value.asInstanceOf[js.Any])
      
      inline def setHttpsPortsVarargs(value: String*): Self = StObject.set(x, "httpsPorts", js.Array(value*))
    }
  }
}
