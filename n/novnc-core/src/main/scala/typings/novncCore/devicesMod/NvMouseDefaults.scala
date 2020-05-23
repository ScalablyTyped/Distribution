package typings.novncCore.devicesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvMouseDefaults extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var onMouseButton: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
  ] = js.undefined
  var onMouseMove: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var touchButton: js.UndefOr[Double] = js.undefined
}

object NvMouseDefaults {
  @scala.inline
  def apply(
    focused: js.UndefOr[Boolean] = js.undefined,
    onMouseButton: (/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double) => Unit = null,
    onMouseMove: (/* x */ Double, /* y */ Double) => Unit = null,
    target: Element = null,
    touchButton: js.UndefOr[Double] = js.undefined
  ): NvMouseDefaults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (onMouseButton != null) __obj.updateDynamic("onMouseButton")(js.Any.fromFunction4(onMouseButton))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(touchButton)) __obj.updateDynamic("touchButton")(touchButton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvMouseDefaults]
  }
}

