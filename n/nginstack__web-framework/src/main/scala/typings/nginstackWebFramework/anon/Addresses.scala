package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addresses extends StObject {
  
  var addresses: Any
  
  var ports: Any
}
object Addresses {
  
  inline def apply(addresses: Any, ports: Any): Addresses = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addresses]
  }
  
  extension [Self <: Addresses](x: Self) {
    
    inline def setAddresses(value: Any): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: Any): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
  }
}
