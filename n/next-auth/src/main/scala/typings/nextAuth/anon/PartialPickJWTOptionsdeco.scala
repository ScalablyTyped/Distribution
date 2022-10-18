package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.jwtTypesMod.JWT
import typings.nextAuth.jwtTypesMod.JWTDecodeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<next-auth.next-auth/jwt.JWTOptions, 'decode'>> */
trait PartialPickJWTOptionsdeco extends StObject {
  
  var decode: js.UndefOr[js.Function1[/* params */ JWTDecodeParams, Awaitable[JWT | Null]]] = js.undefined
}
object PartialPickJWTOptionsdeco {
  
  inline def apply(): PartialPickJWTOptionsdeco = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickJWTOptionsdeco]
  }
  
  extension [Self <: PartialPickJWTOptionsdeco](x: Self) {
    
    inline def setDecode(value: /* params */ JWTDecodeParams => Awaitable[JWT | Null]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
  }
}
