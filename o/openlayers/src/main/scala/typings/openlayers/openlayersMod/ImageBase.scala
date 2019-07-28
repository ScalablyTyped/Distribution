package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.eventsNs.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "ImageBase")
@js.native
class ImageBase protected () extends EventTarget {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param state State.
    * @param attributions Attributions.
    */
  def this(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    state: ImageState,
    attributions: js.Array[Attribution]
  ) = this()
}

