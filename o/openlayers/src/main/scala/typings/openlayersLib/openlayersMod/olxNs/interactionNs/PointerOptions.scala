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
    handleDownEvent: js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean] = null,
    handleDragEvent: js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean] = null,
    handleEvent: js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean] = null,
    handleMoveEvent: js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean] = null,
    handleUpEvent: js.Function1[/* event */ openlayersLib.openlayersMod.MapBrowserPointerEvent, scala.Boolean] = null
  ): PointerOptions = {
    val __obj = js.Dynamic.literal()
    if (handleDownEvent != null) __obj.updateDynamic("handleDownEvent")(handleDownEvent)
    if (handleDragEvent != null) __obj.updateDynamic("handleDragEvent")(handleDragEvent)
    if (handleEvent != null) __obj.updateDynamic("handleEvent")(handleEvent)
    if (handleMoveEvent != null) __obj.updateDynamic("handleMoveEvent")(handleMoveEvent)
    if (handleUpEvent != null) __obj.updateDynamic("handleUpEvent")(handleUpEvent)
    __obj.asInstanceOf[PointerOptions]
  }
}

