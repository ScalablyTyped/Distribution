package typings.otplibCore

import typings.otplibCore.anon.Secret
import typings.otplibCore.hotpMod.HOTP
import typings.otplibCore.hotpMod.HOTPOptions_
import typings.otplibCore.utilsMod.CreateHmacKey
import typings.otplibCore.utilsMod.HashAlgorithms
import typings.otplibCore.utilsMod.HexString
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object totpMod {
  
  @JSImport("@otplib/core/totp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@otplib/core/totp", "TOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  open class TOTP[T /* <: TOTPOptions_[String] */] () extends HOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
    
    /**
      * Checks if a given TOTP token matches the generated
      * token at the given epoch (default to current time).
      *
      * This method will return true as long as the token is
      * still within the acceptable time window defined.
      *
      * i.e when [[checkDelta]] returns a number.
      */
    def check(token: String, secret: SecretKey): Boolean = js.native
    
    /**
      * Reference: [[totpCheckWithWindow]]
      */
    def checkDelta(token: String, secret: SecretKey): Double | Null = js.native
    
    /**
      * Reference: [[totpToken]]
      */
    def generate(secret: SecretKey): String = js.native
    
    /**
      * Reference: [[totpKeyuri]]
      */
    def keyuri(accountName: String, issuer: String, secret: SecretKey): String = js.native
    
    /**
      * Reference: [[totpTimeRemaining]]
      */
    def timeRemaining(): Double = js.native
    
    /**
      * Reference: [[totpTimeUsed]]
      */
    def timeUsed(): Double = js.native
    
    /**
      * Same as [[check]] but accepts a single object based argument.
      */
    def verify(opts: Secret): Boolean = js.native
  }
  
  inline def totpCheck[T /* <: TOTPOptions_[Any] */](token: String, secret: SecretKey, options: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheck")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def totpCheckByEpoch[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheckByEpoch")(epochs.asInstanceOf[js.Any], token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def totpCheckWithWindow[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCheckWithWindow")(token.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def totpCounter(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpCounter")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@otplib/core/totp", "totpCreateHmacKey")
  @js.native
  val totpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  inline def totpDefaultOptions[T /* <: TOTPOptions_[Any] */](): Partial[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("totpDefaultOptions")().asInstanceOf[Partial[T]]
  
  inline def totpEpochAvailable(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = (^.asInstanceOf[js.Dynamic].applyDynamic("totpEpochAvailable")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[EpochAvailable]
  inline def totpEpochAvailable(epoch: Double, step: Double, win: Double): EpochAvailable = (^.asInstanceOf[js.Dynamic].applyDynamic("totpEpochAvailable")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any], win.asInstanceOf[js.Any])).asInstanceOf[EpochAvailable]
  
  inline def totpKeyuri[T /* <: TOTPOptions_[Any] */](accountName: String, issuer: String, secret: SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpKeyuri")(accountName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def totpOptions[T /* <: TOTPOptions_[Any] */](opt: Partial[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("totpOptions")(opt.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def totpOptionsValidator[T /* <: TOTPOptions_[Any] */](options: Partial[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("totpOptionsValidator")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def totpPadSecret(secret: String, encoding: KeyEncodings, minLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpPadSecret")(secret.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], minLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def totpTimeRemaining(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpTimeRemaining")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def totpTimeUsed(epoch: Double, step: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("totpTimeUsed")(epoch.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def totpToken[T /* <: TOTPOptions_[Any] */](secret: SecretKey, options: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("totpToken")(secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait EpochAvailable extends StObject {
    
    var current: Double
    
    var future: js.Array[Double]
    
    var past: js.Array[Double]
  }
  object EpochAvailable {
    
    inline def apply(current: Double, future: js.Array[Double], past: js.Array[Double]): EpochAvailable = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[EpochAvailable]
    }
    
    extension [Self <: EpochAvailable](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setFuture(value: js.Array[Double]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setFutureVarargs(value: Double*): Self = StObject.set(x, "future", js.Array(value*))
      
      inline def setPast(value: js.Array[Double]): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      inline def setPastVarargs(value: Double*): Self = StObject.set(x, "past", js.Array(value*))
    }
  }
  
  trait TOTPOptions_[T]
    extends StObject
       with HOTPOptions_[T] {
    
    /**
      * The starting time since the JavasSript epoch (seconds) (UNIX epoch * 1000).
      */
    var epoch: Double
    
    /**
      * Time step (seconds).
      */
    var step: Double
    
    /**
      * How many windows (x * step) past and future do we consider as valid during check.
      */
    var window: Double | (js.Tuple2[Double, Double])
  }
  object TOTPOptions_ {
    
    inline def apply[T](
      algorithm: HashAlgorithms,
      createDigest: (/* algorithm */ HashAlgorithms, /* hmacKey */ HexString, /* counter */ HexString) => T,
      createHmacKey: (/* algorithm */ HashAlgorithms, /* secret */ SecretKey, /* encoding */ KeyEncodings) => T,
      digits: Double,
      encoding: KeyEncodings,
      epoch: Double,
      step: Double,
      window: Double | (js.Tuple2[Double, Double])
    ): TOTPOptions_[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], createDigest = js.Any.fromFunction3(createDigest), createHmacKey = js.Any.fromFunction3(createHmacKey), digits = digits.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], epoch = epoch.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[TOTPOptions_[T]]
    }
    
    extension [Self <: TOTPOptions_[?], T](x: Self & TOTPOptions_[T]) {
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setWindow(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
}
