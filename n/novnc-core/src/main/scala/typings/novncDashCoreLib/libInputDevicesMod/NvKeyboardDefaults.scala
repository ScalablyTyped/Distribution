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

