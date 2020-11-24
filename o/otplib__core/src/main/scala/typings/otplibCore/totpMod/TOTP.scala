package typings.otplibCore.totpMod

import typings.otplibCore.anon.Secret
import typings.otplibCore.hotpMod.HOTP
import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/totp", "TOTP")
@js.native
class TOTP[T /* <: TOTPOptions_[String] */] () extends HOTP[T] {
  
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
