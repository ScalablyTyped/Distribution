package typings.node.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.nodeColonnetMod.Socket
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Req[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */] extends StObject {
  
  var req: InstanceType[Request]
}
object Req {
  
  inline def apply[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */](req: InstanceType[Request]): Req[Request] = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req[Request]]
  }
  
  extension [Self <: Req[?], Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */](x: Self & Req[Request]) {
    
    inline def setReq(value: InstanceType[Request]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
