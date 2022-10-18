package typings.nginstackEngine

import typings.nginstackEngine.anon.Algorithm
import typings.nginstackEngine.anon.DisableDefaultTimestamp
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJoseJwsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/jose/JWS", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JWS
  @JSImport("@nginstack/engine/lib/jose/JWS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(token: String, key: String): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: String, options: VerifyOptions): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: js.typedarray.ArrayBuffer): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: js.typedarray.ArrayBuffer, options: VerifyOptions): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: js.typedarray.Uint8Array): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: js.typedarray.Uint8Array, options: VerifyOptions): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[JWS]
  inline def parse(token: String, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^, options: VerifyOptions): JWS = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JWS]
  
  inline def parseHeader(token: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeader")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def sign(payload: Any, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: String, options: Algorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: js.typedarray.ArrayBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: js.typedarray.ArrayBuffer, options: Algorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: js.typedarray.Uint8Array, options: Algorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sign(payload: Any, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^, options: Algorithm): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(payload.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verify(token: String, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def verify(token: String, key: String, options: VerifyOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def verify(token: String, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def verify(token: String, key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^, options: VerifyOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait JWS extends StObject {
    
    var algorithm: typings.nginstackEngine.libJoseAlgorithmMod.Algorithm = js.native
    
    var audience: String = js.native
    
    var claims: Record[String, String | Double | Boolean] = js.native
    
    var criticalHeaders: js.Array[Any] = js.native
    
    var expiresAt: js.Date = js.native
    
    var headers: Record[String, String | Double | Boolean] = js.native
    
    var issuedAt: js.Date = js.native
    
    var issuer: String = js.native
    
    var jwtId: String = js.native
    
    var keyId: String = js.native
    
    var notBefore: js.Date = js.native
    
    /* private */ var registeredClaims_ : Any = js.native
    
    /* private */ var registeredHeaders_ : Any = js.native
    
    def sign(key: String): String = js.native
    def sign(key: String, options: DisableDefaultTimestamp): String = js.native
    def sign(key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^): String = js.native
    def sign(key: typings.nginstackEngine.libCryptoCryptoPKeyMod.^, options: DisableDefaultTimestamp): String = js.native
    
    var subject: String = js.native
  }
  
  trait VerifyOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String | js.Array[Any]] = js.undefined
    
    var clockTolerance: js.UndefOr[Double] = js.undefined
    
    var criticalHeaders: js.UndefOr[js.Array[Any]] = js.undefined
    
    var currentDate: js.UndefOr[js.Date] = js.undefined
    
    var ignoreExpiresAt: js.UndefOr[Boolean] = js.undefined
    
    var ignoreIssuedAt: js.UndefOr[Boolean] = js.undefined
    
    var ignoreNotBefore: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String | js.Array[Any]] = js.undefined
    
    var subject: js.UndefOr[String | js.Array[Any]] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    extension [Self <: VerifyOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAudience(value: String | js.Array[Any]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAudienceVarargs(value: Any*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
      
      inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
      
      inline def setCriticalHeaders(value: js.Array[Any]): Self = StObject.set(x, "criticalHeaders", value.asInstanceOf[js.Any])
      
      inline def setCriticalHeadersUndefined: Self = StObject.set(x, "criticalHeaders", js.undefined)
      
      inline def setCriticalHeadersVarargs(value: Any*): Self = StObject.set(x, "criticalHeaders", js.Array(value*))
      
      inline def setCurrentDate(value: js.Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setIgnoreExpiresAt(value: Boolean): Self = StObject.set(x, "ignoreExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiresAtUndefined: Self = StObject.set(x, "ignoreExpiresAt", js.undefined)
      
      inline def setIgnoreIssuedAt(value: Boolean): Self = StObject.set(x, "ignoreIssuedAt", value.asInstanceOf[js.Any])
      
      inline def setIgnoreIssuedAtUndefined: Self = StObject.set(x, "ignoreIssuedAt", js.undefined)
      
      inline def setIgnoreNotBefore(value: Boolean): Self = StObject.set(x, "ignoreNotBefore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNotBeforeUndefined: Self = StObject.set(x, "ignoreNotBefore", js.undefined)
      
      inline def setIssuer(value: String | js.Array[Any]): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setIssuerVarargs(value: Any*): Self = StObject.set(x, "issuer", js.Array(value*))
      
      inline def setSubject(value: String | js.Array[Any]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setSubjectVarargs(value: Any*): Self = StObject.set(x, "subject", js.Array(value*))
    }
  }
}
