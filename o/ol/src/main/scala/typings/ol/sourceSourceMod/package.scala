package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourceSourceMod {
  import typings.ol.pluggableMapMod.FrameState

  type Attribution = js.Function1[/* p0 */ FrameState, String | js.Array[String]]
  type AttributionLike = String | js.Array[String] | Attribution
}
