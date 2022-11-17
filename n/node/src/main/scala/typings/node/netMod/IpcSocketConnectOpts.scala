package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpcSocketConnectOpts
  extends StObject
     with ConnectOpts {
  
  var path: String
}
object IpcSocketConnectOpts {
  
  inline def apply(path: String): IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcSocketConnectOpts]
  }
  
  extension [Self <: IpcSocketConnectOpts](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
