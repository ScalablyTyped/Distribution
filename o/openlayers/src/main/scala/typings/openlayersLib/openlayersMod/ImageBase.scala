package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "ImageBase")
@js.native
class ImageBase protected ()
  extends openlayersLib.openlayersMod.eventsNs.EventTarget {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param state State.
    * @param attributions Attributions.
    */
  def this(extent: Extent, resolution: scala.Double, pixelRatio: scala.Double, state: ImageState, attributions: js.Array[Attribution]) = this()
}

