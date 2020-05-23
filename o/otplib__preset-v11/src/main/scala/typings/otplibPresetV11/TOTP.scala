package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TOTP extends HOTP {
  var TOTP: Instantiable0[typings.otplibPresetV11.TOTP]
  @JSName("defaultOptions")
  var defaultOptions_TOTP: TotpOptionsInterface
  @JSName("optionsAll")
  var optionsAll_TOTP: TotpOptionsInterface
  @JSName("options")
  var options_TOTP: TotpOptionsInterface
  def check(token: String, secret: String): Boolean
  def checkDelta(token: String, secret: String): Double | Null
  def generate(secret: String): String
  def timeRemaining(): Double
  def timeUsed(): Double
  def verify(opts: TotpVerifyOptionsInterface): Boolean
}

object TOTP {
  @scala.inline
  def apply(
    HOTP: Instantiable0[HOTP],
    TOTP: Instantiable0[TOTP],
    check: (String, String) => Boolean,
    checkDelta: (String, String) => Double | Null,
    defaultOptions: TotpOptionsInterface,
    generate: String => String,
    options: TotpOptionsInterface,
    optionsAll: TotpOptionsInterface,
    resetOptions: () => TOTP,
    timeRemaining: () => Double,
    timeUsed: () => Double,
    verify: TotpVerifyOptionsInterface => Boolean
  ): TOTP = {
    val __obj = js.Dynamic.literal(HOTP = HOTP.asInstanceOf[js.Any], TOTP = TOTP.asInstanceOf[js.Any], check = js.Any.fromFunction2(check), checkDelta = js.Any.fromFunction2(checkDelta), defaultOptions = defaultOptions.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), options = options.asInstanceOf[js.Any], optionsAll = optionsAll.asInstanceOf[js.Any], resetOptions = js.Any.fromFunction0(resetOptions), timeRemaining = js.Any.fromFunction0(timeRemaining), timeUsed = js.Any.fromFunction0(timeUsed), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[TOTP]
  }
}

