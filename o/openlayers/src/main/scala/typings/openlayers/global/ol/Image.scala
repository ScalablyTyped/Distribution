package typings.openlayers.global.ol

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.ImageLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Image")
@js.native
open class Image protected ()
  extends typings.openlayers.mod.Image {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param attributions Attributions.
    * @param src Image source URI.
    * @param crossOrigin Cross origin.
    * @param imageLoadFunction Image load function.
    */
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[typings.openlayers.mod.Attribution],
    src: String
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[typings.openlayers.mod.Attribution],
    src: String,
    crossOrigin: String
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[typings.openlayers.mod.Attribution],
    src: String,
    crossOrigin: String,
    imageLoadFunction: ImageLoadFunctionType
  ) = this()
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    attributions: js.Array[typings.openlayers.mod.Attribution],
    src: String,
    crossOrigin: Unit,
    imageLoadFunction: ImageLoadFunctionType
  ) = this()
}
