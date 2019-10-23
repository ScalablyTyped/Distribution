package typings.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TOTP")
@js.native
class TOTP () extends HOTP {
  var TOTP: Instantiable0[typings.otplib.TOTP] = js.native
  @JSName("defaultOptions")
  var defaultOptions_TOTP: TotpOptionsInterface = js.native
  @JSName("optionsAll")
  var optionsAll_TOTP: TotpOptionsInterface = js.native
  @JSName("options")
  var options_TOTP: TotpOptionsInterface = js.native
  def check(token: String, secret: String): Boolean = js.native
  def checkDelta(token: String, secret: String): Double | Null = js.native
  def generate(secret: String): String = js.native
  def timeRemaining(): Double = js.native
  def timeUsed(): Double = js.native
  def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
}

