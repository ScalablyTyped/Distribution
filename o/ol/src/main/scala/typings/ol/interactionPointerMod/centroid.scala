package typings.ol.interactionPointerMod

import typings.ol.pixelMod.Pixel
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Pointer", "centroid")
@js.native
object centroid extends js.Object {
  def apply(pointerEvents: js.Array[PointerEvent]): Pixel = js.native
}

