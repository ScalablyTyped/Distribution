package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HOTP extends js.Object {
  var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
  var defaultOptions: HotpOptionsInterface = js.native
  var options: HotpOptionsInterface = js.native
  var optionsAll: HotpOptionsInterface = js.native
  def check(token: String, secret: String, counter: Double): Boolean = js.native
  def generate(secret: String, counter: Double): String = js.native
  def resetOptions(): this.type = js.native
  def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
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
  @scala.inline
  implicit class HOTPOps[Self <: HOTP] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHOTP(value: Instantiable0[HOTP]): Self = this.set("HOTP", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheck(value: (String, String, Double) => Boolean): Self = this.set("check", js.Any.fromFunction3(value))
    @scala.inline
    def setDefaultOptions(value: HotpOptionsInterface): Self = this.set("defaultOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerate(value: (String, Double) => String): Self = this.set("generate", js.Any.fromFunction2(value))
    @scala.inline
    def setOptions(value: HotpOptionsInterface): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsAll(value: HotpOptionsInterface): Self = this.set("optionsAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetOptions(value: () => HOTP): Self = this.set("resetOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setVerify(value: HotpVerifyOptionsInterface => Boolean): Self = this.set("verify", js.Any.fromFunction1(value))
  }
  
}

