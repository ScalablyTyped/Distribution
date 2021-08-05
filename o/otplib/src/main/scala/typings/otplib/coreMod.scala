package typings.otplib

import typings.otplib.otplibStrings.createRandomBytes
import typings.otplib.otplibStrings.encoding
import typings.otplib.otplibStrings.keyDecoder
import typings.otplib.otplibStrings.keyEncoder
import typings.otplibCore.authenticatorMod.AuthenticatorOptions_
import typings.otplibCore.authenticatorMod.Base32SecretKey
import typings.otplibCore.hotpMod.HOTPOptions_
import typings.otplibCore.totpMod.EpochAvailable
import typings.otplibCore.totpMod.TOTPOptions_
import typings.otplibCore.utilsMod.CreateDigest
import typings.otplibCore.utilsMod.CreateHmacKey
import typings.otplibCore.utilsMod.HexString
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.KeyURIOptions
import typings.otplibCore.utilsMod.OTPOptions
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("otplib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("otplib/core", "Authenticator")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class Authenticator[T /* <: AuthenticatorOptions_[String] */] ()
    extends typings.otplibCore.mod.Authenticator[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "HASH_ALGORITHMS")
  @js.native
  val HASH_ALGORITHMS: js.Array[String] = js.native
  
  @JSImport("otplib/core", "HOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class HOTP[T /* <: HOTPOptions_[String] */] ()
    extends typings.otplibCore.mod.HOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "HashAlgorithms")
  @js.native
  object HashAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.otplibCore.utilsMod.HashAlgorithms & String] = js.native
    
    /* "sha1" */ val SHA1: typings.otplibCore.utilsMod.HashAlgorithms.SHA1 & String = js.native
    
    /* "sha256" */ val SHA256: typings.otplibCore.utilsMod.HashAlgorithms.SHA256 & String = js.native
    
    /* "sha512" */ val SHA512: typings.otplibCore.utilsMod.HashAlgorithms.SHA512 & String = js.native
  }
  
  @JSImport("otplib/core", "KEY_ENCODINGS")
  @js.native
  val KEY_ENCODINGS: js.Array[String] = js.native
  
  @JSImport("otplib/core", "KeyEncodings")
  @js.native
  object KeyEncodings extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.otplibCore.utilsMod.KeyEncodings & String] = js.native
    
    /* "ascii" */ val ASCII: typings.otplibCore.utilsMod.KeyEncodings.ASCII & String = js.native
    
    /* "base64" */ val BASE64: typings.otplibCore.utilsMod.KeyEncodings.BASE64 & String = js.native
    
    /* "hex" */ val HEX: typings.otplibCore.utilsMod.KeyEncodings.HEX & String = js.native
    
    /* "latin1" */ val LATIN1: typings.otplibCore.utilsMod.KeyEncodings.LATIN1 & String = js.native
    
    /* "utf8" */ val UTF8: typings.otplibCore.utilsMod.KeyEncodings.UTF8 & String = js.native
  }
  
  @JSImport("otplib/core", "OTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class OTP[T /* <: OTPOptions */] ()
    extends typings.otplibCore.mod.OTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  @JSImport("otplib/core", "STRATEGY")
  @js.native
  val STRATEGY_ : js.Array[String] = js.native
  
  @JSImport("otplib/core", "Strategy")
  @js.native
  object Strategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.otplibCore.utilsMod.Strategy & String] = js.native
    
    /* "hotp" */ val HOTP: typings.otplibCore.utilsMod.Strategy.HOTP & String = js.native
    
    /* "totp" */ val TOTP: typings.otplibCore.utilsMod.Strategy.TOTP & String = js.native
  }
  
  @JSImport("otplib/core", "TOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class TOTP[T /* <: TOTPOptions_[String] */] ()
    extends typings.otplibCore.mod.TOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
  }
  
  inline def authenticatorCheckWithWindow[T /* <: AuthenticatorOptions_[String] */](token: String, secret: Base32SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorCheckWithWindow")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def authenticatorDecoder[T /* <: AuthenticatorOptions_[js.Any] */](secret: Base32SecretKey, options: Pick[T, keyDecoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorDecoder")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ]]
  
  inline def authenticatorDefaultOptions[T /* <: AuthenticatorOptions_[js.Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def authenticatorEncoder[T /* <: AuthenticatorOptions_[js.Any] */](secret: SecretKey, options: Pick[T, keyEncoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorEncoder")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ]]
  
  inline def authenticatorGenerateSecret[T /* <: AuthenticatorOptions_[String] */](numberOfBytes: Double, options: Pick[T, keyEncoder | encoding | createRandomBytes]): Base32SecretKey = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorGenerateSecret")(numberOfBytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Base32SecretKey]
  
  inline def authenticatorOptionValidator[T /* <: AuthenticatorOptions_[js.Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorOptionValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def authenticatorOptions[T /* <: AuthenticatorOptions_[js.Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def authenticatorToken[T /* <: AuthenticatorOptions_[String] */](secret: Base32SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticatorToken")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("otplib/core", "createDigestPlaceholder")
  @js.native
  val createDigestPlaceholder: CreateDigest[HexString] = js.native
  
  inline def hotpCheck[T /* <: HOTPOptions_[js.Any] */](token: String, secret: SecretKey, counter: Double, options: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpCheck")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hotpCounter(counter: Double): HexString = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpCounter")(counter.asInstanceOf[js.Any]).asInstanceOf[HexString]
  
  @JSImport("otplib/core", "hotpCreateHmacKey")
  @js.native
  val hotpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  inline def hotpDefaultOptions[T /* <: HOTPOptions_[js.Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def hotpDigestToToken(hexDigest: HexString, digits: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpDigestToToken")(hexDigest.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hotpKeyuri[T /* <: HOTPOptions_[js.Any] */](accountName: String, issuer: String, secret: SecretKey, counter: Double, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpKeyuri")(accountName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hotpOptions[T /* <: HOTPOptions_[js.Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hotpOptionsValidator[T /* <: HOTPOptions_[js.Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hotpOptionsValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hotpToken[T /* <: HOTPOptions_[js.Any] */](secret: SecretKey, counter: Double, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hotpToken")(secret.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isTokenValid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keyuri(options: KeyURIOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyuri")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def objectValues[T](value: T): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectValues")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def padStart(value: String, maxLength: Double, fillString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fillString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def totpCheck[T /* <: TOTPOptions_[js.Any] */](token: String, secret: SecretKey, options: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheck")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def totpCheckByEpoch[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheckByEpoch")(epochs.asInstanceOf[js.Any], token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def totpCheckWithWindow[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheckWithWindow")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def totpCounter(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCounter")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("otplib/core", "totpCreateHmacKey")
  @js.native
  val totpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  inline def totpDefaultOptions[T /* <: TOTPOptions_[js.Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("totpDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def totpEpochAvailable(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = (^.asInstanceOf[js.Dynamic].applyDynamic("totpEpochAvailable")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[EpochAvailable]
  inline def totpEpochAvailable(epoch: Double, step: Double, win: Double): EpochAvailable = (^.asInstanceOf[js.Dynamic].applyDynamic("totpEpochAvailable")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[EpochAvailable]
  
  inline def totpKeyuri[T /* <: TOTPOptions_[js.Any] */](accountName: String, issuer: String, secret: SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpKeyuri")(accountName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def totpOptions[T /* <: TOTPOptions_[js.Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("totpOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def totpOptionsValidator[T /* <: TOTPOptions_[js.Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("totpOptionsValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def totpPadSecret(secret: String, encoding: KeyEncodings, minLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpPadSecret")(secret.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def totpTimeRemaining(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpTimeRemaining")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def totpTimeUsed(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpTimeUsed")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def totpToken[T /* <: TOTPOptions_[js.Any] */](secret: SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpToken")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
