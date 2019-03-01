package typings
package novncDashCoreLib.libInputDevicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvKeyboardDefaults extends js.Object {
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyPress: js.UndefOr[
    js.Function3[
      /* keysym */ java.lang.String, 
      /* code */ scala.Double, 
      /* down */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
}

object NvKeyboardDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    onKeyPress: js.Function3[
      /* keysym */ java.lang.String, 
      /* code */ scala.Double, 
      /* down */ scala.Boolean, 
      scala.Unit
    ] = null,
    target: stdLib.Element = null
  ): NvKeyboardDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[NvKeyboardDefaults]
  }
}

