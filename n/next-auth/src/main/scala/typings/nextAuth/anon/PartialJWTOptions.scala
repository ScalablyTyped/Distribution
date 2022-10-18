package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.jwtTypesMod.JWT
import typings.nextAuth.jwtTypesMod.JWTDecodeParams
import typings.nextAuth.jwtTypesMod.JWTEncodeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/jwt.JWTOptions> */
trait PartialJWTOptions extends StObject {
  
  var decode: js.UndefOr[js.Function1[/* params */ JWTDecodeParams, Awaitable[JWT | Null]]] = js.undefined
  
  var encode: js.UndefOr[js.Function1[/* params */ JWTEncodeParams, Awaitable[String]]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var secret: js.UndefOr[String] = js.undefined
}
object PartialJWTOptions {
  
  inline def apply(): PartialJWTOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialJWTOptions]
  }
  
  extension [Self <: PartialJWTOptions](x: Self) {
    
    inline def setDecode(value: /* params */ JWTDecodeParams => Awaitable[JWT | Null]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    
    inline def setEncode(value: /* params */ JWTEncodeParams => Awaitable[String]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
