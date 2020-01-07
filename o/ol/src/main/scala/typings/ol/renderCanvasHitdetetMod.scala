package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.styleStyleMod.StyleFunction
import typings.ol.transformMod.Transform
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/hitdetet", JSImport.Namespace)
@js.native
object renderCanvasHitdetetMod extends js.Object {
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: js.UndefOr[scala.Nothing],
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = js.native
}

