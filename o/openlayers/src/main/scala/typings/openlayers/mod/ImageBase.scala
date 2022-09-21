package typings.openlayers.mod

import typings.openlayers.mod.events.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "ImageBase")
@js.native
open class ImageBase protected () extends EventTarget {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param state State.
    * @param attributions Attributions.
    */
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    state: ImageState,
    attributions: js.Array[Attribution]
  ) = this()
}
