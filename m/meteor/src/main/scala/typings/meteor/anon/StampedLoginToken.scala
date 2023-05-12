package typings.meteor.anon

import typings.meteor.Accounts.LoginMethodResult
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StampedLoginToken
  extends StObject
     with LoginMethodResult {
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var options: js.UndefOr[Record[String, Any]] = js.undefined
  
  var stampedLoginToken: js.UndefOr[typings.meteor.Accounts.StampedLoginToken] = js.undefined
  
  var userId: String
}
object StampedLoginToken {
  
  inline def apply(userId: String): StampedLoginToken = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StampedLoginToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StampedLoginToken] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setStampedLoginToken(value: typings.meteor.Accounts.StampedLoginToken): Self = StObject.set(x, "stampedLoginToken", value.asInstanceOf[js.Any])
    
    inline def setStampedLoginTokenUndefined: Self = StObject.set(x, "stampedLoginToken", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
