package typings
package olLib.controlControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var element: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var render: js.UndefOr[js.Function1[/* param0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    element: stdLib.HTMLElement = null,
    render: /* param0 */ olLib.mapEventMod.default => scala.Unit = null,
    target: stdLib.HTMLElement | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

