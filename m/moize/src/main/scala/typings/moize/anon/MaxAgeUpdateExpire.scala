package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAgeUpdateExpire[MaxAge /* <: Double */, UpdateExpire /* <: Boolean */] extends StObject {
  
  var maxAge: MaxAge
  
  var updateExpire: UpdateExpire
}
object MaxAgeUpdateExpire {
  
  inline def apply[MaxAge /* <: Double */, UpdateExpire /* <: Boolean */](maxAge: MaxAge, updateExpire: UpdateExpire): MaxAgeUpdateExpire[MaxAge, UpdateExpire] = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], updateExpire = updateExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAgeUpdateExpire[MaxAge, UpdateExpire]]
  }
  
  extension [Self <: MaxAgeUpdateExpire[?, ?], MaxAge /* <: Double */, UpdateExpire /* <: Boolean */](x: Self & (MaxAgeUpdateExpire[MaxAge, UpdateExpire])) {
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpire(value: UpdateExpire): Self = StObject.set(x, "updateExpire", value.asInstanceOf[js.Any])
  }
}
