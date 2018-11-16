package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcInteractionsPanZoomInteractionMod {
  type PanCallback = js.Function0[scala.Unit]
  type PanZoomUpdateCallback = js.Function0[scala.Unit]
  type WheelFilter = js.Function1[/* wheelEvent */ stdLib.WheelEvent, scala.Boolean]
  type ZoomCallback = js.Function0[scala.Unit]
}
