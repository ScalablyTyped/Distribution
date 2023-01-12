package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExpireUpdateExpire[UpdateExpire /* <: Boolean */] extends StObject {
  
  var updateExpire: UpdateExpire
}
object UpdateExpireUpdateExpire {
  
  inline def apply[UpdateExpire /* <: Boolean */](updateExpire: UpdateExpire): UpdateExpireUpdateExpire[UpdateExpire] = {
    val __obj = js.Dynamic.literal(updateExpire = updateExpire.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpireUpdateExpire[UpdateExpire]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateExpireUpdateExpire[?], UpdateExpire /* <: Boolean */] (val x: Self & UpdateExpireUpdateExpire[UpdateExpire]) extends AnyVal {
    
    inline def setUpdateExpire(value: UpdateExpire): Self = StObject.set(x, "updateExpire", value.asInstanceOf[js.Any])
  }
}
