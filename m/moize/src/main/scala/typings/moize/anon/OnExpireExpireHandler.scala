package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExpireExpireHandler[ExpireHandler /* <: typings.moize.mod.OnExpire */] extends StObject {
  
  var onExpire: ExpireHandler
}
object OnExpireExpireHandler {
  
  inline def apply[ExpireHandler /* <: typings.moize.mod.OnExpire */](onExpire: ExpireHandler): OnExpireExpireHandler[ExpireHandler] = {
    val __obj = js.Dynamic.literal(onExpire = onExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExpireExpireHandler[ExpireHandler]]
  }
  
  extension [Self <: OnExpireExpireHandler[?], ExpireHandler /* <: typings.moize.mod.OnExpire */](x: Self & OnExpireExpireHandler[ExpireHandler]) {
    
    inline def setOnExpire(value: ExpireHandler): Self = StObject.set(x, "onExpire", value.asInstanceOf[js.Any])
  }
}
