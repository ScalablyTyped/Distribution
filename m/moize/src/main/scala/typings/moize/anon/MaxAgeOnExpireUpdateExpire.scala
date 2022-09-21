package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeOnExpireUpdateExpire[MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */] extends StObject {
  
  var maxAge: MaxAge
  
  var onExpire: ExpireHandler
  
  var updateExpire: UpdateExpire
}
object MaxAgeOnExpireUpdateExpire {
  
  inline def apply[MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */](maxAge: MaxAge, onExpire: ExpireHandler, updateExpire: UpdateExpire): MaxAgeOnExpireUpdateExpire[MaxAge, ExpireHandler, UpdateExpire] = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], onExpire = onExpire.asInstanceOf[js.Any], updateExpire = updateExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeOnExpireUpdateExpire[MaxAge, ExpireHandler, UpdateExpire]]
  }
  
  extension [Self <: MaxAgeOnExpireUpdateExpire[?, ?, ?], MaxAge /* <: Double */, ExpireHandler /* <: typings.moize.mod.OnExpire */, UpdateExpire /* <: Boolean */](x: Self & (MaxAgeOnExpireUpdateExpire[MaxAge, ExpireHandler, UpdateExpire])) {
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setOnExpire(value: ExpireHandler): Self = StObject.set(x, "onExpire", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpire(value: UpdateExpire): Self = StObject.set(x, "updateExpire", value.asInstanceOf[js.Any])
  }
}
