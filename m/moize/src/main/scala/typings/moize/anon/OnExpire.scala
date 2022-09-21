package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExpire[MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */] extends StObject {
  
  var maxAge: MaxAge
  
  var onExpire: ExpireHandler
}
object OnExpire {
  
  inline def apply[MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */](maxAge: MaxAge, onExpire: ExpireHandler): OnExpire[MaxAge, ExpireHandler] = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], onExpire = onExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnExpire[MaxAge, ExpireHandler]]
  }
  
  extension [Self <: OnExpire[?, ?], MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */](x: Self & (OnExpire[MaxAge, ExpireHandler])) {
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setOnExpire(value: ExpireHandler): Self = StObject.set(x, "onExpire", value.asInstanceOf[js.Any])
  }
}
