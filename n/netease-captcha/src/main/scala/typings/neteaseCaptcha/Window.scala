package typings.neteaseCaptcha

import typings.neteaseCaptcha.NeteaseCaptcha.Config
import typings.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typings.neteaseCaptcha.NeteaseCaptcha.onError
import typings.neteaseCaptcha.NeteaseCaptcha.onLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var initNECaptcha: js.UndefOr[InitFunction] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    initNECaptcha: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Unit = null
  ): Window = {
    val __obj = js.Dynamic.literal()
    if (initNECaptcha != null) __obj.updateDynamic("initNECaptcha")(js.Any.fromFunction3(initNECaptcha))
    __obj.asInstanceOf[Window]
  }
}

