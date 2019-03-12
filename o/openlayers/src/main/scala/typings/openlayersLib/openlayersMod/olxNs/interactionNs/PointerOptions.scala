package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerOptions extends js.Object {
  var handleDownEvent: js.UndefOr[
    js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean]
  ] = js.undefined
  var handleDragEvent: js.UndefOr[
    js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean]
  ] = js.undefined
  var handleEvent: js.UndefOr[
    js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean]
  ] = js.undefined
  var handleMoveEvent: js.UndefOr[
    js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean]
  ] = js.undefined
  var handleUpEvent: js.UndefOr[
    js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean]
  ] = js.undefined
}

object PointerOptions {
  @scala.inline
  def apply(
    handleDownEvent: /* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent => scala.Boolean = null,
    handleDragEvent: /* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent => scala.Boolean = null,
    handleEvent: /* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent => scala.Boolean = null,
    handleMoveEvent: /* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent => scala.Boolean = null,
    handleUpEvent: /* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent => scala.Boolean = null
  ): PointerOptions = {
    val __obj = js.Dynamic.literal()
    if (handleDownEvent != null) __obj.updateDynamic("handleDownEvent")(js.Any.fromFunction1(handleDownEvent))
    if (handleDragEvent != null) __obj.updateDynamic("handleDragEvent")(js.Any.fromFunction1(handleDragEvent))
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(js.Any.fromFunction1(handleEvent))
    if (handleMoveEvent != null) __obj.updateDynamic("handleMoveEvent")(js.Any.fromFunction1(handleMoveEvent))
    if (handleUpEvent != null) __obj.updateDynamic("handleUpEvent")(js.Any.fromFunction1(handleUpEvent))
    __obj.asInstanceOf[PointerOptions]
  }
}

