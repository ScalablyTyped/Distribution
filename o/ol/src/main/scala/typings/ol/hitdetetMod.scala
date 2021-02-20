package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olMod.Transform
import typings.ol.pixelMod.Pixel
import typings.ol.sizeMod.Size
import typings.ol.styleStyleMod.StyleFunction
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hitdetetMod {
  
  @JSImport("ol/render/canvas/hitdetet", "createHitDetectionImageData")
  @js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: js.UndefOr[scala.Nothing],
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  @JSImport("ol/render/canvas/hitdetet", "createHitDetectionImageData")
  @js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  
  @JSImport("ol/render/canvas/hitdetet", "hitDetect")
  @js.native
  def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = js.native
}
