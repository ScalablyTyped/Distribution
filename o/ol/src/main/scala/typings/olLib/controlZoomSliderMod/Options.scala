package typings
package olLib.controlZoomSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    render: /* p0 */ olLib.mapEventMod.default => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Options]
  }
}

