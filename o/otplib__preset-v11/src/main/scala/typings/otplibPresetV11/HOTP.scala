package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOTP extends js.Object {
  var HOTP: Instantiable0[typings.otplibPresetV11.HOTP]
  var defaultOptions: HotpOptionsInterface
  var options: HotpOptionsInterface
  var optionsAll: HotpOptionsInterface
  def check(token: String, secret: String, counter: Double): Boolean
  def generate(secret: String, counter: Double): String
  def resetOptions(): this.type
  def verify(opts: HotpVerifyOptionsInterface): Boolean
}

object HOTP {
  @scala.inline
  def apply(
    HOTP: Instantiable0[HOTP],
    check: (String, String, Double) => Boolean,
    defaultOptions: HotpOptionsInterface,
    generate: (String, Double) => String,
    options: HotpOptionsInterface,
    optionsAll: HotpOptionsInterface,
    resetOptions: () => HOTP,
    verify: HotpVerifyOptionsInterface => Boolean
  ): HOTP = {
    val __obj = js.Dynamic.literal(HOTP = HOTP.asInstanceOf[js.Any], check = js.Any.fromFunction3(check), defaultOptions = defaultOptions.asInstanceOf[js.Any], generate = js.Any.fromFunction2(generate), options = options.asInstanceOf[js.Any], optionsAll = optionsAll.asInstanceOf[js.Any], resetOptions = js.Any.fromFunction0(resetOptions), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[HOTP]
  }
}

