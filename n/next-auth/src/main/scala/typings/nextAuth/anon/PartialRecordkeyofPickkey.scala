package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<keyof std.Pick<keyof next-auth.next-auth.NextAuthOptions['cookies'], 'sessionToken'>, std.Omit<next-auth.next-auth.CookieOption, 'options'>>> */
trait PartialRecordkeyofPickkey extends StObject {
  
  var sessionToken: js.UndefOr[OmitCookieOptionoptions] = js.undefined
}
object PartialRecordkeyofPickkey {
  
  inline def apply(): PartialRecordkeyofPickkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordkeyofPickkey]
  }
  
  extension [Self <: PartialRecordkeyofPickkey](x: Self) {
    
    inline def setSessionToken(value: OmitCookieOptionoptions): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
