package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackObject extends js.Object {
  var close: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var open: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var set: js.UndefOr[js.Function1[/* thingSet */ js.Any, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object CallbackObject {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit] = null,
    open: js.Function0[scala.Unit] = null,
    render: js.Function0[scala.Unit] = null,
    set: js.Function1[/* thingSet */ js.Any, scala.Unit] = null,
    start: js.Function0[scala.Unit] = null,
    stop: js.Function0[scala.Unit] = null
  ): CallbackObject = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    if (render != null) __obj.updateDynamic("render")(render)
    if (set != null) __obj.updateDynamic("set")(set)
    if (start != null) __obj.updateDynamic("start")(start)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[CallbackObject]
  }
}

