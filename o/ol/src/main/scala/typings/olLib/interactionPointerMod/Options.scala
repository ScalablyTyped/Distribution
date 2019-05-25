package typings
package olLib.interactionPointerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var handleDownEvent: js.UndefOr[
    js.Function1[/* param0 */ olLib.mapBrowserPointerEventMod.default, scala.Boolean]
  ] = js.undefined
  var handleDragEvent: js.UndefOr[js.Function1[/* param0 */ olLib.mapBrowserPointerEventMod.default, scala.Unit]] = js.undefined
  var handleEvent: js.UndefOr[js.Function1[/* param0 */ olLib.mapBrowserEventMod.default, scala.Boolean]] = js.undefined
  var handleMoveEvent: js.UndefOr[js.Function1[/* param0 */ olLib.mapBrowserPointerEventMod.default, scala.Unit]] = js.undefined
  var handleUpEvent: js.UndefOr[
    js.Function1[/* param0 */ olLib.mapBrowserPointerEventMod.default, scala.Boolean]
  ] = js.undefined
  var stopDown: js.UndefOr[js.Function1[/* param0 */ scala.Boolean, scala.Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handleDownEvent: /* param0 */ olLib.mapBrowserPointerEventMod.default => scala.Boolean = null,
    handleDragEvent: /* param0 */ olLib.mapBrowserPointerEventMod.default => scala.Unit = null,
    handleEvent: /* param0 */ olLib.mapBrowserEventMod.default => scala.Boolean = null,
    handleMoveEvent: /* param0 */ olLib.mapBrowserPointerEventMod.default => scala.Unit = null,
    handleUpEvent: /* param0 */ olLib.mapBrowserPointerEventMod.default => scala.Boolean = null,
    stopDown: /* param0 */ scala.Boolean => scala.Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handleDownEvent != null) __obj.updateDynamic("handleDownEvent")(js.Any.fromFunction1(handleDownEvent))
    if (handleDragEvent != null) __obj.updateDynamic("handleDragEvent")(js.Any.fromFunction1(handleDragEvent))
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(js.Any.fromFunction1(handleEvent))
    if (handleMoveEvent != null) __obj.updateDynamic("handleMoveEvent")(js.Any.fromFunction1(handleMoveEvent))
    if (handleUpEvent != null) __obj.updateDynamic("handleUpEvent")(js.Any.fromFunction1(handleUpEvent))
    if (stopDown != null) __obj.updateDynamic("stopDown")(js.Any.fromFunction1(stopDown))
    __obj.asInstanceOf[Options]
  }
}

