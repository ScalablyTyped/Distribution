package typings.otplib

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HOTP")
@js.native
class HOTP () extends js.Object {
  var HOTP: Instantiable0[typings.otplib.HOTP] = js.native
  var defaultOptions: HotpOptionsInterface = js.native
  var options: HotpOptionsInterface = js.native
  var optionsAll: HotpOptionsInterface = js.native
  def check(token: String, secret: String, counter: Double): Boolean = js.native
  def generate(secret: String, counter: Double): String = js.native
  def resetOptions(): this.type = js.native
  def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
}

