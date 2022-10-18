package typings.nextAuth

import typings.nextAuth.coreTypesMod.Awaitable
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwtTypesMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait DefaultJWT extends StObject {
    
    var email: js.UndefOr[String | Null] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
    
    var picture: js.UndefOr[String | Null] = js.undefined
    
    var sub: js.UndefOr[String] = js.undefined
  }
  object DefaultJWT {
    
    inline def apply(): DefaultJWT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultJWT]
    }
    
    extension [Self <: DefaultJWT](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureNull: Self = StObject.set(x, "picture", null)
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait JWT
    extends StObject
       with DefaultJWT
  object JWT {
    
    inline def apply(): JWT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JWT]
    }
  }
  
  trait JWTDecodeParams extends StObject {
    
    /** The secret used to decode the NextAuth.js issued JWT. */
    var secret: String | Buffer
    
    /** The NextAuth.js issued JWT to be decoded */
    var token: js.UndefOr[String] = js.undefined
  }
  object JWTDecodeParams {
    
    inline def apply(secret: String | Buffer): JWTDecodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTDecodeParams]
    }
    
    extension [Self <: JWTDecodeParams](x: Self) {
      
      inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait JWTEncodeParams extends StObject {
    
    /**
      * The maximum age of the NextAuth.js issued JWT in seconds.
      * @default 30 * 24 * 30 * 60 // 30 days
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /** The secret used to encode the NextAuth.js issued JWT. */
    var secret: String | Buffer
    
    /** The JWT payload. */
    var token: js.UndefOr[JWT] = js.undefined
  }
  object JWTEncodeParams {
    
    inline def apply(secret: String | Buffer): JWTEncodeParams = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTEncodeParams]
    }
    
    extension [Self <: JWTEncodeParams](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSecret(value: String | Buffer): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait JWTOptions extends StObject {
    
    /** Override this method to control the NextAuth.js issued JWT decoding. */
    def decode(params: JWTDecodeParams): Awaitable[JWT | Null]
    
    /** Override this method to control the NextAuth.js issued JWT encoding. */
    def encode(params: JWTEncodeParams): Awaitable[String]
    
    /**
      * The maximum age of the NextAuth.js issued JWT in seconds.
      * @default 30 * 24 * 30 * 60 // 30 days
      */
    var maxAge: Double
    
    /**
      * The secret used to encode/decode the NextAuth.js issued JWT.
      * @deprecated  Set the `NEXTAUTH_SECRET` environment vairable or
      * use the top-level `secret` option instead
      */
    var secret: String
  }
  object JWTOptions {
    
    inline def apply(
      decode: JWTDecodeParams => Awaitable[JWT | Null],
      encode: JWTEncodeParams => Awaitable[String],
      maxAge: Double,
      secret: String
    ): JWTOptions = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), maxAge = maxAge.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[JWTOptions]
    }
    
    extension [Self <: JWTOptions](x: Self) {
      
      inline def setDecode(value: JWTDecodeParams => Awaitable[JWT | Null]): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: JWTEncodeParams => Awaitable[String]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  type Secret = String | Buffer
}
