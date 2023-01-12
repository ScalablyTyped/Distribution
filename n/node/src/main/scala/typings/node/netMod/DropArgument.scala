package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropArgument extends StObject {
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var localFamily: js.UndefOr[String] = js.undefined
  
  var localPort: js.UndefOr[Double] = js.undefined
  
  var remoteAddress: js.UndefOr[String] = js.undefined
  
  var remoteFamily: js.UndefOr[String] = js.undefined
  
  var remotePort: js.UndefOr[Double] = js.undefined
}
object DropArgument {
  
  inline def apply(): DropArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropArgument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropArgument] (val x: Self) extends AnyVal {
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setLocalFamily(value: String): Self = StObject.set(x, "localFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalFamilyUndefined: Self = StObject.set(x, "localFamily", js.undefined)
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
    
    inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
    
    inline def setRemoteFamily(value: String): Self = StObject.set(x, "remoteFamily", value.asInstanceOf[js.Any])
    
    inline def setRemoteFamilyUndefined: Self = StObject.set(x, "remoteFamily", js.undefined)
    
    inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    inline def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
  }
}
