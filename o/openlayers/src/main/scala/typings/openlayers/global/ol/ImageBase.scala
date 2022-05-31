package typings.openlayers.global.ol

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ImageState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.ImageBase")
@js.native
class ImageBase protected ()
  extends typings.openlayers.mod.ImageBase {
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
    attributions: js.Array[typings.openlayers.mod.Attribution]
  ) = this()
}
