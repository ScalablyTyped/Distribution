package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExpireUpdateExpire[ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */] extends StObject {
  
  var onExpire: ExpireHandler
  
  var updateExpire: UpdateExpire
}
object OnExpireUpdateExpire {
  
  inline def apply[ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */](onExpire: ExpireHandler, updateExpire: UpdateExpire): OnExpireUpdateExpire[ExpireHandler, UpdateExpire] = {
    val __obj = js.Dynamic.literal(onExpire = onExpire.asInstanceOf[js.Any], updateExpire = updateExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExpireUpdateExpire[ExpireHandler, UpdateExpire]]
  }
  
  extension [Self <: OnExpireUpdateExpire[?, ?], ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */](x: Self & (OnExpireUpdateExpire[ExpireHandler, UpdateExpire])) {
    
    inline def setOnExpire(value: ExpireHandler): Self = StObject.set(x, "onExpire", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpire(value: UpdateExpire): Self = StObject.set(x, "updateExpire", value.asInstanceOf[js.Any])
  }
}
