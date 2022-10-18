package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/adapters.AdapterSession> & std.Pick<next-auth.next-auth/adapters.AdapterSession, 'sessionToken'> */
trait PartialAdapterSessionPick extends StObject {
  
  var expires: js.UndefOr[js.Date] = js.undefined
  
  var sessionToken: js.UndefOr[String] & String
  
  var userId: js.UndefOr[String] = js.undefined
}
object PartialAdapterSessionPick {
  
  inline def apply(sessionToken: js.UndefOr[String] & String): PartialAdapterSessionPick = {
    val __obj = js.Dynamic.literal(sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAdapterSessionPick]
  }
  
  extension [Self <: PartialAdapterSessionPick](x: Self) {
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setSessionToken(value: js.UndefOr[String] & String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
