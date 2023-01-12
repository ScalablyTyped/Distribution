package typings.otplibCore

import typings.otplibCore.otplibCoreStrings.createRandomBytes
import typings.otplibCore.otplibCoreStrings.encoding
import typings.otplibCore.otplibCoreStrings.keyDecoder
import typings.otplibCore.otplibCoreStrings.keyEncoder
import typings.otplibCore.totpMod.TOTP
import typings.otplibCore.totpMod.TOTPOptions_
import typings.otplibCore.utilsMod.HashAlgorithms
import typings.otplibCore.utilsMod.HexString
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticatorMod {
  
  @JSImport("@otplib/core/authenticator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@otplib/core/authenticator", "Authenticator")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  open class Authenticator[T /* <: AuthenticatorOptions_[String] */] () extends TOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
    
    /**
      * Reference: [[authenticatorDecoder]]
      */
    def decode(secret: Base32SecretKey): SecretKey = js.native
    
    /**
      * Reference: [[authenticatorEncoder]]
      */
    def encode(secret: SecretKey): Base32SecretKey = js.native
    
    /**
      * Reference: [[authenticatorGenerateSecret]]
      */
    def generateSecret(): Base32SecretKey = js.native
    def generateSecret(numberOfBytes: Double): Base32SecretKey = js.native
  }
  
  inline def authenticatorCheckWithWindow[T /* <: AuthenticatorOptions_[String] */](token: String, secret: Base32SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorCheckWithWindow")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def authenticatorDecoder[T /* <: AuthenticatorOptions_[Any] */](secret: Base32SecretKey, options: Pick[T, keyDecoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorDecoder")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ]]
  
  inline def authenticatorDefaultOptions[T /* <: AuthenticatorOptions_[Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def authenticatorEncoder[T /* <: AuthenticatorOptions_[Any] */](secret: SecretKey, options: Pick[T, keyEncoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorEncoder")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ]]
  
  inline def authenticatorGenerateSecret[T /* <: AuthenticatorOptions_[String] */](numberOfBytes: Double, options: Pick[T, keyEncoder | encoding | createRandomBytes]): Base32SecretKey = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorGenerateSecret")(numberOfBytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Base32SecretKey]
  
  inline def authenticatorOptionValidator[T /* <: AuthenticatorOptions_[Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorOptionValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def authenticatorOptions[T /* <: AuthenticatorOptions_[Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def authenticatorToken[T /* <: AuthenticatorOptions_[String] */](secret: Base32SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorToken")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait AuthenticatorOptions_[T]
    extends StObject
       with TOTPOptions_[T] {
    
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    def createRandomBytes(size: Double, encoding: KeyEncodings): T
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    @JSName("createRandomBytes")
    var createRandomBytes_Original: CreateRandomBytes[T]
    
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    def keyDecoder(encodedSecret: Base32SecretKey, encoding: KeyEncodings): T
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    @JSName("keyDecoder")
    var keyDecoder_Original: KeyDecoder[T]
    
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    def keyEncoder(secret: SecretKey, encoding: KeyEncodings): T
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    @JSName("keyEncoder")
    var keyEncoder_Original: KeyEncoder[T]
  }
  object AuthenticatorOptions_ {
    
    inline def apply[T](
      algorithm: HashAlgorithms,
      createDigest: (/* algorithm */ HashAlgorithms, /* hmacKey */ HexString, /* counter */ HexString) => T,
      createHmacKey: (/* algorithm */ HashAlgorithms, /* secret */ SecretKey, /* encoding */ KeyEncodings) => T,
      createRandomBytes: (/* size */ Double, /* encoding */ KeyEncodings) => T,
      digits: Double,
      encoding: KeyEncodings,
      epoch: Double,
      keyDecoder: (/* encodedSecret */ Base32SecretKey, /* encoding */ KeyEncodings) => T,
      keyEncoder: (/* secret */ SecretKey, /* encoding */ KeyEncodings) => T,
      step: Double,
      window: Double | (js.Tuple2[Double, Double])
    ): AuthenticatorOptions_[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createDigest = js.Any.fromFunction3(createDigest), createHmacKey = js.Any.fromFunction3(createHmacKey), createRandomBytes = js.Any.fromFunction2(createRandomBytes), digits = digits.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], keyDecoder = js.Any.fromFunction2(keyDecoder), keyEncoder = js.Any.fromFunction2(keyEncoder), step = step.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticatorOptions_[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticatorOptions_[?], T] (val x: Self & AuthenticatorOptions_[T]) extends AnyVal {
      
      inline def setCreateRandomBytes(value: (/* size */ Double, /* encoding */ KeyEncodings) => T): Self = StObject.set(x, "createRandomBytes", js.Any.fromFunction2(value))
      
      inline def setKeyDecoder(value: (/* encodedSecret */ Base32SecretKey, /* encoding */ KeyEncodings) => T): Self = StObject.set(x, "keyDecoder", js.Any.fromFunction2(value))
      
      inline def setKeyEncoder(value: (/* secret */ SecretKey, /* encoding */ KeyEncodings) => T): Self = StObject.set(x, "keyEncoder", js.Any.fromFunction2(value))
    }
  }
  
  type Base32SecretKey = SecretKey
  
  type CreateRandomBytes[T] = js.Function2[/* size */ Double, /* encoding */ KeyEncodings, T]
  
  type KeyDecoder[T] = js.Function2[/* encodedSecret */ Base32SecretKey, /* encoding */ KeyEncodings, T]
  
  type KeyEncoder[T] = js.Function2[/* secret */ SecretKey, /* encoding */ KeyEncodings, T]
}
