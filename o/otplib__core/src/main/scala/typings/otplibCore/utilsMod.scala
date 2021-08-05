package typings.otplibCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@otplib/core/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@otplib/core/utils", "HASH_ALGORITHMS")
  @js.native
  val HASH_ALGORITHMS: js.Array[String] = js.native
  
  @js.native
  sealed trait HashAlgorithms extends StObject
  @JSImport("@otplib/core/utils", "HashAlgorithms")
  @js.native
  object HashAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HashAlgorithms & String] = js.native
    
    @js.native
    sealed trait SHA1
      extends StObject
         with HashAlgorithms
    /* "sha1" */ val SHA1: typings.otplibCore.utilsMod.HashAlgorithms.SHA1 & String = js.native
    
    @js.native
    sealed trait SHA256
      extends StObject
         with HashAlgorithms
    /* "sha256" */ val SHA256: typings.otplibCore.utilsMod.HashAlgorithms.SHA256 & String = js.native
    
    @js.native
    sealed trait SHA512
      extends StObject
         with HashAlgorithms
    /* "sha512" */ val SHA512: typings.otplibCore.utilsMod.HashAlgorithms.SHA512 & String = js.native
  }
  
  @JSImport("@otplib/core/utils", "KEY_ENCODINGS")
  @js.native
  val KEY_ENCODINGS: js.Array[String] = js.native
  
  @js.native
  sealed trait KeyEncodings extends StObject
  @JSImport("@otplib/core/utils", "KeyEncodings")
  @js.native
  object KeyEncodings extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[KeyEncodings & String] = js.native
    
    @js.native
    sealed trait ASCII
      extends StObject
         with KeyEncodings
    /* "ascii" */ val ASCII: typings.otplibCore.utilsMod.KeyEncodings.ASCII & String = js.native
    
    @js.native
    sealed trait BASE64
      extends StObject
         with KeyEncodings
    /* "base64" */ val BASE64: typings.otplibCore.utilsMod.KeyEncodings.BASE64 & String = js.native
    
    @js.native
    sealed trait HEX
      extends StObject
         with KeyEncodings
    /* "hex" */ val HEX: typings.otplibCore.utilsMod.KeyEncodings.HEX & String = js.native
    
    @js.native
    sealed trait LATIN1
      extends StObject
         with KeyEncodings
    /* "latin1" */ val LATIN1: typings.otplibCore.utilsMod.KeyEncodings.LATIN1 & String = js.native
    
    @js.native
    sealed trait UTF8
      extends StObject
         with KeyEncodings
    /* "utf8" */ val UTF8: typings.otplibCore.utilsMod.KeyEncodings.UTF8 & String = js.native
  }
  
  @JSImport("@otplib/core/utils", "OTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class OTP[T /* <: OTPOptions */] () extends StObject {
    def this(defaultOptions: Partial[T]) = this()
    
    /**
      * Default options for an instance.
      *
      * These options **WILL PERSIST** even when [[resetOptions]] is called.
      */
    /* protected */ var _defaultOptions: Partial[T] = js.native
    
    /**
      * Transient options for an instance.
      *
      * Values set here will take precedence over the same options that
      * are set in [[_defaultOptions]].
      *
      * These options **WILL NOT PERSIST** upon calling [[resetOptions]].
      */
    /* protected */ var _options: Partial[T] = js.native
    
    /**
      * Returns class options polyfilled with some of
      * the missing required options.
      *
      * Reference: [[hotpOptions]]
      */
    def allOptions(): T = js.native
    
    def clone(defaultOptions: Partial[T]): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: this['create'] */ js.Any
      ] = js.native
    
    /**
      * Creates a new instance with all defaultOptions and options reset.
      */
    def create(): OTP[T] = js.native
    def create(defaultOptions: Partial[T]): OTP[T] = js.native
    
    /**
      * - The options **getter** will return all [[_options]],
      * including those set into [[_defaultOptions]].
      */
    def options: Partial[T] = js.native
    /**
      * - The options **setter** sets values into [[_options]].
      */
    def options_=(options: Partial[T]): Unit = js.native
    
    /**
      * Resets the current options. Does not reset default options.
      *
      * Default options are those that are specified during class
      * inititialisation, when calling [[clone]] or when calling [[create]]
      */
    def resetOptions(): Unit = js.native
  }
  
  @JSImport("@otplib/core/utils", "STRATEGY")
  @js.native
  val STRATEGY_ : js.Array[String] = js.native
  
  @js.native
  sealed trait Strategy extends StObject
  @JSImport("@otplib/core/utils", "Strategy")
  @js.native
  object Strategy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Strategy & String] = js.native
    
    @js.native
    sealed trait HOTP
      extends StObject
         with Strategy
    /* "hotp" */ val HOTP: typings.otplibCore.utilsMod.Strategy.HOTP & String = js.native
    
    @js.native
    sealed trait TOTP
      extends StObject
         with Strategy
    /* "totp" */ val TOTP: typings.otplibCore.utilsMod.Strategy.TOTP & String = js.native
  }
  
  @JSImport("@otplib/core/utils", "createDigestPlaceholder")
  @js.native
  val createDigestPlaceholder: CreateDigest[HexString] = js.native
  
  inline def isTokenValid(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenValid")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keyuri(options: KeyURIOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyuri")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def objectValues[T](value: T): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectValues")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def padStart(value: String, maxLength: Double, fillString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(value.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fillString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type CreateDigest[T] = js.Function3[/* algorithm */ HashAlgorithms, /* hmacKey */ HexString, /* counter */ HexString, T]
  
  type CreateHmacKey[T] = js.Function3[/* algorithm */ HashAlgorithms, /* secret */ SecretKey, /* encoding */ KeyEncodings, T]
  
  type HexString = String
  
  trait KeyURIOptions extends StObject {
    
    var accountName: String
    
    var algorithm: js.UndefOr[HashAlgorithms] = js.undefined
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var secret: SecretKey
    
    var step: js.UndefOr[Double] = js.undefined
    
    var `type`: Strategy
  }
  object KeyURIOptions {
    
    inline def apply(accountName: String, secret: SecretKey, `type`: Strategy): KeyURIOptions = {
      val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyURIOptions]
    }
    
    extension [Self <: KeyURIOptions](x: Self) {
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAlgorithm(value: HashAlgorithms): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSecret(value: SecretKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setType(value: Strategy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type OTPOptions = StringDictionary[js.Any]
  
  type SecretKey = String
}
