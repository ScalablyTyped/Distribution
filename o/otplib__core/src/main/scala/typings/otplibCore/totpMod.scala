package typings.otplibCore

import typings.otplibCore.anon.Secret
import typings.otplibCore.hotpMod.HOTP
import typings.otplibCore.hotpMod.HOTPOptions_
import typings.otplibCore.utilsMod.CreateHmacKey
import typings.otplibCore.utilsMod.HexString
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object totpMod {
  
  @JSImport("@otplib/core/totp", "TOTP")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class TOTP[T /* <: TOTPOptions_[String] */] () extends HOTP[T] {
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
  
  @JSImport("@otplib/core/totp", "totpCheck")
  @js.native
  def totpCheck[T /* <: TOTPOptions_[_] */](token: String, secret: SecretKey, options: T): Boolean = js.native
  
  @JSImport("@otplib/core/totp", "totpCheckByEpoch")
  @js.native
  def totpCheckByEpoch[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  @JSImport("@otplib/core/totp", "totpCheckWithWindow")
  @js.native
  def totpCheckWithWindow[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = js.native
  
  @JSImport("@otplib/core/totp", "totpCounter")
  @js.native
  def totpCounter(epoch: Double, step: Double): Double = js.native
  
  @JSImport("@otplib/core/totp", "totpCreateHmacKey")
  @js.native
  val totpCreateHmacKey: CreateHmacKey[HexString] = js.native
  
  @JSImport("@otplib/core/totp", "totpDefaultOptions")
  @js.native
  def totpDefaultOptions[T /* <: TOTPOptions_[_] */](): Partial[T] = js.native
  
  @JSImport("@otplib/core/totp", "totpEpochAvailable")
  @js.native
  def totpEpochAvailable(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = js.native
  @JSImport("@otplib/core/totp", "totpEpochAvailable")
  @js.native
  def totpEpochAvailable(epoch: Double, step: Double, win: Double): EpochAvailable = js.native
  
  @JSImport("@otplib/core/totp", "totpKeyuri")
  @js.native
  def totpKeyuri[T /* <: TOTPOptions_[_] */](accountName: String, issuer: String, secret: SecretKey, options: T): String = js.native
  
  @JSImport("@otplib/core/totp", "totpOptions")
  @js.native
  def totpOptions[T /* <: TOTPOptions_[_] */](opt: Partial[T]): T = js.native
  
  @JSImport("@otplib/core/totp", "totpOptionsValidator")
  @js.native
  def totpOptionsValidator[T /* <: TOTPOptions_[_] */](options: Partial[T]): Unit = js.native
  
  @JSImport("@otplib/core/totp", "totpPadSecret")
  @js.native
  def totpPadSecret(secret: String, encoding: KeyEncodings, minLength: Double): String = js.native
  
  @JSImport("@otplib/core/totp", "totpTimeRemaining")
  @js.native
  def totpTimeRemaining(epoch: Double, step: Double): Double = js.native
  
  @JSImport("@otplib/core/totp", "totpTimeUsed")
  @js.native
  def totpTimeUsed(epoch: Double, step: Double): Double = js.native
  
  @JSImport("@otplib/core/totp", "totpToken")
  @js.native
  def totpToken[T /* <: TOTPOptions_[_] */](secret: SecretKey, options: T): String = js.native
  
  @js.native
  trait EpochAvailable extends StObject {
    
    var current: Double = js.native
    
    var future: js.Array[Double] = js.native
    
    var past: js.Array[Double] = js.native
  }
  object EpochAvailable {
    
    @scala.inline
    def apply(current: Double, future: js.Array[Double], past: js.Array[Double]): EpochAvailable = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[EpochAvailable]
    }
    
    @scala.inline
    implicit class EpochAvailableMutableBuilder[Self <: EpochAvailable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuture(value: js.Array[Double]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureVarargs(value: Double*): Self = StObject.set(x, "future", js.Array(value :_*))
      
      @scala.inline
      def setPast(value: js.Array[Double]): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastVarargs(value: Double*): Self = StObject.set(x, "past", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TOTPOptions_[T] extends HOTPOptions_[T] {
    
    /**
      * The starting time since the JavasSript epoch (seconds) (UNIX epoch * 1000).
      */
    var epoch: Double = js.native
    
    /**
      * Time step (seconds).
      */
    var step: Double = js.native
    
    /**
      * How many windows (x * step) past and future do we consider as valid during check.
      */
    var window: Double | (js.Tuple2[Double, Double]) = js.native
  }
}
