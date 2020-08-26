package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NvKeyboardDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.native
  var onKeyPress: js.UndefOr[js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]] = js.native
  var target: js.UndefOr[Element] = js.native
}

object NvKeyboardDefaults {
  @scala.inline
  def apply(): NvKeyboardDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvKeyboardDefaults]
  }
  @scala.inline
  implicit class NvKeyboardDefaultsOps[Self <: NvKeyboardDefaults] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    @scala.inline
    def setOnKeyPress(value: (/* keysym */ String, /* code */ Double, /* down */ Boolean) => Unit): Self = this.set("onKeyPress", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

