package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpcNetConnectOpts
  extends StObject
     with IpcSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object IpcNetConnectOpts {
  
  inline def apply(path: String): IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcNetConnectOpts]
  }
  
  extension [Self <: IpcNetConnectOpts](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
