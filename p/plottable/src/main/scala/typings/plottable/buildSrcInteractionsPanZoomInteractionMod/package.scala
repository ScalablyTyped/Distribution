package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsPanZoomInteractionMod {
  import typings.std.WheelEvent

  type PanCallback = js.Function0[Unit]
  type PanZoomUpdateCallback = js.Function0[Unit]
  type WheelFilter = js.Function1[/* wheelEvent */ WheelEvent, Boolean]
  type ZoomCallback = js.Function0[Unit]
}
