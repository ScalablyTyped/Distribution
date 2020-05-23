package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvKeyboardDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var onKeyPress: js.UndefOr[js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object NvKeyboardDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    onKeyPress: (/* keysym */ String, /* code */ Double, /* down */ Boolean) => Unit = null,
    target: Element = null
  ): NvKeyboardDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction3(onKeyPress))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvKeyboardDefaults]
  }
}

