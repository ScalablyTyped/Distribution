package typings.neteaseCaptcha

import typings.neteaseCaptcha.NeteaseCaptcha.Config
import typings.neteaseCaptcha.NeteaseCaptcha.InitFunction
import typings.neteaseCaptcha.NeteaseCaptcha.onError
import typings.neteaseCaptcha.NeteaseCaptcha.onLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var initNECaptcha: js.UndefOr[InitFunction] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def setInitNECaptcha(
      value: (/* config */ Config, /* onLoad */ js.UndefOr[onLoad], /* onError */ js.UndefOr[onError]) => Unit
    ): Self = this.set("initNECaptcha", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInitNECaptcha: Self = this.set("initNECaptcha", js.undefined)
  }
  
}

