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

