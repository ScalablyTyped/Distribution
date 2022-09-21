package typings.otplibCore

import typings.otplibCore.anon.Counter
import typings.otplibCore.utilsMod.CreateDigest
import typings.otplibCore.utilsMod.CreateHmacKey
import typings.otplibCore.utilsMod.HashAlgorithms
import typings.otplibCore.utilsMod.HexString
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.OTP
import typings.otplibCore.utilsMod.OTPOptions
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hotpMod {
  
  @JSImport("@otplib/core/hotp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@otplib/core/hotp", "HOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  open class HOTP[T /* <: HOTPOptions_[String] */] () extends OTP[T] {
    def this(defaultOptions: Partial[T]) = this()
    
    /**
      * Reference: [[hotpCheck]]
      */
    def check(token: String, secret: SecretKey, counter: Double): Boolean = js.native
    
    /**
      * Reference: [[hotpToken]]
      */
    def generate(secret: SecretKey, counter: Double): String = js.native
    
    /**
      * Calls [keyuri](../#keyuri) with class options and type
      * set to HOTP.
      */
    def keyuri(accountName: String, issuer: String, secret: SecretKey, counter: Double): String = js.native
    
    /**
      * Same as [[check]] but accepts a single object based argument.
      */
    def verify(opts: Counter): Boolean = js.native
  }
  
  inline def hotpCheck[T /* <: HOTPOptions_[Any] */](token: String, secret: SecretKey, counter: Double, options: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpCheck")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hotpCounter(counter: Double): HexString = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpCounter")(counter.asInstanceOf[js.Any]).asInstanceOf[HexString]
  
  @JSImport("@otplib/core/hotp", "hotpCreateHmacKey")
  @js.native
  val hotpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  inline def hotpDefaultOptions[T /* <: HOTPOptions_[Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def hotpDigestToToken(hexDigest: HexString, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpDigestToToken")(hexDigest.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hotpKeyuri[T /* <: HOTPOptions_[Any] */](accountName: String, issuer: String, secret: SecretKey, counter: Double, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpKeyuri")(accountName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hotpOptions[T /* <: HOTPOptions_[Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hotpOptionsValidator[T /* <: HOTPOptions_[Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpOptionsValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hotpToken[T /* <: HOTPOptions_[Any] */](secret: SecretKey, counter: Double, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpToken")(secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait HOTPOptions_[T]
    extends StObject
       with OTPOptions {
    
    /**
      * The algorithm used for calculating the HMAC.
      */
    var algorithm: HashAlgorithms
    
    /**
      * Creates the digest which token is derived from.
      */
    def createDigest(algorithm: HashAlgorithms, hmacKey: HexString, counter: HexString): T
    /**
      * Creates the digest which token is derived from.
      */
    @JSName("createDigest")
    var createDigest_Original: CreateDigest[T]
    
    /**
      * Formats the secret into a HMAC key, applying transformations (like padding) where needed
      */
    def createHmacKey(algorithm: HashAlgorithms, secret: SecretKey, encoding: KeyEncodings): T
    /**
      * Formats the secret into a HMAC key, applying transformations (like padding) where needed
      */
    @JSName("createHmacKey")
    var createHmacKey_Original: CreateHmacKey[T]
    
    /**
      * **USE WITH CAUTION:** Given the same digest, the same token will be received.
      *
      * This is provided for unique use cases. For example, digest generation might
      * depend on an async API.
      */
    var digest: js.UndefOr[HexString] = js.undefined
    
    /**
      * The number of digits a token will have. Usually 6 or 8.
      */
    var digits: Double
    
    /**
      * The encoding that was used on the secret.
      */
    var encoding: KeyEncodings
  }
  object HOTPOptions_ {
    
    inline def apply[T](
      algorithm: HashAlgorithms,
      createDigest: (/* algorithm */ HashAlgorithms, /* hmacKey */ HexString, /* counter */ HexString) => T,
      createHmacKey: (/* algorithm */ HashAlgorithms, /* secret */ SecretKey, /* encoding */ KeyEncodings) => T,
      digits: Double,
      encoding: KeyEncodings
    ): HOTPOptions_[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createDigest = js.Any.fromFunction3(createDigest), createHmacKey = js.Any.fromFunction3(createHmacKey), digits = digits.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[HOTPOptions_[T]]
    }
    
    extension [Self <: HOTPOptions_[?], T](x: Self & HOTPOptions_[T]) {
      
      inline def setAlgorithm(value: HashAlgorithms): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCreateDigest(value: (/* algorithm */ HashAlgorithms, /* hmacKey */ HexString, /* counter */ HexString) => T): Self = StObject.set(x, "createDigest", js.Any.fromFunction3(value))
      
      inline def setCreateHmacKey(value: (/* algorithm */ HashAlgorithms, /* secret */ SecretKey, /* encoding */ KeyEncodings) => T): Self = StObject.set(x, "createHmacKey", js.Any.fromFunction3(value))
      
      inline def setDigest(value: HexString): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: KeyEncodings): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
