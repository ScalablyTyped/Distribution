package typings.pickadate.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackObject extends js.Object {
  var close: js.UndefOr[js.Function0[Unit]] = js.undefined
  var open: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  var set: js.UndefOr[js.Function1[/* thingSet */ js.Any, Unit]] = js.undefined
  var start: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbackObject {
  @scala.inline
  def apply(
    close: () => Unit = null,
    open: () => Unit = null,
    render: () => Unit = null,
    set: /* thingSet */ js.Any => Unit = null,
    start: () => Unit = null,
    stop: () => Unit = null
  ): CallbackObject = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction0(close))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction0(open))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction0(start))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction0(stop))
    __obj.asInstanceOf[CallbackObject]
  }
}

