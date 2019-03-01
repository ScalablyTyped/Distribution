package typings
package novncDashCoreLib.libInputDevicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvMouseDefaults extends js.Object {
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  var onMouseButton: js.UndefOr[
    js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* down */ scala.Boolean, 
      /* bmask */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseMove: js.UndefOr[js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var touchButton: js.UndefOr[scala.Double] = js.undefined
}

object NvMouseDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[scala.Boolean] = js.undefined,
    onMouseButton: js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* down */ scala.Boolean, 
      /* bmask */ scala.Double, 
      scala.Unit
    ] = null,
    onMouseMove: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = null,
    target: stdLib.Element = null,
    touchButton: scala.Int | scala.Double = null
  ): NvMouseDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (onMouseButton != null) __obj.updateDynamic("onMouseButton")(onMouseButton)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (target != null) __obj.updateDynamic("target")(target)
    if (touchButton != null) __obj.updateDynamic("touchButton")(touchButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvMouseDefaults]
  }
}

