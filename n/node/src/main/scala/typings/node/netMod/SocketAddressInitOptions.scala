package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketAddressInitOptions extends StObject {
  
  /**
    * The network address as either an IPv4 or IPv6 string.
    * @default 127.0.0.1
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * @default `'ipv4'`
    */
  var family: js.UndefOr[IPVersion] = js.undefined
  
  /**
    * An IPv6 flow-label used only if `family` is `'ipv6'`.
    * @default 0
    */
  var flowlabel: js.UndefOr[Double] = js.undefined
  
  /**
    * An IP port.
    * @default 0
    */
  var port: js.UndefOr[Double] = js.undefined
}
object SocketAddressInitOptions {
  
  inline def apply(): SocketAddressInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketAddressInitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocketAddressInitOptions] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setFamily(value: IPVersion): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFlowlabel(value: Double): Self = StObject.set(x, "flowlabel", value.asInstanceOf[js.Any])
    
    inline def setFlowlabelUndefined: Self = StObject.set(x, "flowlabel", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
