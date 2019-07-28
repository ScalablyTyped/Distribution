package typings.neteaseDashCaptcha

import typings.neteaseDashCaptcha.NeteaseCaptchaNs.InitFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var initNECaptcha: js.UndefOr[InitFunction] = js.undefined
}

object Window {
  @scala.inline
  def apply(initNECaptcha: InitFunction = null): Window = {
    val __obj = js.Dynamic.literal()
    if (initNECaptcha != null) __obj.updateDynamic("initNECaptcha")(initNECaptcha)
    __obj.asInstanceOf[Window]
  }
}

